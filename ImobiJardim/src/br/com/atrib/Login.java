/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.atrib;

import java.util.Objects;

/**
 *
 * @author Ana Carolina
 */
public class Login {
	private String user;
	private String senha;

	public Login() {
		user = "";
		senha = "";
	}

	public Login(String user, String senha) {
		this.user = user;
		this.senha = senha;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getUser() {
		return user;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getSenha() {
		return senha;
	}

	@Override
	public String toString() {
		return "Usuario{" + ", nickname=" + user + ", senha=" + senha + '}';
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final Login other = (Login) obj;

		if (!Objects.equals(this.user, other.user)) {
			return false;
		}
		if (!Objects.equals(this.senha, other.senha)) {
			return false;
		}
		return true;
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 17 * hash + Objects.hashCode(this.user);
		hash = 17 * hash + Objects.hashCode(this.senha);
		return hash;
	}
}
