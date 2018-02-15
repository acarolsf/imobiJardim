/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.atrib;

import java.util.Date;

/**
 *
 * @author sergiany e carol
 */
public class Venda {
	private int id_venda;
	private Float preco;
	private Date data_venda;
	private String cpf_cli;

	public Venda() {
		cpf_cli = "";
	}

	public Venda(int id_venda, float preco, Date data_venda, String cpf_cli) {
		this.id_venda = id_venda;

		this.preco = preco;
		this.data_venda = data_venda;
		this.cpf_cli = cpf_cli;
	}

	public int getId_venda() {
		return id_venda;
	}

	public void setId_venda(int id_venda) {
		this.id_venda = id_venda;
	}

	public Float getPreco() {
		return preco;
	}

	public void setPreco(Float preco) {
		this.preco = preco;
	}

	public Date getData_venda() {
		return data_venda;
	}

	public void setData_venda(Date data_venda) {
		this.data_venda = data_venda;
	}

	public String getCpf_cli() {
		return cpf_cli;
	}

	public void setCpf_cli(String cpf_cli) {
		this.cpf_cli = cpf_cli;
	}
}
