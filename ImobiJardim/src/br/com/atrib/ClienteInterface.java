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
public interface ClienteInterface {
	public void inserir(Cliente cliente);

	public List<Cliente> getLista();

	public void altera(Cliente cliente);

	// public void busca(String nome);
	public void excluir(String cpf_cliente);

	public void verTudo(Cliente cliente);
}
