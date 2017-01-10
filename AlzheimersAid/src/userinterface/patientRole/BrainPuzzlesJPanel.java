/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.patientRole;

import java.awt.CardLayout;
import java.awt.Desktop;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author varsha
 */
public class BrainPuzzlesJPanel extends javax.swing.JPanel {

    /**
     * Creates new form BrainPuzzlesJPanel
     */
    private JPanel userProcessContainer;
    public BrainPuzzlesJPanel(JPanel userProcessContainer) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
     
        
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
        puzzle1JLabel = new javax.swing.JLabel();
        puzzle1JButton = new javax.swing.JButton();
        puzzle2JLabel = new javax.swing.JLabel();
        puzzle2JButton = new javax.swing.JButton();
        puzzle3ImageJLabel = new javax.swing.JLabel();
        puzzle3JButton = new javax.swing.JButton();
        puzzle4JLabel = new javax.swing.JLabel();
        puzzle4JButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel1.setText("Play Brain Puzzles!");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 184, 37));

        puzzle1JLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/patientRole/frogger.PNG"))); // NOI18N
        puzzle1JLabel.setText("puzzle 1 image");
        add(puzzle1JLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 150, 111));

        puzzle1JButton.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        puzzle1JButton.setText("Play Now");
        puzzle1JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puzzle1JButtonActionPerformed(evt);
            }
        });
        add(puzzle1JButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 128, 37));

        puzzle2JLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/patientRole/Bubbleshooter.PNG"))); // NOI18N
        puzzle2JLabel.setText("puzzle2 image");
        add(puzzle2JLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 128, 120));

        puzzle2JButton.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        puzzle2JButton.setText("Play Now");
        puzzle2JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puzzle2JButtonActionPerformed(evt);
            }
        });
        add(puzzle2JButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, 128, 34));

        puzzle3ImageJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/patientRole/bockBreaker.PNG"))); // NOI18N
        puzzle3ImageJLabel.setText("puzzle3 image");
        add(puzzle3ImageJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 190, 140));

        puzzle3JButton.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        puzzle3JButton.setText("Play Now");
        puzzle3JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puzzle3JButtonActionPerformed(evt);
            }
        });
        add(puzzle3JButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 128, 35));

        puzzle4JLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/patientRole/mazemonkey.PNG"))); // NOI18N
        puzzle4JLabel.setText("puzzle 4 image");
        add(puzzle4JLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 340, 128, 129));

        puzzle4JButton.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        puzzle4JButton.setText("Play Now");
        puzzle4JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puzzle4JButtonActionPerformed(evt);
            }
        });
        add(puzzle4JButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 490, 128, 35));

        backJButton.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 80, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void puzzle1JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puzzle1JButtonActionPerformed
        // TODO add your handling code here:
         try {
                Desktop.getDesktop().browse(new URL("http://cognitivelabs.com/games_frogger.htm").toURI());
             } catch (Exception e) {}
        
    }//GEN-LAST:event_puzzle1JButtonActionPerformed

    private void puzzle2JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puzzle2JButtonActionPerformed
        // TODO add your handling code here:
        try {
                Desktop.getDesktop().browse(new URL("http://cognitivelabs.com/games_bubbleshooter.htm").toURI());
             } catch (Exception e) {}
    }//GEN-LAST:event_puzzle2JButtonActionPerformed

    private void puzzle3JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puzzle3JButtonActionPerformed
        // TODO add your handling code here:
       try {
                Desktop.getDesktop().browse(new URL("http://cognitivelabs.com/games_blockbreaker.htm").toURI());
             } catch (Exception e) {} 
    }//GEN-LAST:event_puzzle3JButtonActionPerformed

    private void puzzle4JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puzzle4JButtonActionPerformed
        // TODO add your handling code here:
        try {
                Desktop.getDesktop().browse(new URL("http://cognitivelabs.com/games_monkeyisland.htm").toURI());
             } catch (Exception e) {} 
    }//GEN-LAST:event_puzzle4JButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton puzzle1JButton;
    private javax.swing.JLabel puzzle1JLabel;
    private javax.swing.JButton puzzle2JButton;
    private javax.swing.JLabel puzzle2JLabel;
    private javax.swing.JLabel puzzle3ImageJLabel;
    private javax.swing.JButton puzzle3JButton;
    private javax.swing.JButton puzzle4JButton;
    private javax.swing.JLabel puzzle4JLabel;
    // End of variables declaration//GEN-END:variables
}
