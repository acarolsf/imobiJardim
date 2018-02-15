/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dao;

import br.com.atrib.Funcionario;
import br.com.atrib.FuncionarioInterface;
import br.com.conexao.ConnectionFactory;
import janelas.TelaImprimeFuncionarios;
import java.sql.Connection;
import java.sql.Date;
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
public class FuncionarioDao implements FuncionarioInterface {

	private Connection connection; // conexao com a base de dados

	// construtor
	public FuncionarioDao() {
		this.connection = new ConnectionFactory().getConnection();
	}

	// busca a lista no banco de dados e armazena numa variavel lista usada para a
	// manipulacao
	public List<Funcionario> getLista() {
		// TODO Auto-generated method stub
		try {
			List<Funcionario> func = new ArrayList<Funcionario>(); // instancia a variavel
			PreparedStatement stmt = connection.prepareStatement("select * from funcionario"); // estabelece a conexao
			ResultSet rs = stmt.executeQuery(); // executa a conexao

			// preenchendo as variaveis com os dados do banco
			while (rs.next()) {
				Funcionario s = new Funcionario();
				s.setCpf_func(rs.getString("cpf_func"));
				s.setNome(rs.getString("nome"));
				s.setSexo(rs.getString("sexo"));
				s.setData_nasc(rs.getDate("data_nasc"));
				s.setCidade(rs.getString("cidade"));
				s.setTelefone(rs.getString("telefone"));
				s.setEmail(rs.getString("email"));
				s.setSalario(rs.getFloat("salario"));
				func.add(s);
			}
			rs.close();
			stmt.close();
			return func; // retorna os dados
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Nao foi possivel carregar a base de dados. ERRO: " + e);
		}
		return null;
	}

	// metodo de inserir um novo imovel
	// public void inserir(Funcionario funcionario) {
	// // TODO Auto-generated method stub
	// String sql = "insert into funcionario" + "(cpf_func, nome, sexo, data_nasc,
	// cidade, telefone, email, salario)" + "values(?,?,?,?,?,?,?,?)";
	//
	// try{
	// PreparedStatement stmt = connection.prepareStatement(sql);
	// stmt.setString(1, funcionario.getCpf_func());
	// stmt.setString(2, funcionario.getNome());
	// stmt.setString(3, funcionario.getSexo());
	// stmt.setDate(4, (Date) funcionario.getData_nasc());
	// stmt.setString(5, funcionario.getCidade());
	// stmt.setString(6, funcionario.getTelefone());
	// stmt.setString(7, funcionario.getEmail());
	// stmt.setFloat(8, funcionario.getSalario());
	// stmt.execute();
	// stmt.close();
	// }catch(SQLException e){
	// JOptionPane.showMessageDialog(null,"Funcionario nao inserido\n" + e);
	// }
	// }
	//
	//
	// metodo de alterar um imovel
	public void altera(Funcionario funcionario) {
		// TODO Auto-generated method stub

		String sql = "update funcionario set nome=?, sexo=?, data_nasc=?, cidade=?, telefone=?, email=?, salario=?, id_usuario=? where cpf_func=?";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(9, funcionario.getCpf_func());

			stmt.setString(1, funcionario.getNome());
			stmt.setString(2, funcionario.getSexo());
			stmt.setDate(3, (Date) funcionario.getData_nasc());
			stmt.setString(4, funcionario.getCidade());
			stmt.setString(5, funcionario.getTelefone());
			stmt.setString(6, funcionario.getEmail());
			stmt.setFloat(7, funcionario.getSalario());

			stmt.executeUpdate(sql); // executa no banco p alterar
			stmt.close(); // fecha a conexao
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Funcionario nao alterado!\n" + e);
		}
	}

	// metodo de imprimir todos os dados na tela
	public void verTudo(Funcionario funcionario) {
		TelaImprimeFuncionarios aa = new TelaImprimeFuncionarios(/* getLista() */);
		aa.setVisible(true);
	}
}