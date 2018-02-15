/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dao;

/**
 *
 * @author sergiany e carol
 */
import java.util.Arrays;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import br.com.atrib.Imovel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ImovelTableModel extends AbstractTableModel {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private List<Imovel> listaImoveis;
	private List<String> colunas;
	private ImovelDao dao;

	public ImovelTableModel(ImovelDao dao) {
		DefaultTableModel model = new DefaultTableModel();

		JTable tabela = new JTable(model);

		this.dao = dao;
		this.listaImoveis = dao.getLista();
		this.colunas = Arrays.asList("Id Imovel", "Id_Corretora", "Nome", "Preco", "Banheiros", "Quartos", "Comodos",
				"Endereco", "Cidade", "Tipo");
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
		return listaImoveis.size();
	}

	// obter valores
	public Object getValueAt(int linha, int coluna) {
		// TODO Auto-generated method stub
		Imovel imovel = listaImoveis.get(linha);
		switch (coluna) {
		case 0:
			return imovel.getId_imovel();
		case 1:
			return imovel.getNome();
		case 2:
			return imovel.getId_corretora();
		case 3:
			return imovel.getPreco();
		case 4:
			return imovel.getQtd_banheiro();
		case 5:
			return imovel.getQtd_quarto();
		case 6:
			return imovel.getQtd_comodos();
		case 7:
			return imovel.getEndereco();
		case 8:
			return imovel.getCidade();
		case 9:
			return imovel.getTipo();
		}
		return null;
	}

	// setar valores
	public void setValueAt(Object aValue, int linha, int coluna) {
		Imovel imovel = listaImoveis.get(linha);

		switch (coluna) {
		case 1:
			imovel.setNome((String) aValue);
			break;
		case 2:
			imovel.setId_imovel(Integer.parseInt((String) aValue));
			break;
		case 3:
			imovel.setPreco(Float.parseFloat((String) aValue));
			break;
		case 4:
			imovel.setQtd_banheiro(Integer.parseInt((String) aValue));
			break;
		case 5:
			imovel.setQtd_quarto(Integer.parseInt((String) aValue));
			break;
		case 6:
			imovel.setQtd_comodos(Integer.parseInt((String) aValue));
			break;
		case 7:
			imovel.setEndereco((String) aValue);
			break;
		case 8:
			imovel.setCidade((String) aValue);
			break;
		case 9:
			imovel.setTipo((String) aValue);
			break;
		case 10:
			imovel.setId_corretora(Integer.parseInt((String) aValue));
			break;
		default:
			throw new IndexOutOfBoundsException("Indice da coluna fora dos limites!");
		}

		dao.altera(imovel);
		fireTableCellUpdated(coluna, coluna);

	}

	public boolean isCellEditable(int linha, int coluna) {
		return true;
	}

	public boolean deleteLine(int linha) {
		return true;
	}

}
