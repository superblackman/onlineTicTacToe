/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalbuild.SinglePlay;


import static finalbuild.Navigation.mainMenu;
import static finalbuild.SinglePlay.MechanicsE.DeclareWinOrDrawE;
import static finalbuild.SinglePlay.MechanicsE.EasyComputerPlayer;
import static finalbuild.SinglePlay.MechanicsE.checkDiagonalE;
import static finalbuild.SinglePlay.MechanicsE.checkHorizontalE;
import static finalbuild.SinglePlay.MechanicsE.checkVerticalE;
import static finalbuild.SinglePlay.MechanicsE.count;
import static finalbuild.SinglePlay.MechanicsE.letter;
import static finalbuild.SinglePlay.MechanicsE.whosTurn;

/**
 *
 * @author giovannikolo
 */
public class Easyboard extends javax.swing.JFrame {

    /**
     * Creates new form Easyboard
     */
    public Easyboard() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MiddleRightButtonE = new javax.swing.JButton();
        BottomLeftButtonE = new javax.swing.JButton();
        BottonMiddleButtonE = new javax.swing.JButton();
        BottomRightButtonE = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        UpperLeftButtonE = new javax.swing.JButton();
        UpperMiddleButtonE = new javax.swing.JButton();
        UpperRightButttonE = new javax.swing.JButton();
        MiddleLeftButtonE = new javax.swing.JButton();
        MiddleMiddleButtonE = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        MiddleRightButtonE.setBackground(new java.awt.Color(255, 255, 255));
        MiddleRightButtonE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MiddleRightButtonEActionPerformed(evt);
            }
        });

        BottomLeftButtonE.setBackground(new java.awt.Color(255, 255, 255));
        BottomLeftButtonE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BottomLeftButtonEActionPerformed(evt);
            }
        });

        BottonMiddleButtonE.setBackground(new java.awt.Color(255, 255, 255));
        BottonMiddleButtonE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BottonMiddleButtonEActionPerformed(evt);
            }
        });

        BottomRightButtonE.setBackground(new java.awt.Color(255, 255, 255));
        BottomRightButtonE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BottomRightButtonEActionPerformed(evt);
            }
        });

        jButton12.setBackground(new java.awt.Color(255, 255, 255));
        jButton12.setText("GIve up!!");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setBackground(new java.awt.Color(255, 255, 255));
        jButton13.setText("Main Menu");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        UpperLeftButtonE.setBackground(new java.awt.Color(255, 255, 255));
        UpperLeftButtonE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpperLeftButtonEActionPerformed(evt);
            }
        });

        UpperMiddleButtonE.setBackground(new java.awt.Color(255, 255, 255));
        UpperMiddleButtonE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpperMiddleButtonEActionPerformed(evt);
            }
        });

        UpperRightButttonE.setBackground(new java.awt.Color(255, 255, 255));
        UpperRightButttonE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpperRightButttonEActionPerformed(evt);
            }
        });

        MiddleLeftButtonE.setBackground(new java.awt.Color(255, 255, 255));
        MiddleLeftButtonE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MiddleLeftButtonEActionPerformed(evt);
            }
        });

        MiddleMiddleButtonE.setBackground(new java.awt.Color(255, 255, 255));
        MiddleMiddleButtonE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MiddleMiddleButtonEActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(UpperLeftButtonE, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UpperMiddleButtonE, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UpperRightButttonE, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(MiddleLeftButtonE, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MiddleMiddleButtonE, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MiddleRightButtonE, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BottomLeftButtonE, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BottonMiddleButtonE, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BottomRightButtonE, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jButton13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UpperLeftButtonE, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UpperMiddleButtonE, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UpperRightButttonE, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MiddleLeftButtonE, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MiddleMiddleButtonE, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MiddleRightButtonE, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BottomLeftButtonE, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BottonMiddleButtonE, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BottomRightButtonE, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MiddleRightButtonEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MiddleRightButtonEActionPerformed
        // TODO add your handling code here:
        count++;
        whosTurn();
        MiddleRightButtonE.setText(letter);
        MiddleRightButtonE.setEnabled(false);
        EasyComputerPlayer();
        checkHorizontalE();
        checkVerticalE();
        checkDiagonalE();
        DeclareWinOrDrawE();
    }//GEN-LAST:event_MiddleRightButtonEActionPerformed

    private void BottomLeftButtonEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BottomLeftButtonEActionPerformed
        // TODO add your handling code here:
        count++;
        whosTurn();
        BottomLeftButtonE.setText(letter);
        BottomLeftButtonE.setEnabled(false);
        EasyComputerPlayer();
        checkHorizontalE();
        checkVerticalE();
        checkDiagonalE();
        DeclareWinOrDrawE();
    }//GEN-LAST:event_BottomLeftButtonEActionPerformed

    private void BottonMiddleButtonEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BottonMiddleButtonEActionPerformed
        // TODO add your handling code here:
        count++;
        whosTurn();
        BottonMiddleButtonE.setText(letter);
        BottonMiddleButtonE.setEnabled(false);
        EasyComputerPlayer();
        checkHorizontalE();
        checkVerticalE();
        checkDiagonalE();
        DeclareWinOrDrawE();
    }//GEN-LAST:event_BottonMiddleButtonEActionPerformed

    private void BottomRightButtonEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BottomRightButtonEActionPerformed
        // TODO add your handling code here:
        count++;
        whosTurn();
        BottomRightButtonE.setText(letter);
        BottomRightButtonE.setEnabled(false);
        EasyComputerPlayer();
        checkHorizontalE();
        checkVerticalE();
        checkDiagonalE();
        DeclareWinOrDrawE();
    }//GEN-LAST:event_BottomRightButtonEActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        DeclareWinOrDrawE();
        
    }//GEN-LAST:event_jButton12ActionPerformed

    private void UpperLeftButtonEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpperLeftButtonEActionPerformed
        // TODO add your handling code here:
        count++;
        whosTurn();
        UpperLeftButtonE.setText(letter);
        UpperLeftButtonE.setEnabled(false);
        EasyComputerPlayer();
        checkHorizontalE();
        checkVerticalE();
        checkDiagonalE();
        DeclareWinOrDrawE();
    }//GEN-LAST:event_UpperLeftButtonEActionPerformed

    private void UpperMiddleButtonEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpperMiddleButtonEActionPerformed
        // TODO add your handling code here:
        count++;
        whosTurn();
        UpperMiddleButtonE.setText(letter);
        UpperMiddleButtonE.setEnabled(false);
        EasyComputerPlayer();
        checkHorizontalE();
        checkVerticalE();
        checkDiagonalE();
        DeclareWinOrDrawE();
    }//GEN-LAST:event_UpperMiddleButtonEActionPerformed

    private void UpperRightButttonEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpperRightButttonEActionPerformed
        // TODO add your handling code here:
        count++;
        whosTurn();
        UpperRightButttonE.setText(letter);
        UpperRightButttonE.setEnabled(false);
        EasyComputerPlayer();
        checkHorizontalE();
        checkVerticalE();
        checkDiagonalE();
        DeclareWinOrDrawE();
    }//GEN-LAST:event_UpperRightButttonEActionPerformed

    private void MiddleLeftButtonEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MiddleLeftButtonEActionPerformed
        // TODO add your handling code here:
        count++;
        whosTurn();
        MiddleLeftButtonE.setText(letter);
        MiddleLeftButtonE.setEnabled(false);
        EasyComputerPlayer();
        checkHorizontalE();
        checkVerticalE();
        checkDiagonalE();
        DeclareWinOrDrawE();
    }//GEN-LAST:event_MiddleLeftButtonEActionPerformed

    private void MiddleMiddleButtonEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MiddleMiddleButtonEActionPerformed
        // TODO add your handling code here:
        
        count++;
        whosTurn();
        MiddleMiddleButtonE.setText(letter);
        MiddleMiddleButtonE.setEnabled(false);
        EasyComputerPlayer();
        checkHorizontalE();
        checkVerticalE();
        checkDiagonalE();
        DeclareWinOrDrawE();
    }//GEN-LAST:event_MiddleMiddleButtonEActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        mainMenu(); 
        this.dispose();
    }//GEN-LAST:event_jButton13ActionPerformed

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
            java.util.logging.Logger.getLogger(Easyboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Easyboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Easyboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Easyboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Easyboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton BottomLeftButtonE;
    public static javax.swing.JButton BottomRightButtonE;
    public static javax.swing.JButton BottonMiddleButtonE;
    public static javax.swing.JButton MiddleLeftButtonE;
    public static javax.swing.JButton MiddleMiddleButtonE;
    public static javax.swing.JButton MiddleRightButtonE;
    public static javax.swing.JButton UpperLeftButtonE;
    public static javax.swing.JButton UpperMiddleButtonE;
    public static javax.swing.JButton UpperRightButttonE;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    // End of variables declaration//GEN-END:variables
}