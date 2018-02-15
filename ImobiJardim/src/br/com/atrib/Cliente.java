/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.atrib;

/**
 *
 * @author sergiany e carol
 */
public class Cliente {
	private String nome;
	private String cpf_cliente;
	private String RG;
	private String cidade;
	private String telefone;

	public Cliente() {
		nome = "";
	}

	public Cliente(String nome, String cpf_cliente, String RG, String cidade, String telefone) {
		this.nome = nome;
		this.cpf_cliente = cpf_cliente;
		this.RG = RG;
		this.cidade = cidade;
		this.telefone = telefone;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setCpf_cliente(String cpf_cliente) {
		this.cpf_cliente = cpf_cliente;
	}

	public String getCpf_cliente() {
		return cpf_cliente;
	}

	public void setRG(String RG) {
		this.RG = RG;
	}

	public String getRG() {
		return RG;
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

}
