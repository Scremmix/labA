/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ClimateMonitoring;

import javax.swing.JOptionPane;

/**
 * Il main di tutto il programma
 * Permette di eseguire le operazioni utente e operatore
 * @author alesc
 */
public class Main extends javax.swing.JFrame {

    /**
     * Crea un nuovo form Main
     */
    public Main() {
        initComponents();
        sceltaRicerca.add(perNomeStato);
        sceltaRicerca.add(perCoordinate);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sceltaRicerca = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        registraButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        perNomeStato = new javax.swing.JRadioButton();
        perCoordinate = new javax.swing.JRadioButton();
        effettuaRicerca = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        nuovoCentro = new javax.swing.JButton();
        nuovaRilevazione = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setText("Benvenuto!");

        loginButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        registraButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        registraButton.setText("Registrati");
        registraButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registraButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Effettua ricerca per:");

        perNomeStato.setText("Nome paese e Stato");

        perCoordinate.setText("Coordinate geografiche");

        effettuaRicerca.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        effettuaRicerca.setText("Vai");
        effettuaRicerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                effettuaRicercaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Oppure, se loggato:");

        nuovoCentro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nuovoCentro.setText("<html>\n<p style=\"text-align: center\">Crea nuovo <br/>centro</p>");
        nuovoCentro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        nuovoCentro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuovoCentroActionPerformed(evt);
            }
        });

        nuovaRilevazione.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nuovaRilevazione.setText("<html>\n<p style=\"text-align: center\">Crea nuova <br/>rilevazione</p>");
        nuovaRilevazione.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuovaRilevazioneActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(effettuaRicerca)
                            .addComponent(perCoordinate)
                            .addComponent(perNomeStato))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nuovaRilevazione, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                            .addComponent(loginButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nuovoCentro)
                            .addComponent(registraButton, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE))
                        .addGap(54, 54, 54))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(114, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(94, 94, 94))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(perNomeStato)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(perCoordinate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(effettuaRicerca)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nuovaRilevazione, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nuovoCentro, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(153, 153, 153)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registraButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registraButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registraButtonActionPerformed
        // TODO add your handling code here:
        if(!Utente.loggato())
        {
            RegisterPopup registerForm = new RegisterPopup();
            registerForm.setVisible(true);
        }
        else
            JOptionPane.showMessageDialog(rootPane, "Login già eseguito come: "+Utente.getUsername()+".");
    }//GEN-LAST:event_registraButtonActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        // TODO add your handling code here:
        if(!Utente.loggato())
        {
            LoginPopup loginForm = new LoginPopup();
            loginForm.setVisible(true);
        }
        else
            JOptionPane.showMessageDialog(rootPane, "Login già eseguito come: "+Utente.getUsername()+".");
    }//GEN-LAST:event_loginButtonActionPerformed

    private void effettuaRicercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_effettuaRicercaActionPerformed
        // TODO add your handling code here:
        if(perCoordinate.isSelected())
        {
            RicercaDati formCerca = new RicercaDati();
            formCerca.cambiaModalita(2);
            formCerca.setVisible(true);
        }
        else if(perNomeStato.isSelected())
        {
            RicercaDati formCerca = new RicercaDati();
            formCerca.cambiaModalita(1);
            formCerca.setVisible(true);
        }
    }//GEN-LAST:event_effettuaRicercaActionPerformed

    private void nuovaRilevazioneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuovaRilevazioneActionPerformed
        // TODO add your handling code here:if(!Utente.loggato())
        if(Utente.loggato())
        {
            NuovaRilevazionePopup nuovaRilevazioneForm = new NuovaRilevazionePopup();
            nuovaRilevazioneForm.setVisible(true);
        }
        else
            JOptionPane.showMessageDialog(rootPane, "Operazione limitata agli utenti loggati.");
    }//GEN-LAST:event_nuovaRilevazioneActionPerformed

    private void nuovoCentroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuovoCentroActionPerformed
        // TODO add your handling code here:if(Utente.loggato())
        if(Utente.loggato())
        {
            NuovoCentroPopup nuovoCentroForm = new NuovoCentroPopup();
            nuovoCentroForm.setVisible(true);
        }
        else
            JOptionPane.showMessageDialog(rootPane, "Operazione limitata agli utenti loggati.");
    }//GEN-LAST:event_nuovoCentroActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton effettuaRicerca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton loginButton;
    private javax.swing.JButton nuovaRilevazione;
    private javax.swing.JButton nuovoCentro;
    private javax.swing.JRadioButton perCoordinate;
    private javax.swing.JRadioButton perNomeStato;
    private javax.swing.JButton registraButton;
    private javax.swing.ButtonGroup sceltaRicerca;
    // End of variables declaration//GEN-END:variables
}
