/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.State.State;
import Business.city.City;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author raunak
 */
public class ManageEnterpriseJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;

    /**
     * Creates new form ManageEnterpriseJPanel
     */
    public ManageEnterpriseJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
          
        for (State state : system.getStateList()) {
           for (City city : state.getCityList())   {
               System.out.print(state.getName() + "  " + city.getName());
           } 
        }
        populateTable();
        populateComboBox();
    }

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) enterpriseJTable.getModel();

        model.setRowCount(0);
        for (State state : system.getStateList()) {
           for (City city : state.getCityList()) 
            for (Enterprise enterprise : city.getEnterprizeDirectory().getEnterprizeList()) {
                Object[] row = new Object[4];
                row[0] = enterprise.getName();
                row[1] = state.getName();
                row[2] = city.getName();
                row[3] = enterprise.getEnterprizeType().getValue();

                model.addRow(row);
            }
        }
    }

    private void populateComboBox() {
        stateJComboBox.removeAllItems();
        cityJComboBox.removeAllItems();
        enterpriseTypeJComboBox.removeAllItems();

        for (State state : system.getStateList()) {
            stateJComboBox.addItem(state);  
        for (City city : state.getCityList()) {
            cityJComboBox.addItem(city);
        }
        }
        
        for (Enterprise.EnterprizeType type : Enterprise.EnterprizeType.values()) {
            enterpriseTypeJComboBox.addItem(type);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        enterpriseJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nameJTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        enterpriseTypeJComboBox = new javax.swing.JComboBox();
        submitJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        cityJComboBox = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        stateJComboBox = new javax.swing.JComboBox();

        setBackground(new java.awt.Color(204, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        enterpriseJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Enterprise Name", "State", "City", "Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(enterpriseJTable);
        if (enterpriseJTable.getColumnModel().getColumnCount() > 0) {
            enterpriseJTable.getColumnModel().getColumn(0).setResizable(false);
            enterpriseJTable.getColumnModel().getColumn(1).setResizable(false);
            enterpriseJTable.getColumnModel().getColumn(2).setResizable(false);
            enterpriseJTable.getColumnModel().getColumn(3).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 500, 140));

        jLabel1.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel1.setText("State");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 76, 29));

        jLabel2.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel2.setText("Name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 76, 29));
        add(nameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, 179, 29));

        jLabel3.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel3.setText("Enterprise Type");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 100, 28));

        add(enterpriseTypeJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 179, 28));

        submitJButton.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        submitJButton.setText("Submit");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });
        add(submitJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 440, 180, 34));

        backJButton.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, 29));

        cityJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item1" }));
        add(cityJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 179, 30));

        jLabel4.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel4.setText("City");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 76, 30));

        stateJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(stateJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 179, 29));
    }// </editor-fold>//GEN-END:initComponents

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
  //  String state = (String) stateJComboBox.getSelectedItem();
   // String city = (String) stateJComboBox.getSelectedItem();
   // stateJComboBox.removeAllItems();
   // cityJComboBox.removeAllItems();
        State state = (State) stateJComboBox.getSelectedItem();
        City city = (City) cityJComboBox.getSelectedItem();
        Enterprise.EnterprizeType type = (Enterprise.EnterprizeType) enterpriseTypeJComboBox.getSelectedItem();
        if (state == null || city == null || type == null) {
            JOptionPane.showMessageDialog(null, "Invalid Input!");
            return;
        }

       
        String name = nameJTextField.getText();
        boolean isUniqueEnterprise =  city.getEnterprizeDirectory().checkIfEnterpriseIsUnique(state, city, type, name);
        
        if(isUniqueEnterprise)
        {
        Enterprise enterprise = city.getEnterprizeDirectory().createAndAddEnterprize(name, type);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Enterprise already exists", "Warning", JOptionPane.WARNING_MESSAGE);
        
        }
        
        

        populateTable();
        nameJTextField.setText("");

    }//GEN-LAST:event_submitJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
         Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminWorkAreaJPanel sysAdminwjp = (SystemAdminWorkAreaJPanel) component;
        sysAdminwjp.populateTree();

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JComboBox cityJComboBox;
    private javax.swing.JTable enterpriseJTable;
    private javax.swing.JComboBox enterpriseTypeJComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JComboBox stateJComboBox;
    private javax.swing.JButton submitJButton;
    // End of variables declaration//GEN-END:variables
}