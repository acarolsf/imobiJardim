/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.atrib;

import static java.sql.Types.DATE;
import java.util.Date;

/**
 *
 * @author sergiany e carol
 */
public class Funcionario {
	private String cpf_func;
	private String nome;
	private String sexo;
	private Date data_nasc;
	private String cidade;
	private String telefone;
	private String email;
	private float salario;

	public Funcionario() {
		nome = "";
	}

	public Funcionario(String cpf_func, String nome, String sexo, Date data_nasc, String cidade, String telefone,
			String email, float salario) {
		this.cpf_func = cpf_func;
		this.nome = nome;
		this.sexo = sexo;
		this.data_nasc = data_nasc;
		this.cidade = cidade;
		this.telefone = telefone;
		this.email = email;
		this.salario = salario;

	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setCpf_func(String cpf_func) {
		this.cpf_func = cpf_func;
	}

	public String getCpf_func() {
		return cpf_func;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Date getData_nasc() {
		return data_nasc;
	}

	public void setData_nasc(Date data_nasc) {
		this.data_nasc = data_nasc;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

}
