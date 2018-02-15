/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package janelas;

import br.com.atrib.Corretora;
import br.com.dao.CorretoraDao;
import javax.swing.JOptionPane;

/**
 *
 * @author Ana Carolina
 */
public class TelaInserirCorretora extends javax.swing.JFrame {

	/**
	 * Creates new form TelaInserirCorretora
	 */
	public TelaInserirCorretora() {
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
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		txtNome = new javax.swing.JTextField();
		txtCidade = new javax.swing.JTextField();
		txtTelefone = new javax.swing.JTextField();
		txtCnpj = new javax.swing.JTextField();
		txtEmail = new javax.swing.JTextField();
		btLimpar = new javax.swing.JButton();
		btSalvar = new javax.swing.JButton();
		btSair = new javax.swing.JButton();
		jLabel7 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		getContentPane().setLayout(new java.awt.GridBagLayout());

		jLabel6.setFont(new java.awt.Font("SimSun", 0, 36)); // NOI18N
		jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/janelas/imagem.png"))); // NOI18N
		jLabel6.setText("Inserir Corretora");
		jLabel6.setDebugGraphicsOptions(javax.swing.DebugGraphics.FLASH_OPTION);
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.gridwidth = 17;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
		gridBagConstraints.insets = new java.awt.Insets(11, 0, 0, 0);
		getContentPane().add(jLabel6, gridBagConstraints);

		jLabel1.setText("Nome:");
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 2;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
		gridBagConstraints.insets = new java.awt.Insets(9, 69, 0, 0);
		getContentPane().add(jLabel1, gridBagConstraints);

		jLabel2.setText("Cidade:");
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 4;
		gridBagConstraints.gridwidth = 3;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
		gridBagConstraints.insets = new java.awt.Insets(9, 69, 0, 0);
		getContentPane().add(jLabel2, gridBagConstraints);

		jLabel3.setText("Telefone *:");
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 6;
		gridBagConstraints.gridwidth = 5;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
		gridBagConstraints.insets = new java.awt.Insets(9, 69, 0, 0);
		getContentPane().add(jLabel3, gridBagConstraints);

		jLabel4.setText("CNPJ *:");
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 8;
		gridBagConstraints.gridwidth = 4;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
		gridBagConstraints.insets = new java.awt.Insets(9, 69, 0, 0);
		getContentPane().add(jLabel4, gridBagConstraints);

		jLabel5.setText("E-mail:");
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 10;
		gridBagConstraints.gridwidth = 2;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
		gridBagConstraints.insets = new java.awt.Insets(9, 69, 0, 0);
		getContentPane().add(jLabel5, gridBagConstraints);
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 5;
		gridBagConstraints.gridy = 2;
		gridBagConstraints.gridwidth = 11;
		gridBagConstraints.gridheight = 2;
		gridBagConstraints.ipadx = 437;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
		gridBagConstraints.insets = new java.awt.Insets(6, 3, 0, 0);
		getContentPane().add(txtNome, gridBagConstraints);
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 5;
		gridBagConstraints.gridy = 4;
		gridBagConstraints.gridwidth = 11;
		gridBagConstraints.gridheight = 2;
		gridBagConstraints.ipadx = 437;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
		gridBagConstraints.insets = new java.awt.Insets(6, 3, 0, 0);
		getContentPane().add(txtCidade, gridBagConstraints);
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 5;
		gridBagConstraints.gridy = 6;
		gridBagConstraints.gridwidth = 11;
		gridBagConstraints.gridheight = 2;
		gridBagConstraints.ipadx = 436;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
		gridBagConstraints.insets = new java.awt.Insets(6, 4, 0, 0);
		getContentPane().add(txtTelefone, gridBagConstraints);
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 5;
		gridBagConstraints.gridy = 8;
		gridBagConstraints.gridwidth = 11;
		gridBagConstraints.gridheight = 2;
		gridBagConstraints.ipadx = 439;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
		gridBagConstraints.insets = new java.awt.Insets(6, 1, 0, 0);
		getContentPane().add(txtCnpj, gridBagConstraints);
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 5;
		gridBagConstraints.gridy = 10;
		gridBagConstraints.gridwidth = 11;
		gridBagConstraints.gridheight = 2;
		gridBagConstraints.ipadx = 439;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
		gridBagConstraints.insets = new java.awt.Insets(6, 1, 0, 0);
		getContentPane().add(txtEmail, gridBagConstraints);

		btLimpar.setText("Limpar");
		btLimpar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btLimparActionPerformed(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 12;
		gridBagConstraints.gridwidth = 6;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
		gridBagConstraints.insets = new java.awt.Insets(6, 69, 8, 0);
		getContentPane().add(btLimpar, gridBagConstraints);

		btSalvar.setText("Salvar");
		btSalvar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btSalvarActionPerformed(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 14;
		gridBagConstraints.gridy = 12;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
		gridBagConstraints.insets = new java.awt.Insets(6, 32, 8, 0);
		getContentPane().add(btSalvar, gridBagConstraints);

		btSair.setText("Sair");
		btSair.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btSairActionPerformed(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 15;
		gridBagConstraints.gridy = 12;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
		gridBagConstraints.insets = new java.awt.Insets(6, 157, 8, 0);
		getContentPane().add(btSair, gridBagConstraints);

		jLabel7.setForeground(new java.awt.Color(255, 0, 0));
		jLabel7.setText("Sempre inserir os campos que contém o *");
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 1;
		gridBagConstraints.gridwidth = 10;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
		gridBagConstraints.insets = new java.awt.Insets(1, 69, 0, 0);
		getContentPane().add(jLabel7, gridBagConstraints);

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btLimparActionPerformed
		// TODO add your handling code here:
		txtNome.setText("");
		txtCnpj.setText("");
		txtCidade.setText("");
		txtEmail.setText("");
		txtTelefone.setText("");
	}// GEN-LAST:event_btLimparActionPerformed

	private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btSalvarActionPerformed
		// TODO add your handling code here:

		if ("".equals(txtCnpj.getText()) || "".equals(txtTelefone.getText())) {
			dispose();
			JOptionPane.showMessageDialog(null, "Ops, nao pode cadastrar sem CNPJ ou sem o telefone!");
			TelaInserirCorretora tbc = new TelaInserirCorretora();
			tbc.setVisible(true);

		} else {
			Corretora s = new Corretora();
			s.setNome(txtNome.getText());
			s.setCidade(txtCidade.getText());
			s.setTelefone(txtTelefone.getText());
			s.setCnpj(Integer.parseInt(txtCnpj.getText()));
			s.setEmail(txtEmail.getText());

			CorretoraDao dao = new CorretoraDao();
			dao.inserir(s); // chama a fun�ao inserir, para inserir no banco de dados
			JOptionPane.showMessageDialog(null, "Corretora inserida\n");
			dispose();
			MenuTabelas mt = new MenuTabelas();
			mt.setVisible(true);
		}
	}// GEN-LAST:event_btSalvarActionPerformed

	private void btSairActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btSairActionPerformed
		// TODO add your handling code here:
		MenuTabelas mt = new MenuTabelas();
		mt.setVisible(true);
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
	// java.util.logging.Logger.getLogger(TelaInserirCorretora.class.getName()).log(java.util.logging.Level.SEVERE,
	// null, ex);
	// } catch (InstantiationException ex) {
	// java.util.logging.Logger.getLogger(TelaInserirCorretora.class.getName()).log(java.util.logging.Level.SEVERE,
	// null, ex);
	// } catch (IllegalAccessException ex) {
	// java.util.logging.Logger.getLogger(TelaInserirCorretora.class.getName()).log(java.util.logging.Level.SEVERE,
	// null, ex);
	// } catch (javax.swing.UnsupportedLookAndFeelException ex) {
	// java.util.logging.Logger.getLogger(TelaInserirCorretora.class.getName()).log(java.util.logging.Level.SEVERE,
	// null, ex);
	// }
	// //</editor-fold>
	//
	// /* Create and display the form */
	// java.awt.EventQueue.invokeLater(new Runnable() {
	// public void run() {
	// new TelaInserirCorretora().setVisible(true);
	// }
	// });
	// }

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton btLimpar;
	private javax.swing.JButton btSair;
	private javax.swing.JButton btSalvar;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JTextField txtCidade;
	private javax.swing.JTextField txtCnpj;
	private javax.swing.JTextField txtEmail;
	private javax.swing.JTextField txtNome;
	private javax.swing.JTextField txtTelefone;
	// End of variables declaration//GEN-END:variables
}