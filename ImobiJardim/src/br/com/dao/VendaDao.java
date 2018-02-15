/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dao;

import br.com.atrib.Venda;
import br.com.atrib.VendaInterface;
import br.com.conexao.ConnectionFactory;
import janelas.TelaImprimeVenda;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author sergiany e carol
 */
public class VendaDao implements VendaInterface {
	private Connection connection; // conexao com a base de dados

	// construtor
	public VendaDao() {
		this.connection = new ConnectionFactory().getConnection();
	}

	// busca a lista no banco de dados e armazena numa variavel lista usada para a
	// manipulacao
	public List<Venda> getLista() {
		// TODO Auto-generated method stub
		try {
			List<Venda> vendas = new ArrayList<Venda>(); // instancia a variavel
			PreparedStatement stmt = connection.prepareStatement("select * from venda"); // estabelece a conexao
			ResultSet rs = stmt.executeQuery(); // executa a conexao

			// preenchendo as variaveis com os dados do banco
			while (rs.next()) {
				Venda s = new Venda();
				s.setId_venda(rs.getInt("id_venda"));
				s.setPreco(rs.getFloat("preco"));
				s.setData_venda(rs.getDate("data_venda"));
				s.setCpf_cli(rs.getString("cpf_cli"));
				vendas.add(s);
			}
			rs.close();
			stmt.close();
			return vendas; // retorna os dados
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Nao foi possivel carregar a base de dados. ERRO: " + e);
		}
		return null;
	}

	// metodo de inserir um novo imovel
	public void inserir(Venda venda) {
		// TODO Auto-generated method stub
		String sql = "insert into venda" + "(preco, data_venda, cpf_cli)" + "values(?,?,?)";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setFloat(1, venda.getPreco());
			stmt.setDate(2, (Date) venda.getData_venda());
			stmt.setString(3, venda.getCpf_cli());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Venda nao inserida\n" + e);
		}
	}

	// metodo de excluir um imovel pelo ID
	public void excluir(int id_venda) {
		// TODO Auto-generated method stub
		try {
			PreparedStatement stmt = connection.prepareStatement("delete from venda  where id_venda=?");
			stmt.setInt(1, id_venda);
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Venda nao excluida!\n" + e);
			;
		}
	}

	public void altera(Venda venda) {
		// TODO Auto-generated method stub

		String sql = "update venda set preco=?, cpf_cli=? where id_venda=?";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(3, venda.getId_venda());

			stmt.setFloat(1, venda.getPreco());
			stmt.setString(2, venda.getCpf_cli());

			stmt.executeUpdate(sql); // executa no banco p alterar
			stmt.close(); // fecha a conexao
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Venda nao alterado!\n" + e);
		}
	}

	// metodo de imprimir todos os dados na tela
	public void verTudo(Venda venda) {
		TelaImprimeVenda aa = new TelaImprimeVenda(/* getLista() */);
		aa.setVisible(true);
	}

	public static java.sql.Date formataData(String data) throws Exception {
		if (data == null || data.equals(""))
			return null;
		java.sql.Date date = null;
		try {
			DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
			date = new java.sql.Date(((java.util.Date) formatter.parse(data)).getTime());
		} catch (ParseException e) {
			throw e;
		}
		return date;
	}

}
