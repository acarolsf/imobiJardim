/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.atrib;

import java.util.List;

/**
 *
 * @author sergiany e carol
 */
public interface FuncionarioInterface {
	// public void inserir(Funcionario funcionario);
	public List<Funcionario> getLista();

	public void altera(Funcionario funcionario);

	// public void busca(String cpf_func);
	// public void excluir(String cpf_func);
	public void verTudo(Funcionario funcionario);
}
