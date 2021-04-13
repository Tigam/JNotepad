/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package at.wifi.swdev.jnotepad_trainer;

import java.io.File;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author dev
 */
public class MainFrame extends javax.swing.JFrame {

  private boolean lineWrap = true;
  private DialogInfo infoDialog;

  /**
   * Creates new form MainFrame
   */
  public MainFrame() {
    infoDialog = new DialogInfo(this);

    initComponents();

    txtText.setLineWrap(lineWrap);
    jmiLineWrap.setSelected(lineWrap);
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    filechooser = new javax.swing.JFileChooser();
    lblText = new javax.swing.JLabel();
    jScrollPane1 = new javax.swing.JScrollPane();
    txtText = new javax.swing.JTextArea();
    jLabel1 = new javax.swing.JLabel();
    jToolBar1 = new javax.swing.JToolBar();
    btnExit = new javax.swing.JButton();
    jMenuBar1 = new javax.swing.JMenuBar();
    jMenu1 = new javax.swing.JMenu();
    jmiNeu = new javax.swing.JMenuItem();
    jSeparator2 = new javax.swing.JPopupMenu.Separator();
    jmiOeffnen = new javax.swing.JMenuItem();
    jmiSpeichernUnter = new javax.swing.JMenuItem();
    jSeparator1 = new javax.swing.JPopupMenu.Separator();
    jmiExit = new javax.swing.JMenuItem();
    jMenu2 = new javax.swing.JMenu();
    jmiLineWrap = new javax.swing.JCheckBoxMenuItem();
    jMenu3 = new javax.swing.JMenu();
    jmiInfo = new javax.swing.JMenuItem();

    setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
    setTitle("JNotepad Software Developer");
    addWindowListener(new java.awt.event.WindowAdapter() {
      public void windowClosing(java.awt.event.WindowEvent evt) {
        formWindowClosing(evt);
      }
    });

    lblText.setText("Status");

    txtText.setColumns(20);
    txtText.setRows(5);
    jScrollPane1.setViewportView(txtText);

    jLabel1.setText("Version 1.0");

    jToolBar1.setFloatable(false);
    jToolBar1.setRollover(true);

    btnExit.setText("Beenden");
    btnExit.setFocusable(false);
    btnExit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    btnExit.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    btnExit.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnExitActionPerformed(evt);
      }
    });
    jToolBar1.add(btnExit);

    jMenu1.setText("Datei");

    jmiNeu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
    jmiNeu.setText("Neu");
    jmiNeu.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jmiNeuActionPerformed(evt);
      }
    });
    jMenu1.add(jmiNeu);
    jMenu1.add(jSeparator2);

    jmiOeffnen.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
    jmiOeffnen.setText("Öffnen...");
    jmiOeffnen.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jmiOeffnenActionPerformed(evt);
      }
    });
    jMenu1.add(jmiOeffnen);

    jmiSpeichernUnter.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
    jmiSpeichernUnter.setText("Speichern unter...");
    jmiSpeichernUnter.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jmiSpeichernUnterActionPerformed(evt);
      }
    });
    jMenu1.add(jmiSpeichernUnter);
    jMenu1.add(jSeparator1);

    jmiExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
    jmiExit.setText("Beenden");
    jmiExit.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jmiExitActionPerformed(evt);
      }
    });
    jMenu1.add(jmiExit);

    jMenuBar1.add(jMenu1);

    jMenu2.setText("Bearbeiten");

    jmiLineWrap.setText("Zeilenumbruch");
    jmiLineWrap.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jmiLineWrapActionPerformed(evt);
      }
    });
    jMenu2.add(jmiLineWrap);

    jMenuBar1.add(jMenu2);

    jMenu3.setText("?");

    jmiInfo.setText("Info");
    jmiInfo.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jmiInfoActionPerformed(evt);
      }
    });
    jMenu3.add(jmiInfo);

    jMenuBar1.add(jMenu3);

    setJMenuBar(jMenuBar1);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE)
          .addGroup(layout.createSequentialGroup()
            .addComponent(lblText)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1)))
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(lblText)
          .addComponent(jLabel1))
        .addContainerGap())
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void jmiExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiExitActionPerformed
    exitPrg();
  }//GEN-LAST:event_jmiExitActionPerformed

  private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
    exitPrg();
  }//GEN-LAST:event_btnExitActionPerformed

  private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
    exitPrg();
  }//GEN-LAST:event_formWindowClosing

  private void jmiNeuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiNeuActionPerformed
    newDocument();
  }//GEN-LAST:event_jmiNeuActionPerformed

  private void jmiOeffnenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiOeffnenActionPerformed
    loadDocument();
  }//GEN-LAST:event_jmiOeffnenActionPerformed

  private void jmiSpeichernUnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSpeichernUnterActionPerformed
    saveDocumentAs();
  }//GEN-LAST:event_jmiSpeichernUnterActionPerformed

  private void jmiInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiInfoActionPerformed
    showInfoDialog();
  }//GEN-LAST:event_jmiInfoActionPerformed

  private void jmiLineWrapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiLineWrapActionPerformed
    lineWrap = jmiLineWrap.isSelected();
    txtText.setLineWrap(lineWrap);
    setStatus("Zeilenumbruch " + (lineWrap ? "" : "nicht ") + "aktiviert");
    // Ausgabe: (lineWrap == false): Zeilenumbruch nicht aktiviert
    // Ausgabe: (lineWrap == true): Zeilenumbruch aktiviert
  }//GEN-LAST:event_jmiLineWrapActionPerformed

  public void setStatus(String msg) {
    System.out.println("Status: " + msg);
    lblText.setText(msg);
  }

  private void saveDocumentAs() {
    int answer = filechooser.showSaveDialog(this);
    if (answer == JFileChooser.APPROVE_OPTION) {
      File selectedFile = filechooser.getSelectedFile();
      String text = txtText.getText();
      try {
        JNotepadFileUtil.writeTextFile(selectedFile.toPath(), text);
      } catch (IOException ioe) {
        JOptionPane.showMessageDialog(this,
                "Fehler beim Schreiben der Datei!" + ioe.getMessage(),
                "I/O Fehler",
                JOptionPane.ERROR_MESSAGE);
      }
    }
  }

  private void loadDocument() {
    int answer = filechooser.showOpenDialog(this);
    if (answer == JFileChooser.APPROVE_OPTION) {
      File selectedFile = filechooser.getSelectedFile();
      String text;
      try {
        text = JNotepadFileUtil.readTextFile(selectedFile.toPath());
        txtText.setText(text);
      } catch (IOException ioe) {
        JOptionPane.showMessageDialog(
                this,
                "Fehler: " + ioe.getMessage(),
                "I/O Fehler",
                JOptionPane.ERROR_MESSAGE);
      }
    }
  }

  private void newDocument() {
    txtText.setText("");
    txtText.setCaretPosition(0);
    txtText.requestFocus();
  }

  private void exitPrg() {
    int answer = JOptionPane.showConfirmDialog(this,
            "Wollen Sie das Programm wirklich beenden?",
            "Programm beenden?",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE);

    if (answer == JOptionPane.YES_OPTION) {
      this.setVisible(false);
      this.dispose();
      System.exit(0);
    }
  }

  private void showInfoDialog() {
    infoDialog.setLocationRelativeTo(this);
    infoDialog.setVisible(true);
    System.out.println("Dialog wieder geschlossen.");
  }

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    /* Set the Nimbus look and feel */
    //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
    /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
     */

    for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
      System.out.println("Installed L&F: " + info.getName());
    }

    try {
      for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    } catch (ClassNotFoundException ex) {
      java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new MainFrame().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnExit;
  private javax.swing.JFileChooser filechooser;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JMenu jMenu1;
  private javax.swing.JMenu jMenu2;
  private javax.swing.JMenu jMenu3;
  private javax.swing.JMenuBar jMenuBar1;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JPopupMenu.Separator jSeparator1;
  private javax.swing.JPopupMenu.Separator jSeparator2;
  private javax.swing.JToolBar jToolBar1;
  private javax.swing.JMenuItem jmiExit;
  private javax.swing.JMenuItem jmiInfo;
  private javax.swing.JCheckBoxMenuItem jmiLineWrap;
  private javax.swing.JMenuItem jmiNeu;
  private javax.swing.JMenuItem jmiOeffnen;
  private javax.swing.JMenuItem jmiSpeichernUnter;
  private javax.swing.JLabel lblText;
  private javax.swing.JTextArea txtText;
  // End of variables declaration//GEN-END:variables
}
