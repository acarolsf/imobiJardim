/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package janelas;

import br.com.dao.ImovelDao;
import br.com.dao.ImovelTableModel;
import java.awt.FlowLayout;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;

/**
 *
 * @author Ana Carolina
 */
public class TelaImprimeImovel extends javax.swing.JFrame {

	/**
	 * Creates new form TelaImprimeImovel
	 */
	ImovelDao dao = new ImovelDao();
	TableModelListener tl = new TableModelListener() {
		@Override
		public void tableChanged(TableModelEvent tme) {
			throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods,
																			// choose Tools | Templates.
		}
	};

	public TelaImprimeImovel() {
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jLabel6 = new javax.swing.JLabel();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();
		btSair = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setBackground(new java.awt.Color(153, 255, 153));
		setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

		

		jLabel6.setFont(new java.awt.Font("SimSun", 0, 36)); // NOI18N
		jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/janelas/imagem.png"))); // NOI18N
		jLabel6.setText("Imóveis");
		jLabel6.setDebugGraphicsOptions(javax.swing.DebugGraphics.FLASH_OPTION);

		ImovelTableModel imovelTableModel = new ImovelTableModel(dao);
		imovelTableModel.addTableModelListener(tl);
		jTable1.setModel(imovelTableModel);
		setLayout(new FlowLayout());
		jScrollPane1.setViewportView(jTable1);
		add(jScrollPane1);
		setVisible(true);
		jTable1.getTableHeader().setReorderingAllowed(false);
		jScrollPane1.setViewportView(jTable1);

		btSair.setText("Voltar");
		btSair.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btSairActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGap(301, 301, 301).addComponent(btSair).addGap(0, 0,
						Short.MAX_VALUE))
				.addGroup(layout.createSequentialGroup().addGap(10, 10, 10)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 686, Short.MAX_VALUE))
						.addGap(10, 10, 10)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGap(33, 33, 33).addComponent(jLabel6).addGap(28, 28, 28)
						.addComponent(jScrollPane1).addGap(24, 24, 24).addComponent(btSair).addGap(11, 11, 11)));

		

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void btSairActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btSairActionPerformed
		// TODO add your handling code here:
		TelaInicio ti = new TelaInicio();
		ti.setVisible(true);
		dispose();
	}// GEN-LAST:event_btSairActionPerformed

	// /**
	// * @param args the command line arguments
	// */
	// public static void main(String args[]) {
	// /* Set the Nimbus look and feel */
	// //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code
	// (optional) ">
	// /* If Nimbus (introduced in Java SE 6) is not available, stay with the
	// default look and feel.
	// * For details see
	// http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
	// */
	// try {
	// for (javax.swing.UIManager.LookAndFeelInfo info :
	// javax.swing.UIManager.getInstalledLookAndFeels()) {
	// if ("Nimbus".equals(info.getName())) {
	// javax.swing.UIManager.setLookAndFeel(info.getClassName());
	// break;
	// }
	// }
	// } catch (ClassNotFoundException ex) {
	// java.util.logging.Logger.getLogger(TelaImprimeImovel.class.getName()).log(java.util.logging.Level.SEVERE,
	// null, ex);
	// } catch (InstantiationException ex) {
	// java.util.logging.Logger.getLogger(TelaImprimeImovel.class.getName()).log(java.util.logging.Level.SEVERE,
	// null, ex);
	// } catch (IllegalAccessException ex) {
	// java.util.logging.Logger.getLogger(TelaImprimeImovel.class.getName()).log(java.util.logging.Level.SEVERE,
	// null, ex);
	// } catch (javax.swing.UnsupportedLookAndFeelException ex) {
	// java.util.logging.Logger.getLogger(TelaImprimeImovel.class.getName()).log(java.util.logging.Level.SEVERE,
	// null, ex);
	// }
	// //</editor-fold>
	//
	// /* Create and display the form */
	// java.awt.EventQueue.invokeLater(new Runnable() {
	// public void run() {
	// new TelaImprimeImovel().setVisible(true);
	// }
	// });
	// }

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton btSair;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTable jTable1;
	// End of variables declaration//GEN-END:variables
}
