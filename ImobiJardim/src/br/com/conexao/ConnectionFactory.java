/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.conexao;

/**
 *
 * @author sergiany e carol
 */

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectionFactory {
	// metodo que estabelece a conexao entre a base de dados e o software
	public Connection getConnection() {
		try {
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException ex) {
				Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
			}
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/imobiliariajardim", "root", "admin");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}