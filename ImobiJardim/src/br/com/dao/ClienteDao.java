/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dao;

import br.com.atrib.Cliente;
import br.com.atrib.ClienteInterface;
import br.com.conexao.ConnectionFactory;
import janelas.TelaImprimeCliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author sergiany e carol
 */
public class ClienteDao implements ClienteInterface {
	private Connection connection; // conexao com a base de dados

	// construtor
	public ClienteDao() {
		this.connection = new ConnectionFactory().getConnection();
	}

	// busca a lista no banco de dados e armazena numa variavel lista usada para a
	// manipulacao
	public List<Cliente> getLista() {
		// TODO Auto-generated method stub
		try {
			List<Cliente> clientes = new ArrayList<Cliente>(); // instancia a variavel
			PreparedStatement stmt = connection.prepareStatement("select * from cliente"); // estabelece a conexao
			ResultSet rs = stmt.executeQuery(); // executa a conexao

			// preenchendo as variaveis com os dados do banco
			while (rs.next()) {
				Cliente s = new Cliente();
				s.setNome(rs.getString("nome"));
				s.setCpf_cliente(rs.getString("cpf_cli"));
				s.setRG(rs.getString("RG"));
				s.setCidade(rs.getString("cidade"));
				s.setTelefone(rs.getString("telefone"));
				clientes.add(s);
			}
			rs.close();
			stmt.close();
			return clientes; // retorna os dados
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Nao foi possivel carregar a base de dados. ERRO: " + e);
		}
		return null;
	}

	// metodo de inserir um novo imovel
	public void inserir(Cliente cliente) {
		// TODO Auto-generated method stub
		String sql = "insert into cliente" + "(nome, cpf_cli, RG, cidade, telefone)" + "values(?,?,?,?,?)";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, cliente.getNome());
			stmt.setString(2, cliente.getCpf_cliente());
			stmt.setString(3, cliente.getRG());
			stmt.setString(4, cliente.getCidade());
			stmt.setString(5, cliente.getTelefone());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Cliente nao inserido\n" + e);
		}
	}

	// metodo de alterar um imovel
	public void altera(Cliente cliente) {
		// TODO Auto-generated method stub

		String sql = "update cliente set cidade =?, telefone =? where cliente.cpf_cli = ?";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(3, cliente.getCpf_cliente());

			stmt.setString(1, cliente.getCidade());
			stmt.setString(2, cliente.getTelefone());

			stmt.executeUpdate(sql); // executa no banco p alterar
			stmt.close(); // fecha a conexao
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Cliente nao alterado!\n" + e);
		}
	}

	// metodo de buscar um imovel pelo tipo
	// public void busca(String nome) {
	// // TODO Auto-generated method stub
	//
	// String sql = "select * from cliente where nome = ?";
	// try{
	// PreparedStatement stmt = connection.prepareStatement(sql);
	// ResultSet rs = stmt.executeQuery();
	//
	// while(rs.next()){
	// stmt.setString(0, nome);
	// //stmt.setInt(1, imovel.getId_imovel());
	// /*stmt.setString(2, imovel.getNome());
	// stmt.setFloat(3, imovel.getPreco());
	// stmt.setInt(4, imovel.getQtd_quarto());
	// stmt.setInt(5, imovel.getQtd_banheiro());
	// stmt.setInt(6, imovel.getQtd_comodos());
	// stmt.setString(7, imovel.getEndereco());
	// stmt.setString(8, imovel.getCidade());*/
	// //stmt.setString(10, imovel.getId_corretora());
	// }
	// TelaImprimeCliente aa = new TelaImprimeCliente(/*getLista()*/);
	// aa.setVisible(true);
	// rs.close();
	// stmt.execute();
	// stmt.close();
	// }catch(SQLException e){
	// JOptionPane.showMessageDialog(null, "Cliente nao encontrado!\n" + e);
	// }
	// }

	// metodo de excluir um imovel pelo ID
	public void excluir(String cpf_cliente) {
		// TODO Auto-generated method stub
		try {
			PreparedStatement stmt = connection.prepareStatement("delete from cliente where cpf_cli=?");
			stmt.setString(1, cpf_cliente);
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Cliente nao excluido!\n" + e);
			;
		}
	}

	// metodo de imprimir todos os dados na tela
	public void verTudo(Cliente cliente) {
		TelaImprimeCliente aa = new TelaImprimeCliente(/* getLista() */);
		aa.setVisible(true);
	}
}
