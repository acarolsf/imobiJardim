/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package janelas;

import javax.swing.JOptionPane;

/**
 *
 * @author sergiany e carol
 */
public class TelaAlterarCliente extends javax.swing.JFrame {

	/**
	 * Creates new form TelaAlterarCliente
	 */
	public TelaAlterarCliente() {
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

		jLabel6 = new javax.swing.JLabel();
		jLabel1 = new javax.swing.JLabel();
		btLimpar = new javax.swing.JButton();
		btAlterar = new javax.swing.JButton();
		btSair = new javax.swing.JButton();
		txtAlterar = new javax.swing.JTextField();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		getContentPane().setLayout(new java.awt.GridBagLayout());

		jLabel6.setFont(new java.awt.Font("SimSun", 0, 36)); // NOI18N
		jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/janelas/imagem.png"))); // NOI18N
		jLabel6.setText("Alterar Cliente");
		jLabel6.setDebugGraphicsOptions(javax.swing.DebugGraphics.FLASH_OPTION);
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.gridwidth = 5;
		gridBagConstraints.ipady = -36;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
		gridBagConstraints.insets = new java.awt.Insets(9, 7, 0, 6);
		getContentPane().add(jLabel6, gridBagConstraints);

		jLabel1.setText("Digite o CPF do cliente:");
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 1;
		gridBagConstraints.gridwidth = 2;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
		gridBagConstraints.insets = new java.awt.Insets(42, 90, 0, 0);
		getContentPane().add(jLabel1, gridBagConstraints);

		btLimpar.setText("Limpar");
		btLimpar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btLimparActionPerformed(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 3;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
		gridBagConstraints.insets = new java.awt.Insets(20, 90, 25, 0);
		getContentPane().add(btLimpar, gridBagConstraints);

		btAlterar.setText("Alterar");
		btAlterar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btAlterarActionPerformed(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 2;
		gridBagConstraints.gridy = 3;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
		gridBagConstraints.insets = new java.awt.Insets(20, 79, 25, 0);
		getContentPane().add(btAlterar, gridBagConstraints);

		btSair.setText("Voltar");
		btSair.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btSairActionPerformed(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 3;
		gridBagConstraints.gridy = 3;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
		gridBagConstraints.insets = new java.awt.Insets(20, 165, 25, 0);
		getContentPane().add(btSair, gridBagConstraints);
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 2;
		gridBagConstraints.gridwidth = 4;
		gridBagConstraints.ipadx = 475;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
		gridBagConstraints.insets = new java.awt.Insets(11, 90, 0, 0);
		getContentPane().add(txtAlterar, gridBagConstraints);

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btAlterarActionPerformed
		// TODO add your handling code here:
		String a;
		a = txtAlterar.getText();
		if ("".equals(a)) {
			dispose();
			JOptionPane.showMessageDialog(null, "Digite um CPF!");
			TelaAlterarCliente tac = new TelaAlterarCliente();
			tac.setVisible(true);

		} else {
			TelaDigitaCliente tdc = new TelaDigitaCliente();
			tdc.setVisible(true);
		}
		dispose();
	}// GEN-LAST:event_btAlterarActionPerformed

	private void btSairActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btSairActionPerformed
		// TODO add your handling code here:
		MenuTabelas mt = new MenuTabelas();
		mt.setVisible(true);
		dispose();
	}// GEN-LAST:event_btSairActionPerformed

	private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btLimparActionPerformed
		// TODO add your handling code here:
		txtAlterar.setText(""); // limpar
	}// GEN-LAST:event_btLimparActionPerformed

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
	// java.util.logging.Logger.getLogger(TelaAlterarCliente.class.getName()).log(java.util.logging.Level.SEVERE,
	// null, ex);
	// } catch (InstantiationException ex) {
	// java.util.logging.Logger.getLogger(TelaAlterarCliente.class.getName()).log(java.util.logging.Level.SEVERE,
	// null, ex);
	// } catch (IllegalAccessException ex) {
	// java.util.logging.Logger.getLogger(TelaAlterarCliente.class.getName()).log(java.util.logging.Level.SEVERE,
	// null, ex);
	// } catch (javax.swing.UnsupportedLookAndFeelException ex) {
	// java.util.logging.Logger.getLogger(TelaAlterarCliente.class.getName()).log(java.util.logging.Level.SEVERE,
	// null, ex);
	// }
	// //</editor-fold>
	//
	// /* Create and display the form */
	// java.awt.EventQueue.invokeLater(new Runnable() {
	// public void run() {
	// new TelaAlterarCliente().setVisible(true);
	// }
	// });
	// }

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton btAlterar;
	private javax.swing.JButton btLimpar;
	private javax.swing.JButton btSair;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel6;
	public javax.swing.JTextField txtAlterar;
	// End of variables declaration//GEN-END:variables
}
