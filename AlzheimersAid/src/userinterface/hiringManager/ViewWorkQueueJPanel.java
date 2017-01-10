/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.hiringManager;

import Business.Organization.ChiefNursePractitionerOrganization;
import Business.Organization.Organization;
import Business.WorkQueue.ChiefNurseToVolunteer;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author varsha
 */
public class ViewWorkQueueJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewWorkQueueJPanel
     */
    private JPanel userProcessContainer;
    private ChiefNursePractitionerOrganization organization;
    public ViewWorkQueueJPanel(JPanel userProcessContainer, ChiefNursePractitionerOrganization organization) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        populateTable();
    }

    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel) cnpMessagesJTabel.getModel();
       
        model.setRowCount(0);
        for(WorkRequest request : organization.getWorkQueue().getWorkRequestList())
        {
            Object[] row = new Object[3];
            row[0] = request.getMessage();
            row[1] = request.getSender();
            row[2] = request.getStatus();
           
             model.addRow(row);
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        cnpMessagesJTabel = new javax.swing.JTable();
        backJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel1.setText("Check messages here!!");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 97, 150, 30));

        cnpMessagesJTabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Message", "Sender", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(cnpMessagesJTabel);
        if (cnpMessagesJTabel.getColumnModel().getColumnCount() > 0) {
            cnpMessagesJTabel.getColumnModel().getColumn(0).setResizable(false);
            cnpMessagesJTabel.getColumnModel().getColumn(2).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 145, 474, 163));

        backJButton.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 26, 99, 35));
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JTable cnpMessagesJTabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
