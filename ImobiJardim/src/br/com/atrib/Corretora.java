/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.atrib;

/**
 *
 * @author Ana Carolina
 */
public class Corretora {
	// declaracao de todas as variaveis que vai armazenar os atributos necessarios
	private int id_corretora;
	private String nome;
	private String cidade;
	private String telefone;
	private String email;
	private int cnpj;

	// construtores
	public Corretora() {
		nome = "";
	}

	public Corretora(int id_corretora, String nome, String cidade, String telefone, String email, int cnpj) {
		this.id_corretora = id_corretora;
		this.nome = nome;
		this.cidade = cidade;
		this.telefone = telefone;
		this.email = email;
		this.cnpj = cnpj;

	}

	// getters e setters de cada variavel
	public void setId_corretora(int id_corretora) {
		this.id_corretora = id_corretora;
	}

	public int getId_corretora() {
		return id_corretora;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getCidade() {
		return cidade;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}

	public int getCnpj() {
		return cnpj;
	}

}
