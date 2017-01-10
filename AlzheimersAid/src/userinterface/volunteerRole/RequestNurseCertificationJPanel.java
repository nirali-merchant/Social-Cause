/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.volunteerRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Nurse.Nurse;
import Business.Organization.NurseOrganization;
import Business.Organization.Organization;
import static Business.Organization.Organization.Type.Nurse;
import Business.Organization.ResearcherOrganization;
import Business.Role.Role;
import Business.State.State;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.ResearchAnalysisWorkRequest;
import Business.WorkQueue.VolunteerToNurseCertificationWorkRequest;
import Business.city.City;
import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Nirali Merchant
 */
public class RequestNurseCertificationJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RequestNurseCertificationJPanel
     */
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem system;

    RequestNurseCertificationJPanel(JPanel userProcessContainer, UserAccount userAccount, Enterprise enterprise, EcoSystem system) {
        initComponents();
        this.userProcessContainer  = userProcessContainer;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.system = system;
        populateNurseList();
    }
    
    public void populateNurseList()
    {
        nurseJComboBox.removeAllItems();
       
        for (State state : system.getStateList()) {
            for (City city : state.getCityList()) {
                for (Enterprise e : city.getEnterprizeDirectory().getEnterprizeList()) {
                    for (Organization o : e.getOrganizationDirectory().getOrganizationList()) {
                        for (UserAccount ua : o.getUserAccountDirectory().getUserAccountList()) {

                            for (Role role : o.getSupportedRole()) {
                                if (role.toString().equals("Nurse Role")) {
                                    nurseJComboBox.addItem(ua.getEmployee().getName());
                                   // c++;
                                    //System.out.println("Caregiver total is:"+ c );
                                }
                            }
                        }

                    }
                }
            }
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
        certificationNameJTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        DateChooser = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        nurseJComboBox = new javax.swing.JComboBox<>();
        sendJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel1.setText("Certification Name");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 65, 140, 32));
        add(certificationNameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 151, 32));

        jLabel2.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel2.setText("Complete By");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 115, 94, 35));
        add(DateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 151, 33));

        jLabel3.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel3.setText("Nurse Username");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 170, -1, 32));

        nurseJComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(nurseJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 151, 37));

        sendJButton.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        sendJButton.setText("Send");
        sendJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendJButtonActionPerformed(evt);
            }
        });
        add(sendJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 251, 110, 34));

        backJButton.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 80, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void sendJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendJButtonActionPerformed
        // TODO add your handling code here:
       UserAccount nurseUserAccount = null;
        String certificationName = certificationNameJTextField.getText();
      //  Nurse nurse  = new Nurse();
        String nurseName = (String) nurseJComboBox.getSelectedItem();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
         String date = sdf.format(DateChooser.getDate());
        
         for (State state : system.getStateList()) {
            for (City city : state.getCityList()) {
                for (Enterprise e : city.getEnterprizeDirectory().getEnterprizeList()) {
                    for (Organization o : e.getOrganizationDirectory().getOrganizationList()) {
                        for (UserAccount ua : o.getUserAccountDirectory().getUserAccountList()) {
                            if(ua.getUsername().equalsIgnoreCase(nurseName))
                            {
                                nurseUserAccount  = ua;
                            }
                            
                        }
                        
                    }
                }
            }
         }
         
         
         VolunteerToNurseCertificationWorkRequest request = new VolunteerToNurseCertificationWorkRequest();
        request.setMessage("Certification" + certificationName + "due");
        request.setSender(userAccount);
        request.setReceiver(nurseUserAccount);
        request.setStatus("Sent");

        Organization org = null;
        UserAccount userAcct = null;
        for (State state : system.getStateList()) {
        for (City city : state.getCityList()) {
        for (Enterprise enterprise : city.getEnterprizeDirectory().getEnterprizeList()) {
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
            if (organization instanceof NurseOrganization){
                for(UserAccount nuseracct : organization.getUserAccountDirectory().getUserAccountList())
                {
                    if(nuseracct.getUsername().equalsIgnoreCase(nurseUserAccount.getUsername()))
                    {
                        userAcct = nuseracct;
                        org = organization;
                        break;    
                    }
                }
                         
            }
        }
        }
        }
        }
        if (org!=null){
           //org.getWorkQueue().getWorkRequestList().add(request);
            userAcct.getWorkQueue().getWorkRequestList().add(request);
            userAccount.getWorkQueue().getWorkRequestList().add(request);
            JOptionPane.showMessageDialog(null,"Request successfully submitted", "Information", JOptionPane.INFORMATION_MESSAGE);
        }
         
         
         
         
    }//GEN-LAST:event_sendJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DateChooser;
    private javax.swing.JButton backJButton;
    private javax.swing.JTextField certificationNameJTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JComboBox<String> nurseJComboBox;
    private javax.swing.JButton sendJButton;
    // End of variables declaration//GEN-END:variables
}
