/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dao;
//importacoes de outras bibliotecas que serao necessarias durante a classe

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.atrib.Login;
import br.com.conexao.ConexaoMySQL;
import javax.swing.JOptionPane;

/**
 *
 * @author sergiany e carol
 */
public class LoginDao {

	public static void editarUsuario(String login, String senha) {
		Connection con = ConexaoMySQL.getConexaoMySQL();
		try (PreparedStatement ps = con.prepareStatement("select editar_usuario(?,?);")) {
			ps.setString(1, login);
			ps.setString(2, senha);
			ps.execute();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

	public static List<Login> getTodosUsuarios() {
		Connection con = ConexaoMySQL.getConexaoMySQL();
		try (PreparedStatement ps = con.prepareStatement("select * from todos_usuarios();")) {
			ResultSet rs;
			rs = ps.executeQuery();
			List<Login> list = new ArrayList<>();
			while (rs.next()) {
				Login u = new Login();

				u.setUser(rs.getString("login"));
				u.setSenha(rs.getString("senha"));
				list.add(u);
			}
			rs.close();
			return list;
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return null;
	}

	public boolean verificar(String user, String pass) throws SQLException {
		Connection con = ConexaoMySQL.getConexaoMySQL();
		try (PreparedStatement ps = con.prepareStatement("select * from usuario where login =?;")) {
			ResultSet rs;
			ps.setString(1, user);
			rs = ps.executeQuery();
			rs.next();
			if (user == rs.getString("login") || pass == rs.getString("senha")) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Usuario ou senha incorretos!");
		}
		return false;

	}

	public static Login getUsuario(String user) {
		Connection con = ConexaoMySQL.getConexaoMySQL();
		try (PreparedStatement ps = con.prepareStatement("select * from usuario where login=?;")) {
			ResultSet rs;
			ps.setString(1, user);
			rs = ps.executeQuery();
			rs.next();
			Login u = new Login();
			u.setUser(rs.getString("login"));
			u.setSenha(rs.getString("senha"));
			rs.close();
			return u;
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return null;
	}
}
