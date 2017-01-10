/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.volunteerRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Nurse.Nurse;
import Business.Nurse.NurseList;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.State.State;
import Business.UserAccount.UserAccount;
import Business.city.City;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author varsha
 */
public class RegisterNewNurseJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RegisterNewNurseJPanel
     */
    private JPanel userProcessContainer;
    private NurseList nurseList;
    private Enterprise enterprise;
    private EcoSystem business;
    private Long contact;
    public RegisterNewNurseJPanel(JPanel userProcessContainer, NurseList nurseList, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.nurseList = nurseList;
        this.enterprise = enterprise;
        this.business = business;
        populateNurseList();
    }

    public void populateNurseList()
    {
        nurseJComboBox.removeAllItems();
       
        for (State state : business.getStateList()) {
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
        jLabel2 = new javax.swing.JLabel();
        yearsExpJTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        workExpJTextArea = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        eduJTextArea = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        contactJTextField = new javax.swing.JTextField();
        addNurseJButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        nurseJComboBox = new javax.swing.JComboBox<>();
        backJButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel1.setText("Nurse Name: ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 135, 29));

        jLabel2.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel2.setText("Years of Experience");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 135, 28));

        yearsExpJTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                yearsExpJTextFieldFocusLost(evt);
            }
        });
        add(yearsExpJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 181, 32));

        jLabel3.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel3.setText("Past work experience:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 135, 30));

        workExpJTextArea.setColumns(20);
        workExpJTextArea.setRows(5);
        jScrollPane1.setViewportView(workExpJTextArea);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 181, -1));

        jLabel4.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel4.setText("Educational Qualifications");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 135, 27));

        eduJTextArea.setColumns(20);
        eduJTextArea.setRows(5);
        jScrollPane2.setViewportView(eduJTextArea);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, 181, -1));

        jLabel5.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel5.setText("Contact:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 135, 30));

        contactJTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                contactJTextFieldFocusLost(evt);
            }
        });
        add(contactJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 181, 30));

        addNurseJButton.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        addNurseJButton.setText("Add");
        addNurseJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNurseJButtonActionPerformed(evt);
            }
        });
        add(addNurseJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 500, 170, 30));

        jLabel6.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel6.setText("Fill the details of new nurse-");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 200, 26));

        nurseJComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(nurseJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 181, 29));

        backJButton2.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        backJButton2.setText("<< Back");
        backJButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButton2ActionPerformed(evt);
            }
        });
        add(backJButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 90, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void addNurseJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNurseJButtonActionPerformed
        // TODO add your handling code here:
        if (!validateCheck()) {
            Nurse nurse;
            boolean isUniqueNurse = true;
            boolean added = true;
            for (State state : business.getStateList()) {
                for (City city : state.getCityList()) {
                    for (Enterprise e : city.getEnterprizeDirectory().getEnterprizeList()) {
                        for (Organization organization : e.getOrganizationDirectory().getOrganizationList()) {
                            nurse = organization.getNurseList().addNurse();
                            for (UserAccount ua : organization.getUserAccountDirectory().getUserAccountList()) {
                               // isUniqueNurse = organization.getNurseList().checkIfNurseIsUnique(organization, (String) nurseJComboBox.getSelectedItem());
                               // if (isUniqueNurse) {
                                    if (ua.getEmployee().getName().equalsIgnoreCase((String) nurseJComboBox.getSelectedItem())) {
                                        nurse.setNurseName((String) nurseJComboBox.getSelectedItem());
                                        nurse.setNoOfYearsExp(Integer.parseInt(yearsExpJTextField.getText()));
                                        nurse.setPastExp(workExpJTextArea.getText());
                                        nurse.setEduQuaifications(eduJTextArea.getText());
                                        nurse.setContact(contactJTextField.getText());
                                        if (Integer.parseInt(yearsExpJTextField.getText()) > 3) {
                                            nurse.setAvailability(true);
                                        } else {
                                            nurse.setAvailability(false);
                                        }
                                     //   added = true;
                                     //   break;
                                    } // else {

                                      //  JOptionPane.showMessageDialog(null, "Sorry!Cannot register. Employee doesnt exist");
                                      //  break;
                                  //  }
                                } //else {
                                    //added = false;
                                   // break;
                              //  }
                            }
                        }
                    }
                }
            }
     //   }
    }//GEN-LAST:event_addNurseJButtonActionPerformed

    private void contactJTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_contactJTextFieldFocusLost
        // TODO add your handling code here:
        try
        {
       
            if(!contactJTextField.getText().trim().isEmpty())
            {
                contact= Long.parseLong(contactJTextField.getText());
                if(contactJTextField.getText().length()!=10)
                     {
                        JOptionPane.showMessageDialog(null,"Please enter valid contact number. Total characters should be 10");
                        contactJTextField.setText("");
                        //return;
                      }
            
            }
            
        }catch(Exception e)
       {
         JOptionPane.showMessageDialog(null,"Please enter valid contact number"); 
          contactJTextField.setText("");
       }
    }//GEN-LAST:event_contactJTextFieldFocusLost

    private void yearsExpJTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_yearsExpJTextFieldFocusLost
        // TODO add your handling code here:
        try {
            if (!yearsExpJTextField.getText().trim().isEmpty()) {
                int year2 = Integer.parseInt(yearsExpJTextField.getText());

                if (yearsExpJTextField.getText().length() > 4) {
                    JOptionPane.showMessageDialog(null, "Please enter valid Year.Length cannot be greater than four!");
                    yearsExpJTextField.setText(" ");
                }

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please enter valid Year.");
            yearsExpJTextField.setText(" ");
        }
    }//GEN-LAST:event_yearsExpJTextFieldFocusLost

    private void backJButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButton2ActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButton2ActionPerformed

    public boolean validateCheck()
    {
        if((yearsExpJTextField.getText().trim().isEmpty()) 
            || (workExpJTextArea.getText().trim().isEmpty())
                || (eduJTextArea.getText().trim().isEmpty()) 
                    || (contactJTextField.getText().trim().isEmpty())){
            
            JOptionPane.showMessageDialog(null,"Fields cannot be blank.Remember to upload your photograph also!");
          return true;
        
    }
        else
        {
            return false;
        }
    }
        
        
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addNurseJButton;
    private javax.swing.JButton backJButton2;
    private javax.swing.JTextField contactJTextField;
    private javax.swing.JTextArea eduJTextArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> nurseJComboBox;
    private javax.swing.JTextArea workExpJTextArea;
    private javax.swing.JTextField yearsExpJTextField;
    // End of variables declaration//GEN-END:variables
}