/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ClimateMonitoring;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;


/**
 *
 * @author alesc
 */
public class RegisterPopup extends javax.swing.JFrame {

    /**
     * Creates new form RegisterPopup
     */
    public RegisterPopup() {
        initComponents();
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.caricaCentri();
    }

    private ArrayList<String[]> centriFile=new ArrayList<>();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();
        codFiscale = new javax.swing.JTextField();
        cognome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        idutente = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        pw2 = new javax.swing.JPasswordField();
        pw1 = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        RegisterButton = new javax.swing.JButton();
        CancelButton = new javax.swing.JButton();
        centroCerca = new javax.swing.JTextField();
        centerSearchButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        centerTable = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        selectedNameDisplay = new javax.swing.JLabel();

        setBackground(new java.awt.Color(248, 248, 248));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Register");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Nome");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Cognome");

        nome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        codFiscale.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        cognome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Codice fiscale");

        email.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("E-mail");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("ID utente");

        idutente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Conferma password");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Password");

        pw2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        pw1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel9.setText("Centro di rifermento");

        RegisterButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        RegisterButton.setText("Registrati");
        RegisterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterButtonActionPerformed(evt);
            }
        });

        CancelButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        CancelButton.setText("Annulla");
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });

        centerSearchButton.setText("Cerca");
        centerSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                centerSearchButtonActionPerformed(evt);
            }
        });

        centerTable.setModel(ddtm);
        centerTable.setColumnSelectionAllowed(true);
        centerTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                centerTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(centerTable);
        centerTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (centerTable.getColumnModel().getColumnCount() > 0) {
            centerTable.getColumnModel().getColumn(0).setMinWidth(50);
            centerTable.getColumnModel().getColumn(0).setMaxWidth(400);
            centerTable.getColumnModel().getColumn(0).setHeaderValue("Name");
            centerTable.getColumnModel().getColumn(1).setMinWidth(50);
            centerTable.getColumnModel().getColumn(1).setMaxWidth(400);
            centerTable.getColumnModel().getColumn(1).setHeaderValue("Address");
            centerTable.getColumnModel().getColumn(2).setMinWidth(250);
            centerTable.getColumnModel().getColumn(2).setPreferredWidth(200);
            centerTable.getColumnModel().getColumn(2).setMaxWidth(180);
            centerTable.getColumnModel().getColumn(2).setHeaderValue("City");
            centerTable.getColumnModel().getColumn(3).setMinWidth(100);
            centerTable.getColumnModel().getColumn(3).setPreferredWidth(90);
            centerTable.getColumnModel().getColumn(3).setMaxWidth(80);
            centerTable.getColumnModel().getColumn(3).setHeaderValue("Country");
        }

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Centro selezionato:");

        selectedNameDisplay.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        selectedNameDisplay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selectedNameDisplayMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(397, 397, 397)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(277, 277, 277)
                        .addComponent(RegisterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(110, 110, 110)
                        .addComponent(CancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5))
                                    .addGap(47, 47, 47)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                    .addComponent(codFiscale, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jLabel7))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(cognome, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(156, 156, 156)
                                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(idutente, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                                                .addComponent(pw2, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                                                .addComponent(pw1, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)))))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(centroCerca)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(centerSearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(selectedNameDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 703, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(idutente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cognome)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8)
                    .addComponent(pw1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codFiscale, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addComponent(pw2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(centroCerca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(centerSearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(selectedNameDisplay))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RegisterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mostraInTabella(ArrayList<String[]> dati)
    {
        ddtm.setRowCount(0);
        for(String[] riga: dati)
        {
            ddtm.addRow
                (new Object[] {riga[1],riga[2],riga[4],riga[5]});
        }
    }
    private ArrayList<String[]> cercaCentro(String nomeCentro)
    {
        ArrayList<String[]> risultati= new ArrayList<>();
        for(String[] riga: centriFile)
        {
            if(nomeCentro.equalsIgnoreCase(nomeCentro))
                risultati.add(riga);
        }
        return risultati;
    }
    
    private String trovaIDCentro(String nomeCentro)
    {
        for(String[] riga: centriFile)
        {
            if(nomeCentro.equalsIgnoreCase(nomeCentro))
                return riga[0];
        }
        return null;
    }
    private void caricaCentri()
    {
        centriFile=new ArrayList<String[]>();
        try {
                FileReader read = new FileReader("datafiles/CentroMonitoraggio.csv");
                Scanner input = new Scanner(read);
                while(input.hasNextLine()) {
                    String line = input.nextLine();
                    String[] parts = line.split("#");
                    centriFile.add(parts);
                }
            }
        catch(FileNotFoundException ex){
                JOptionPane.showMessageDialog(rootPane, "Errore critico: impossibile trovare il file contenente le stazioni di monitoraggio.");
        }
    }
    
    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_CancelButtonActionPerformed
    // TODO add your handling code here:


    private void centerSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_centerSearchButtonActionPerformed
        // TODO add your handling code here:
        mostraInTabella(cercaCentro(centroCerca.getText()));
    }//GEN-LAST:event_centerSearchButtonActionPerformed

    private void centerTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_centerTableMouseClicked
        // TODO add your handling code here:
        String selectedCenter = ddtm.getValueAt(centerTable.getSelectedRow(), 0).toString();
        selectedNameDisplay.setText(selectedCenter);
    }//GEN-LAST:event_centerTableMouseClicked

    private void RegisterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterButtonActionPerformed
        try {
            // TODO add your handling code here:
            String idCentro=trovaIDCentro(selectedNameDisplay.getText());
            if(idCentro==null)
            {
                JOptionPane.showMessageDialog(rootPane, "Nessun centro selezionato"); 
            }
            else if(Utente.register(
                    nome.getText(),
                    cognome.getText(),
                    new String(pw1.getPassword()),
                    new String(pw2.getPassword()),
                    email.getText(),
                    idutente.getText(),
                    codFiscale.getText(),
                    idCentro
                ))
            {
                JOptionPane.showMessageDialog(rootPane, "Registrazone effettuata con successo."); 
                this.dispose();
            }
        } catch (utenteException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
    }//GEN-LAST:event_RegisterButtonActionPerformed

    private void selectedNameDisplayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectedNameDisplayMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_selectedNameDisplayMouseClicked
    
    javax.swing.table.DefaultTableModel ddtm = new javax.swing.table.DefaultTableModel(
    new Object [][] {}, tableHeader)
    {
    Class[] types = new Class [] {
        java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
    };
    boolean[] canEdit = new boolean [] {
        false, false, false, false
    };

    @Override
    public Class getColumnClass(int columnIndex) {
        return types [columnIndex];
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit [columnIndex];
    }};
    private static String[] tableHeader = new String [] {"Nome", "Indirizzo", "Città", "Stato"};
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelButton;
    private javax.swing.JButton RegisterButton;
    private javax.swing.JButton centerSearchButton;
    private javax.swing.JTable centerTable;
    private javax.swing.JTextField centroCerca;
    private javax.swing.JTextField codFiscale;
    private javax.swing.JTextField cognome;
    private javax.swing.JTextField email;
    private javax.swing.JTextField idutente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nome;
    private javax.swing.JPasswordField pw1;
    private javax.swing.JPasswordField pw2;
    private javax.swing.JLabel selectedNameDisplay;
    // End of variables declaration//GEN-END:variables
}