/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dao;

import br.com.atrib.Corretora;
import java.util.Arrays;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ana Carolina
 */
public class CorretoraTableModel extends AbstractTableModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Corretora> listaCorretoras;
	private List<String> colunas;
	private CorretoraDao dao;

	public CorretoraTableModel(CorretoraDao dao) {
		DefaultTableModel model = new DefaultTableModel();
		JTable table = new JTable(model);

		this.dao = dao;
		this.listaCorretoras = dao.getLista();
		this.colunas = Arrays.asList("Id_corretora", "Nome", "Cidade", "Telefone", "Email", "CNPJ");
	}

	// obter o tamanho da coluna
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return colunas.size();
	}

	// obter o tanto de linhas
	public int getRowCount() {
		// TODO Auto-generated method stub
		return listaCorretoras.size();
	}

	// obter valores
	public Object getValueAt(int linha, int coluna) {
		// TODO Auto-generated method stub
		Corretora corretora = listaCorretoras.get(linha);
		switch (coluna) {
		case 0:
			return corretora.getId_corretora();
		case 1:
			return corretora.getNome();
		case 2:
			return corretora.getCidade();
		case 3:
			return corretora.getTelefone();
		case 4:
			return corretora.getEmail();
		case 5:
			return corretora.getCnpj();
		}
		return null;
	}

	// setar valores
	public void setValueAt(Object aValue, int linha, int coluna) {
		Corretora corretora = listaCorretoras.get(linha);

		switch (coluna) {
		case 1:
			corretora.setId_corretora(Integer.parseInt((String) aValue));
			break;
		case 2:
			corretora.setNome((String) aValue);
			break;
		case 3:
			corretora.setCidade((String) aValue);
			break;
		case 4:
			corretora.setTelefone((String) aValue);
			break;
		case 5:
			corretora.setEmail((String) aValue);
			break;
		case 6:
			corretora.setCnpj(Integer.parseInt((String) aValue));
			break;

		default:
			throw new IndexOutOfBoundsException("Indice da coluna fora dos limites!");
		}

		dao.altera(corretora);
		fireTableCellUpdated(coluna, coluna);

	}

	public boolean isCellEditable(int linha, int coluna) {
		return true;
	}

	public boolean deleteLine(int linha) {
		return true;
	}
}
