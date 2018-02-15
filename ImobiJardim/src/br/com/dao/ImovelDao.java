/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dao;

/**
 *
 * @author sergiany e carol
 */

//importacoes de outras bibliotecas que serao necessarias durante a classe
import janelas.TelaImprimeImovel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import javax.swing.JOptionPane;

import br.com.conexao.ConnectionFactory;
import br.com.atrib.Imovel;
import br.com.atrib.ImovelInterface;

public class ImovelDao implements ImovelInterface {
	private Connection connection; // conexao com a base de dados

	// construtor
	public ImovelDao() {
		this.connection = new ConnectionFactory().getConnection();
	}

	// busca a lista no banco de dados e armazena numa variavel lista usada para a
	// manipulacao
	public List<Imovel> getLista() {
		// TODO Auto-generated method stub
		try {
			List<Imovel> imoveis = new ArrayList<Imovel>(); // instancia a variavel
			PreparedStatement stmt = connection.prepareStatement("select * from imovel"); // estabelece a conexao
			ResultSet rs = stmt.executeQuery(); // executa a conexao

			// preenchendo as variaveis com os dados do banco
			while (rs.next()) {
				Imovel s = new Imovel();
				s.setId_imovel(rs.getInt("id_imovel"));
				s.setId_corretora(rs.getInt("id_corretora"));
				s.setNome(rs.getString("nome"));
				s.setPreco(rs.getFloat("preco"));
				s.setQtd_quarto(rs.getInt("qtd_quarto"));
				s.setQtd_banheiro(rs.getInt("qtd_banheiro"));
				s.setQtd_comodos(rs.getInt("qtd_comodos"));
				s.setEndereco(rs.getString("endereco"));
				s.setCidade(rs.getString("cidade"));
				s.setTipo(rs.getString("tipo"));
				imoveis.add(s);
			}
			rs.close();
			stmt.close();
			return imoveis; // retorna os dados
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Nao foi possivel carregar a base de dados. ERRO: " + e);
		}
		return null;
	}

	// metodo de inserir um novo imovel
	public void inserir(Imovel imovel) {
		// TODO Auto-generated method stub
		String sql = "insert into imovel"
				+ "(id_corretora, nome, preco,qtd_quarto, qtd_banheiro, qtd_comodos, endereco, cidade, tipo)"
				+ "values(?,?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(1, imovel.getId_corretora());
			stmt.setString(2, imovel.getNome());
			stmt.setFloat(3, imovel.getPreco());
			stmt.setInt(4, imovel.getQtd_quarto());
			stmt.setInt(5, imovel.getQtd_banheiro());
			stmt.setInt(6, imovel.getQtd_comodos());
			stmt.setString(7, imovel.getEndereco());
			stmt.setString(8, imovel.getCidade());
			stmt.setString(9, imovel.getTipo());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Imovel nao inserido\n" + e);
		}
	}

	// metodo de alterar um imovel
	public void altera(Imovel imovel) {
		// TODO Auto-generated method stub

		String sql = "update imovel" + "set preco=?, qtd_quarto=?, qtd_banheiro=?, qtd_comodos=?,cidade=?, endereco=?"
				+ "where id_imovel=?";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(8, imovel.getId_imovel());

			// stmt.setInt(1, imovel.getId_corretora());
			stmt.setFloat(1, imovel.getPreco());
			stmt.setInt(2, imovel.getQtd_quarto());
			stmt.setInt(3, imovel.getQtd_banheiro());
			stmt.setInt(4, imovel.getQtd_comodos());
			stmt.setString(5, imovel.getCidade());
			stmt.setString(6, imovel.getEndereco());

			// stmt.setString(7, imovel.getTipo());

			stmt.executeUpdate(sql); // executa no banco p alterar
			stmt.close(); // fecha a conexao
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Imovel nao alterado!\n" + e);
		}
	}

	// //metodo de buscar um imovel pelo tipo
	// public void busca(String tipo) {
	// // TODO Auto-generated method stub
	//
	// String sql = "select * from imovel where tipo = ?";
	// try{
	// PreparedStatement stmt = connection.prepareStatement(sql);
	// ResultSet rs = stmt.executeQuery();
	//
	// while(rs.next()){
	// stmt.setString(1, tipo);
	//
	// }
	// TelaImprimeImovel aa = new TelaImprimeImovel(/*getLista()*/);
	// aa.setVisible(true);
	// rs.close();
	// stmt.execute();
	// stmt.close();
	// }catch(SQLException e){
	// JOptionPane.showMessageDialog(null, "Imovel nao encontrado!\n" + e);
	// }
	// }

	// metodo de excluir um imovel pelo ID
	public void excluir(int id) {
		// TODO Auto-generated method stub
		try {
			PreparedStatement stmt = connection.prepareStatement("delete from imovel where id_imovel=?");
			stmt.setInt(1, id);
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Imovel nao excluido!\n" + e);
			;
		}
	}

	// metodo de imprimir todos os dados na tela
	public void verTudo(Imovel imovel) {
		TelaImprimeImovel aa = new TelaImprimeImovel(/* getLista() */);
		aa.setVisible(true);
	}
}