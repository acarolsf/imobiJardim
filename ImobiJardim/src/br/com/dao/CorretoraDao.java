/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dao;

import br.com.conexao.ConnectionFactory;
import br.com.atrib.Corretora;
import janelas.TelaImprimeCorretora;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Ana Carolina
 */
public class CorretoraDao {
	private Connection connection; // conexao com a base de dados

	// construtor
	public CorretoraDao() {
		this.connection = new ConnectionFactory().getConnection();
	}

	// busca a lista no banco de dados e armazena numa variavel lista usada para a
	// manipulacao
	public List<Corretora> getLista() {
		// TODO Auto-generated method stub
		try {
			List<Corretora> corretoras = new ArrayList<Corretora>(); // instancia a variavel
			PreparedStatement stmt = connection.prepareStatement("select * from corretora"); // estabelece a conexao
			ResultSet rs = stmt.executeQuery(); // executa a conexao

			// preenchendo as variaveis com os dados do banco
			while (rs.next()) {
				Corretora s = new Corretora();
				s.setId_corretora(rs.getInt("id_corretora"));
				s.setNome(rs.getString("nome"));
				s.setCidade(rs.getString("cidade"));
				s.setTelefone(rs.getString("telefone"));
				s.setEmail(rs.getString("email"));
				s.setCnpj(rs.getInt("cnpj"));
				corretoras.add(s);
			}
			rs.close();
			stmt.close();
			return corretoras; // retorna os dados
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Nao foi possivel carregar a base de dados. ERRO: " + e);
		}
		return null;
	}

	// metodo de inserir um novo imovel
	public void inserir(Corretora corretoras) {
		// TODO Auto-generated method stub
		String sql = "insert into corretora" + "(nome, cidade,telefone,email, cnpj)" + "values(?,?,?,?,?)";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			// stmt.setInt(1, corretoras.getId_corretora());
			stmt.setString(1, corretoras.getNome());
			stmt.setString(2, corretoras.getCidade());
			stmt.setString(3, corretoras.getTelefone());
			stmt.setString(4, corretoras.getEmail());
			stmt.setInt(5, corretoras.getCnpj());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Corretora nao inserido\n" + e);
		}
	}

	// metodo de alterar
	public void altera(Corretora corretoras) {
		// TODO Auto-generated method stub

		String sql = "update corretora set nome=?, cidade=?,telefone=?,email=? where cnpj=?";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(5, corretoras.getCnpj());

			stmt.setString(1, corretoras.getNome());
			stmt.setString(2, corretoras.getCidade());
			stmt.setString(3, corretoras.getTelefone());
			stmt.setString(4, corretoras.getEmail());

			stmt.executeUpdate(sql); // executa no banco p alterar
			stmt.close(); // fecha a conexao
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Corretora nao alterada!\n" + e);
		}
	}

	public void busca(String nome) {
		// TODO Auto-generated method stub

		String sql = "select * from corretora where nome = ?";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				stmt.setString(0, nome);
			}
			TelaImprimeCorretora aa = new TelaImprimeCorretora(/* getLista() */);
			aa.setVisible(true);
			rs.close();
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Corretora nao encontrado!\n" + e);
		}
	}

	// metodo de excluir um imovel pelo ID
	public void excluir(String nome) {
		// TODO Auto-generated method stub
		try {
			PreparedStatement stmt = connection
					.prepareStatement("SET SQL_SAFE_UPDATES = 0; delete from corretora where nome=?");
			stmt.setString(1, nome);
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Corretora nao excluido!\n" + e);
			;
		}
	}

	// metodo de imprimir todos os dados na tela
	public void verTudo(Corretora corretora) {
		TelaImprimeCorretora aa = new TelaImprimeCorretora(/* getLista() */);
		aa.setVisible(true);
	}

}
