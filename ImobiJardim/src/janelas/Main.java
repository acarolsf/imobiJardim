/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package janelas;

import br.com.conexao.ConexaoMySQL;

import java.sql.SQLException;

import javax.swing.JOptionPane;

/**
 *
 * @author sergiany e carol
 */

public class Main {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		try {
			// abre a conexao com a base de dados
			// Connection conexao =
			// DriverManager.getConnection("jdbc:mysql://localhost:3306/imobiliariaJardim",
			// "root", "admin");
			// System.out.println("Conexao aberta!"); //dizer ao programador se que a
			// conexao com o banco foi estabelecida
			ConexaoMySQL conexaoMySQL = new ConexaoMySQL();
			// chama a tela de menu do software
			TelaInicio tl = new TelaInicio();
			tl.setVisible(true);
			// e dps de tudo, fecha a conexao com a base de dados
			// conexao.close();
		} catch (Exception e) {
			// se a conexao nao der certo, ira abrir uma mensagem avisando que a conexao nao
			// foi estabelecida com a base de dados
			JOptionPane.showMessageDialog(null, "O software nao consegue abrir\n" + e);
		}

	}

}
