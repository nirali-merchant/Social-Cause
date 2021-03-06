/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.nurseRole;

import Business.Enterprise.Enterprise;
import Business.WorkQueue.VolunteerToNurseCertificationWorkRequest;
import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author varsha
 */
public class TakeCertificationQuizJPanel extends javax.swing.JPanel {

    /**
     * Creates new form TakeCertificationQuizJPanel
     */
    private JPanel userProcessContainer;
    private VolunteerToNurseCertificationWorkRequest request;
   // private VolunteerToNurseCertificationWorkRequest request;
    public TakeCertificationQuizJPanel(JPanel userProcessContainer, VolunteerToNurseCertificationWorkRequest request) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.request = request;
        new DigitalWatch(timerJLabel);
    }

   /* public TakeCertificationQuizJPanel(JPanel userProcessContainer, Enterprise enterprise) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        timerJLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        timerJLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        timerJLabel.setText("//Timer will come here");
        add(timerJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 140, 116, 40));

        jLabel2.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel2.setText("Question : ");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 73, 28));

        jLabel3.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel3.setText("How would you calm an aggressive Alzheimer's patient?");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 430, 34));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jRadioButton1.setText("Try to divert their focus, talk in calm manner");
        add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jRadioButton2.setText("Engage in an argument");
        add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jRadioButton3.setText("Continuously brin on the issue that caused aggression");
        add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jRadioButton4.setText("None of the above");
        add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));

        jButton1.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 108, 37));

        backJButton.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 90, 40));

        jLabel4.setFont(new java.awt.Font("Corbel", 2, 14)); // NOI18N
        jLabel4.setText("*you have 1 minute to anwer this question. The timer is on the right.");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 449, 24));

        jLabel1.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel1.setText("Time Left----");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 100, 121, 24));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //show message 
        if(jRadioButton2.isSelected() || jRadioButton3.isSelected() || jRadioButton4.isSelected())
        {
            JOptionPane.showMessageDialog(null,"Sorry but you didn't clear the test");
            jButton1.setEnabled(false);
            request.setTestResult("Passed");
            request.setStatus("Completed");
            //return;
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Congratulations! You passed the exam");
            jButton1.setEnabled(false);
            request.setTestResult("Failed");
            //return;
        }
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JLabel timerJLabel;
    // End of variables declaration//GEN-END:variables
}
class DigitalWatch implements Runnable{

Thread t=null;
int hours=0, minutes=0, seconds=0;
String timeString = "";
JLabel timerJLabel;
DigitalWatch(JLabel timerJLabel){
	
	this.timerJLabel = timerJLabel;
	t = new Thread(this);
        t.start();
	
	
}

 public void run() {
     // try {
          int i = 60;
          while(i>0)
          {
              //System.out.println("remaining time" + i);
              try{
                  i--;
                  timeString = String.valueOf(i);
                  timerJLabel.setText(timeString);
                  Thread.sleep(1000L);
              }
              catch(InterruptedException e)
              {
              }
              
          }
         
      }
   
 
 public void printTime(){

}

}
