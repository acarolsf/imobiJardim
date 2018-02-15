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
public interface VendaInterface {
	public void inserir(Venda venda);

	public List<Venda> getLista();

	public void altera(Venda venda);

	// public void busca(String cpf_cli);
	public void excluir(int id_venda);

	public void verTudo(Venda venda);

}
