/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dao;

import br.com.atrib.Cliente;
import java.util.Arrays;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sergiany e carol
 */
public class ClienteTableModel extends AbstractTableModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Cliente> listaClientes;
	private List<String> colunas;
	private ClienteDao dao;

	public ClienteTableModel(ClienteDao dao) {
		DefaultTableModel model = new DefaultTableModel();
		JTable table = new JTable(model);

		this.dao = dao;
		this.listaClientes = dao.getLista();
		this.colunas = Arrays.asList("Nome", "Cpf Cliente", "RG", "Cidade", "Telefone");
	}

	// obter o tamanho da coluna
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return colunas.size();
	}

	// obter o tanto de linhas
	public int getRowCount() {
		// TODO Auto-generated method stub
		return listaClientes.size();
	}

	// obter valores
	public Object getValueAt(int linha, int coluna) {
		// TODO Auto-generated method stub
		Cliente cliente = listaClientes.get(linha);
		switch (coluna) {
		case 0:
			return cliente.getNome();
		case 1:
			return cliente.getCpf_cliente();
		case 2:
			return cliente.getRG();
		case 3:
			return cliente.getCidade();
		case 4:
			return cliente.getTelefone();
		}
		return null;
	}

	// setar valores
	public void setValueAt(Object aValue, int linha, int coluna) {
		Cliente cliente = listaClientes.get(linha);

		switch (coluna) {
		case 1:
			cliente.setNome((String) aValue);
			break;
		case 2:
			cliente.setCpf_cliente((String) aValue);
			break;
		case 3:
			cliente.setRG((String) aValue);
			break;
		case 4:
			cliente.setCidade((String) aValue);
			break;
		case 5:
			cliente.setTelefone((String) aValue);
			break;

		default:
			throw new IndexOutOfBoundsException("Indice da coluna fora dos limites!");
		}

		dao.altera(cliente);
		fireTableCellUpdated(coluna, coluna);

	}

	public boolean isCellEditable(int linha, int coluna) {
		return true;
	}

	public boolean deleteLine(int linha) {
		return true;
	}
}
