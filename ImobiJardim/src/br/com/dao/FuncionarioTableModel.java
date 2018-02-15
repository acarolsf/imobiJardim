/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dao;

import br.com.atrib.Funcionario;
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
public class FuncionarioTableModel extends AbstractTableModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Funcionario> listaFuncionario;
	private List<String> colunas;
	private FuncionarioDao dao;

	public FuncionarioTableModel(FuncionarioDao dao) {
		DefaultTableModel model = new DefaultTableModel();
		JTable table = new JTable(model);

		this.dao = dao;
		this.listaFuncionario = dao.getLista();
		this.colunas = Arrays.asList("Cpf_func", "Nome", "Sexo", "Data_nasc", "Cidade", "Telefone", "Email", "Salario");
		model.addColumn(colunas);
	}

	// obter o tamanho da coluna
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return colunas.size();
	}

	// obter o tanto de linhas
	public int getRowCount() {
		// TODO Auto-generated method stub
		return listaFuncionario.size();
	}

	// obter valores
	public Object getValueAt(int linha, int coluna) {
		// TODO Auto-generated method stub
		Funcionario funcionario = listaFuncionario.get(linha);
		switch (coluna) {
		case 0:
			return funcionario.getCpf_func();
		case 1:
			return funcionario.getNome();
		case 2:
			return funcionario.getSexo();
		case 3:
			return funcionario.getData_nasc();
		case 4:
			return funcionario.getCidade();
		case 5:
			return funcionario.getTelefone();
		case 6:
			return funcionario.getEmail();
		case 7:
			return funcionario.getSalario();
		}
		return null;
	}

	// setar valores
	public void setValueAt(Object aValue, int linha, int coluna) {
		Funcionario funcionario = listaFuncionario.get(linha);

		switch (coluna) {
		case 1:
			funcionario.setCpf_func((String) aValue);
			break;
		case 2:
			funcionario.setNome((String) aValue);
			break;
		case 3:
			funcionario.setSexo((String) aValue);
			break;
		case 4:
			funcionario.setData_nasc((Date) aValue);
			break;
		case 5:
			funcionario.setCidade((String) aValue);
			break;
		case 6:
			funcionario.setTelefone((String) aValue);
			break;
		case 7:
			funcionario.setEmail((String) aValue);
			break;
		case 8:
			funcionario.setSalario(Float.parseFloat((String) aValue));
			break;
		default:
			throw new IndexOutOfBoundsException("Indice da coluna fora dos limites!");
		}

		dao.altera(funcionario);
		fireTableCellUpdated(coluna, coluna);

	}

	public boolean isCellEditable(int linha, int coluna) {
		return true;
	}

	public boolean deleteLine(int linha) {
		return true;
	}

}
