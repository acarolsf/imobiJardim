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

import java.util.List;

public interface ImovelInterface {
	// declaracao dos metodos que serao usados na classe ImovelDao
	public void inserir(Imovel imovel);

	public List<Imovel> getLista();

	public void altera(Imovel imovel);

	// public void busca(String tipo);
	public void excluir(int id);

	public void verTudo(Imovel imovel);
}
