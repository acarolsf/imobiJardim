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
public class Imovel {
	// declaracao de todas as variaveis que vai armazenar os atributos necessarios
	private int id_imovel;
	private int id_corretora;
	private float preco;
	private String nome;
	private int qtd_quarto;
	private int qtd_banheiro;
	private int qtd_comodos;
	private String endereco;
	private String cidade;
	// private String estado;
	private String tipo;

	// construtores
	public Imovel() {

		nome = "";
		tipo = "";
	}

	public Imovel(int id, int idC, float valor, String nome, int quartos, int banheiros, int comodos, String end,
			String cid, String est, String tip) {
		this.id_imovel = id;
		this.id_corretora = idC;
		this.preco = valor;
		this.nome = nome;
		this.qtd_quarto = quartos;
		this.qtd_banheiro = banheiros;
		this.qtd_comodos = comodos;
		this.endereco = end;
		this.cidade = cid;
		// this.estado = est;
		this.tipo = tip;
	}

	// getters e setters de cada variavel
	public void setId_imovel(int id_imovel) {
		this.id_imovel = id_imovel;
	}

	public int getId_imovel() {
		return id_imovel;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public float getPreco() {
		return preco;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setQtd_quarto(int qtd_quarto) {
		this.qtd_quarto = qtd_quarto;
	}

	public int getQtd_quarto() {
		return qtd_quarto;
	}

	public void setQtd_banheiro(int qtd_banheiro) {
		this.qtd_banheiro = qtd_banheiro;
	}

	public int getQtd_banheiro() {
		return qtd_banheiro;
	}

	public void setQtd_comodos(int qtd_comodos) {
		this.qtd_comodos = qtd_comodos;
	}

	public int getQtd_comodos() {
		return qtd_comodos;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setId_corretora(int id_corretora) {
		this.id_corretora = id_corretora;
	}

	public int getId_corretora() {
		return id_corretora;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getCidade() {
		return cidade;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

}
