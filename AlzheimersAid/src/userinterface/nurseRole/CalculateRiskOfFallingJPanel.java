/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.nurseRole;

import Business.Patient.Patient;
import Business.WorkQueue.NeurologistToNurseFallWorkRequest;
import java.awt.CardLayout;
import javafx.scene.control.Alert;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author varsha
 */
public class CalculateRiskOfFallingJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CalculateRiskOfFallingJPanel
     */
    private JPanel userProcessContainer;
    private NeurologistToNurseFallWorkRequest request;
   private Patient p; 
 
    CalculateRiskOfFallingJPanel(JPanel userProcessContainer, NeurologistToNurseFallWorkRequest request, Patient p) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.request = request;
        this.p = p;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        answer1JButtonGroup = new javax.swing.ButtonGroup();
        answer2JButtonGroup = new javax.swing.ButtonGroup();
        answer3JButtonGroup = new javax.swing.ButtonGroup();
        answer4JButtonGroup = new javax.swing.ButtonGroup();
        answer5JButtonGroup = new javax.swing.ButtonGroup();
        answer6JButtonGroup = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        yes1JRadioButton = new javax.swing.JRadioButton();
        no1JRadioButton = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        yes2JRadioButton = new javax.swing.JRadioButton();
        No2JRadioButton = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        yes3JRadioButton = new javax.swing.JRadioButton();
        no3JRadioButton = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        yes4JRadioButton = new javax.swing.JRadioButton();
        no4JRadioButton = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        answer5aJRadioButton = new javax.swing.JRadioButton();
        answer5bJRadioButton = new javax.swing.JRadioButton();
        answer5cJRadioButton = new javax.swing.JRadioButton();
        answer5dJRadioButton = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        answer6aJRadioButton = new javax.swing.JRadioButton();
        answer6bJRadioButton = new javax.swing.JRadioButton();
        answer6cJRadioButton = new javax.swing.JRadioButton();
        answer6dJRadioButton = new javax.swing.JRadioButton();
        calculateScoreJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel1.setText("Calculate Risk of Falling-");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 150, 40));

        jLabel2.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel2.setText("1. Did the patient present to hospital with a fall or has he or she fallen on the ward since admission ?");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 550, 29));

        answer1JButtonGroup.add(yes1JRadioButton);
        yes1JRadioButton.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        yes1JRadioButton.setText("YES");
        add(yes1JRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        answer1JButtonGroup.add(no1JRadioButton);
        no1JRadioButton.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        no1JRadioButton.setText("NO");
        add(no1JRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, -1, -1));

        jLabel3.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel3.setText("2. Is the patient agitated?");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 227, 24));

        answer2JButtonGroup.add(yes2JRadioButton);
        yes2JRadioButton.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        yes2JRadioButton.setText("YES");
        add(yes2JRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        answer2JButtonGroup.add(No2JRadioButton);
        No2JRadioButton.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        No2JRadioButton.setText("NO");
        add(No2JRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, -1, -1));

        jLabel4.setText("3. Is the patient visually impaired to the extent that everyday function is affected?");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 480, 32));

        answer3JButtonGroup.add(yes3JRadioButton);
        yes3JRadioButton.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        yes3JRadioButton.setText("YES");
        add(yes3JRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, -1, -1));

        answer3JButtonGroup.add(no3JRadioButton);
        no3JRadioButton.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        no3JRadioButton.setText("NO");
        add(no3JRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, -1, -1));

        jLabel5.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel5.setText("4. Is the patient in need of especially frequent toileting?");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 409, 28));

        answer4JButtonGroup.add(yes4JRadioButton);
        yes4JRadioButton.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        yes4JRadioButton.setText("YES");
        add(yes4JRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, -1, -1));

        answer4JButtonGroup.add(no4JRadioButton);
        no4JRadioButton.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        no4JRadioButton.setText("NO");
        add(no4JRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 440, -1, -1));

        jLabel6.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel6.setText("5. Choose one of the following options which best describes the patient's level of capability when transferring from a bed to a chair:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 880, 26));

        answer5JButtonGroup.add(answer5aJRadioButton);
        answer5aJRadioButton.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        answer5aJRadioButton.setText("Unable");
        add(answer5aJRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, -1, -1));

        answer5JButtonGroup.add(answer5bJRadioButton);
        answer5bJRadioButton.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        answer5bJRadioButton.setText("Needs Major Help");
        add(answer5bJRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 530, -1, -1));

        answer5JButtonGroup.add(answer5cJRadioButton);
        answer5cJRadioButton.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        answer5cJRadioButton.setText("Needs Minor Help");
        answer5cJRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answer5cJRadioButtonActionPerformed(evt);
            }
        });
        add(answer5cJRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 530, -1, -1));

        answer5JButtonGroup.add(answer5dJRadioButton);
        answer5dJRadioButton.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        answer5dJRadioButton.setText("Independent");
        add(answer5dJRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 530, -1, -1));

        jLabel7.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel7.setText("6.  Choose one of the following options which best describes the patient's level of mobility:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 570, 780, 27));

        answer6JButtonGroup.add(answer6aJRadioButton);
        answer6aJRadioButton.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        answer6aJRadioButton.setText("Immobile");
        add(answer6aJRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 610, -1, -1));

        answer6JButtonGroup.add(answer6bJRadioButton);
        answer6bJRadioButton.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        answer6bJRadioButton.setText(" Independent with the aid of a wheelchair");
        add(answer6bJRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 610, 310, -1));

        answer6JButtonGroup.add(answer6cJRadioButton);
        answer6cJRadioButton.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        answer6cJRadioButton.setText("Uses walking aid or help of one person");
        add(answer6cJRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 660, -1, -1));

        answer6JButtonGroup.add(answer6dJRadioButton);
        answer6dJRadioButton.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        answer6dJRadioButton.setText(" Independent");
        add(answer6dJRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 660, -1, -1));

        calculateScoreJButton.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        calculateScoreJButton.setText("Calculate Score");
        calculateScoreJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateScoreJButtonActionPerformed(evt);
            }
        });
        add(calculateScoreJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 720, 186, 40));

        backJButton.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 82, 31));
    }// </editor-fold>//GEN-END:initComponents

    private void calculateScoreJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateScoreJButtonActionPerformed
        // TODO add your handling code here:
        //implement algo
        
         boolean answer1;
        boolean answer2;
        boolean answer3;
        boolean answer4;
        String answer5;
        String answer6 = null;
        String answer5a = answer5aJRadioButton.getText();
        String answer5b = answer5bJRadioButton.getText();
        String answer5c = answer5cJRadioButton.getText();
        String answer5d = answer5dJRadioButton.getText();
        String answer6a = answer6aJRadioButton.getText();
        String answer6b = answer6bJRadioButton.getText();
        String answer6c = answer6cJRadioButton.getText();
        String answer6d = answer6dJRadioButton.getText();
        String result = null;
       int score  = 0;
       int subScore = 0;
        
        
        
        
        if (answer1JButtonGroup.isSelected(yes1JRadioButton.getModel())) {
             answer1 = true;
        } else {
             answer1 = false;
        }
        
        if (answer2JButtonGroup.isSelected(yes2JRadioButton.getModel())) {
             answer2 = true;
        } else {
             answer2 = false;
        }
        if (answer3JButtonGroup.isSelected(yes3JRadioButton.getModel())) {
             answer3 = true;
        } else {
             answer3 = false;
        }
        if (answer4JButtonGroup.isSelected(yes4JRadioButton.getModel())) {
             answer4 = true;
        } else {
             answer4 = false;
        }
        
        if (answer5JButtonGroup.isSelected(answer5aJRadioButton.getModel())) {
             answer5 = answer5a;
        } else if (answer5JButtonGroup.isSelected(answer5bJRadioButton.getModel())) {
             answer5= answer5b;
        }
          else if (answer5JButtonGroup.isSelected(answer5cJRadioButton.getModel())) {
             answer5= answer5c;
          }
             else
             {
               answer5 = answer5d; 
        }
        
        if (answer6JButtonGroup.isSelected(answer6aJRadioButton.getModel())) {
             answer6 = answer6a;
        } else if (answer6JButtonGroup.isSelected(answer6bJRadioButton.getModel())) {
             answer5= answer6b;
        }
          else if (answer5JButtonGroup.isSelected(answer6cJRadioButton.getModel())) {
             answer5= answer6c;
          }
             else
             {
               answer5 = answer6d; 
        }
        
        if (answer1 || answer2 || answer3 || answer4)
        {
            score = score +1;
        }
        if (answer5.equals(answer5a) || answer6.equals(answer6a))
        {
            score = score +1 ;
            
        }
        if (answer5.equals(answer5b) || answer6.equals(answer6b))
        {
            subScore = subScore +1 ;
            
        }
        if (answer5.equals(answer5c) || answer6.equals(answer6c))
        {
            subScore = subScore +1 ;
            
        }
        if (answer5.equals(answer5d) || answer6.equals(answer6d))
        {
            score = subScore +1 ;
            
        }
        if(subScore > 3 )
        {
            score  = score  +1;
        }
        
        if(score == 0) 
        {
            result = "Low Risk";
        }
        else if(score == 1)
        {
            result = "Moderate Risk";
        }
        else if (score >= 2)
        {
            result = "High Risk";
        }
        
        if(result != null)
        {
            JOptionPane.showMessageDialog(null, "Risk of Falling\t" + result , "Information",JOptionPane.INFORMATION_MESSAGE);
            request.setTestResult(result);
            request.setStatus("Completed");
            p.setRiskofFallScore(result);
            
        }
       
    }//GEN-LAST:event_calculateScoreJButtonActionPerformed

    
    
    
    
    
    
    
    
    
    
    
    
    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    
    
    
    
    
    
    
    
    private void answer5cJRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answer5cJRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_answer5cJRadioButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton No2JRadioButton;
    private javax.swing.ButtonGroup answer1JButtonGroup;
    private javax.swing.ButtonGroup answer2JButtonGroup;
    private javax.swing.ButtonGroup answer3JButtonGroup;
    private javax.swing.ButtonGroup answer4JButtonGroup;
    private javax.swing.ButtonGroup answer5JButtonGroup;
    private javax.swing.JRadioButton answer5aJRadioButton;
    private javax.swing.JRadioButton answer5bJRadioButton;
    private javax.swing.JRadioButton answer5cJRadioButton;
    private javax.swing.JRadioButton answer5dJRadioButton;
    private javax.swing.ButtonGroup answer6JButtonGroup;
    private javax.swing.JRadioButton answer6aJRadioButton;
    private javax.swing.JRadioButton answer6bJRadioButton;
    private javax.swing.JRadioButton answer6cJRadioButton;
    private javax.swing.JRadioButton answer6dJRadioButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JButton calculateScoreJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton no1JRadioButton;
    private javax.swing.JRadioButton no3JRadioButton;
    private javax.swing.JRadioButton no4JRadioButton;
    private javax.swing.JRadioButton yes1JRadioButton;
    private javax.swing.JRadioButton yes2JRadioButton;
    private javax.swing.JRadioButton yes3JRadioButton;
    private javax.swing.JRadioButton yes4JRadioButton;
    // End of variables declaration//GEN-END:variables
}
