/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dao;

import br.com.atrib.Venda;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sergiany e carol
 */
public class VendaTableModel extends AbstractTableModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Venda> listaVendas;
	private List<String> colunas;
	private VendaDao dao;

	public VendaTableModel(VendaDao dao) {
		DefaultTableModel model = new DefaultTableModel();
		JTable table = new JTable(model);

		this.dao = dao;
		this.listaVendas = dao.getLista();
		this.colunas = Arrays.asList("Id_venda", "Preco", "Data_venda", "Cpf_cli");
	}

	// obter o tamanho da coluna
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return colunas.size();
	}

	// obter o tanto de linhas
	public int getRowCount() {
		// TODO Auto-generated method stub
		return listaVendas.size();
	}

	// obter valores
	public Object getValueAt(int linha, int coluna) {
		// TODO Auto-generated method stub
		Venda venda = listaVendas.get(linha);
		switch (coluna) {
		case 0:
			return venda.getId_venda();
		case 1:
			return venda.getPreco();
		case 2:
			return venda.getData_venda();
		case 3:
			return venda.getCpf_cli();

		}
		return null;
	}

	// setar valores
	public void setValueAt(Object aValue, int linha, int coluna) {
		Venda venda = listaVendas.get(linha);

		switch (coluna) {
		case 1:
			venda.setId_venda(Integer.parseInt((String) aValue));
			break;
		case 2:
			venda.setPreco(Float.parseFloat((String) aValue));
			break;
		case 3:
			venda.setData_venda((Date) aValue);
			break;
		case 4:
			venda.setCpf_cli((String) aValue);
			break;

		default:
			throw new IndexOutOfBoundsException("Indice da coluna fora dos limites!");
		}

		dao.altera(venda);
		fireTableCellUpdated(coluna, coluna);

	}

	public boolean isCellEditable(int linha, int coluna) {
		return true;
	}

	public boolean deleteLine(int linha) {
		return true;
	}

}
