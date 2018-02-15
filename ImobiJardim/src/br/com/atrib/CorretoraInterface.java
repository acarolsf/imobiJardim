/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.atrib;

import java.util.List;

/**
 *
 * @author sergiany e carols
 */
public interface CorretoraInterface {
	public void inserir(Corretora corretora);

	public List<Corretora> getLista();

	public void altera(Corretora corretora);

	public void busca(Corretora corretora);

	public void excluir(String nome);

	public void verTudo(Corretora corretora);
}
