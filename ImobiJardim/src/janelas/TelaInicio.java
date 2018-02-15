/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package janelas;

import br.com.atrib.Corretora;
import br.com.atrib.Imovel;
import br.com.dao.CorretoraDao;
import br.com.dao.ImovelDao;

/**
 *
 * @author sergiany e carol
 */
public class TelaInicio extends javax.swing.JFrame {
	ImovelDao dao = new ImovelDao();
	CorretoraDao daoC = new CorretoraDao();

	/**
	 * Creates new form TelaInicio
	 */
	public TelaInicio() {
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
		java.awt.GridBagConstraints gridBagConstraints;

		btEntrar = new javax.swing.JButton();
		btVerImoveis = new javax.swing.JButton();
		btVerCorretora = new javax.swing.JButton();
		btSair = new javax.swing.JButton();
		jLabel1 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		getContentPane().setLayout(new java.awt.GridBagLayout());

		btEntrar.setText("Entrar");
		btEntrar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btEntrarActionPerformed(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 1;
		gridBagConstraints.gridwidth = 3;
		gridBagConstraints.ipadx = 36;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
		gridBagConstraints.insets = new java.awt.Insets(34, 368, 0, 0);
		getContentPane().add(btEntrar, gridBagConstraints);

		btVerImoveis.setText("Ver Imóveis");
		btVerImoveis.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btVerImoveisActionPerformed(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 1;
		gridBagConstraints.gridy = 2;
		gridBagConstraints.gridwidth = 4;
		gridBagConstraints.ipadx = 10;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
		gridBagConstraints.insets = new java.awt.Insets(18, 31, 0, 0);
		getContentPane().add(btVerImoveis, gridBagConstraints);

		btVerCorretora.setText("Ver Corretora");
		btVerCorretora.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btVerCorretoraActionPerformed(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 2;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
		gridBagConstraints.insets = new java.awt.Insets(18, 305, 0, 0);
		getContentPane().add(btVerCorretora, gridBagConstraints);

		btSair.setText("Sair");
		btSair.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btSairActionPerformed(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 3;
		gridBagConstraints.gridwidth = 2;
		gridBagConstraints.ipadx = 48;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
		gridBagConstraints.insets = new java.awt.Insets(18, 366, 78, 0);
		getContentPane().add(btSair, gridBagConstraints);

		jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/janelas/imagem.png"))); // NOI18N
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.gridwidth = 6;
		gridBagConstraints.ipadx = 44;
		gridBagConstraints.ipady = 59;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
		gridBagConstraints.insets = new java.awt.Insets(49, 296, 0, 374);
		getContentPane().add(jLabel1, gridBagConstraints);

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void btEntrarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btEntrarActionPerformed
		// TODO add your handling code here:
		TelaLogin tlogin = new TelaLogin();
		tlogin.setVisible(true);
		dispose();
	}// GEN-LAST:event_btEntrarActionPerformed

	private void btVerImoveisActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btVerImoveisActionPerformed
		// TODO add your handling code here:
		Imovel imovel = new Imovel();
		dao.verTudo(imovel); // chama direto a funcao para ver tudo
		dispose();

	}// GEN-LAST:event_btVerImoveisActionPerformed

	private void btVerCorretoraActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btVerCorretoraActionPerformed
		// TODO add your handling code here:
		Corretora c = new Corretora();
		daoC.verTudo(c);
		dispose();
	}// GEN-LAST:event_btVerCorretoraActionPerformed

	private void btSairActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btSairActionPerformed
		// TODO add your handling code here:
		System.exit(0);
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
	// java.util.logging.Logger.getLogger(TelaInicio.class.getName()).log(java.util.logging.Level.SEVERE,
	// null, ex);
	// } catch (InstantiationException ex) {
	// java.util.logging.Logger.getLogger(TelaInicio.class.getName()).log(java.util.logging.Level.SEVERE,
	// null, ex);
	// } catch (IllegalAccessException ex) {
	// java.util.logging.Logger.getLogger(TelaInicio.class.getName()).log(java.util.logging.Level.SEVERE,
	// null, ex);
	// } catch (javax.swing.UnsupportedLookAndFeelException ex) {
	// java.util.logging.Logger.getLogger(TelaInicio.class.getName()).log(java.util.logging.Level.SEVERE,
	// null, ex);
	// }
	// //</editor-fold>
	//
	// /* Create and display the form */
	// java.awt.EventQueue.invokeLater(new Runnable() {
	// public void run() {
	// new TelaInicio().setVisible(true);
	// }
	// });
	// }

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton btEntrar;
	private javax.swing.JButton btSair;
	private javax.swing.JButton btVerCorretora;
	private javax.swing.JButton btVerImoveis;
	private javax.swing.JLabel jLabel1;
	// End of variables declaration//GEN-END:variables
}