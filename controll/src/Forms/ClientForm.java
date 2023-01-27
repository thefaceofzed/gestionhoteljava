/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import entities.Client;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import services.ServiceClient;

/**
 *
 * @author ep
 */
public class ClientForm extends javax.swing.JInternalFrame {
    
    ServiceClient clis=new ServiceClient();
    private DefaultTableModel model;
    private static int id;

    /**
     * Creates new form CategorieForm
     */
    public ClientForm() {
        initComponents();
        model=(DefaultTableModel) ListeClients.getModel();
        load();
    }
    
    private void load(){
        model.setRowCount(0);
        for(Client c:clis.findAll()){
            model.addRow(new Object[]{
                c.getId(),
                c.getNom(),
                c.getPrenom(),
                c.getTelephone(),
                c.getEmail(),
            });
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nomtxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        prenomtxt = new javax.swing.JTextField();
        Addclient = new javax.swing.JButton();
        supprimerclient = new javax.swing.JButton();
        modifierclient = new javax.swing.JButton();
        telephonetxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        emailtxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListeClients = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Gestion des clients");

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "New Client", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel1.setText("nom");

        jLabel2.setText("prenom");

        Addclient.setText("Ajouter");
        Addclient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddclientActionPerformed(evt);
            }
        });

        supprimerclient.setText("Supprimer");
        supprimerclient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supprimerclientActionPerformed(evt);
            }
        });

        modifierclient.setText("Modifier");
        modifierclient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifierclientActionPerformed(evt);
            }
        });

        jLabel3.setText("telephone");

        jLabel4.setText("email");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(42, 42, 42)
                        .addComponent(emailtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nomtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(18, 18, 18)
                            .addComponent(telephonetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(prenomtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(supprimerclient, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Addclient, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modifierclient, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(nomtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Addclient)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(supprimerclient)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(modifierclient))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(prenomtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(telephonetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(emailtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Liste des Clients", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        ListeClients.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "nom", "prenom", "telephone", "email"
            }
        ));
        ListeClients.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListeClientsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ListeClients);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void modifierclientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifierclientActionPerformed
       
        String nom=nomtxt.getText();
        
        String prenom=prenomtxt.getText();
        
        String telephone=telephonetxt.getText();
        
        String email=emailtxt.getText();
        
        Client client=clis.findById(id);
        client.setNom(nom);
        client.setPrenom(prenom);
        client.setTelephone(telephone);
        client.setEmail(email);
        int reponse=JOptionPane.showConfirmDialog(this, "Voulez-vous vraiment modifier le client");
        if(reponse==0){
            if(clis.update(client))
                JOptionPane.showMessageDialog(this,"Client modifiée");
        }
        load();
        
    }//GEN-LAST:event_modifierclientActionPerformed

    private void AddclientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddclientActionPerformed
            String nom=nomtxt.getText();
            String prenom=prenomtxt.getText();
            String telephone=telephonetxt.getText();
            String email=emailtxt.getText();
            
            if(clis.create(new Client(nom,prenom,telephone,email))){
                JOptionPane.showMessageDialog(this, "Client bien ajoutée");
            }
            load();
        
    }//GEN-LAST:event_AddclientActionPerformed

    private void ListeClientsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListeClientsMouseClicked
        id=Integer.parseInt(model.getValueAt(ListeClients.getSelectedRow(), 0).toString());
        nomtxt.setText(model.getValueAt(ListeClients.getSelectedRow(), 1).toString());
        prenomtxt.setText(model.getValueAt(ListeClients.getSelectedRow(), 2).toString());
        telephonetxt.setText(model.getValueAt(ListeClients.getSelectedRow(), 3).toString());
        emailtxt.setText(model.getValueAt(ListeClients.getSelectedRow(), 4).toString());
    }//GEN-LAST:event_ListeClientsMouseClicked

    private void supprimerclientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supprimerclientActionPerformed
        int reponse=JOptionPane.showConfirmDialog(this, "voulez-cous vraiment supprimer ce client");
        if(reponse==0){
            if(clis.delete(clis.findById(id)))
                JOptionPane.showMessageDialog(this, "Client bien supprimée");
            load();
        }
        
    }//GEN-LAST:event_supprimerclientActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Addclient;
    private javax.swing.JTable ListeClients;
    private javax.swing.JTextField emailtxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton modifierclient;
    private javax.swing.JTextField nomtxt;
    private javax.swing.JTextField prenomtxt;
    private javax.swing.JButton supprimerclient;
    private javax.swing.JTextField telephonetxt;
    // End of variables declaration//GEN-END:variables
}