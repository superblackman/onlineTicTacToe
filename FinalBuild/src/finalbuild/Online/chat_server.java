/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalbuild.Online;
import java.io.*;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author giovannikolo
 */
public class chat_server extends javax.swing.JFrame {

    
    
    /**
     * Creates new form chat_server
     */
    
    static ServerSocket ss;
    static Socket s;
    static DataInputStream dis;
    static DataOutputStream dos;
    public static boolean win = false;
    public static boolean pWin = false;
    public static int count = 0; 
    public chat_server() {
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

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("Give up");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setText("Menu");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(59, 59, 59))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton11))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void checkHorizntal()
    {
        if(jButton1.getText() == jButton2.getText() 
             && jButton2.getText() == jButton3.getText() 
             && jButton1.getText() !="") 
      {
          win = true;
          String msgout = "hWin";
        try {
            dos.writeUTF(msgout);
        } catch (IOException ex) {
            Logger.getLogger(chat_server.class.getName()).log(Level.SEVERE, null, ex);
        }
          
      }
          
        if(jButton4.getText() == jButton5.getText() 
             && jButton5.getText() == jButton6.getText() 
             && jButton4.getText() != "") 
        {
            win = false;
            String msgout = "hWin";
        try {
            dos.writeUTF(msgout);
        } catch (IOException ex) {
            Logger.getLogger(chat_server.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
          
            if(jButton7.getText() == jButton8.getText() 
             && jButton8.getText() == jButton9.getText() 
             && jButton7.getText() != "") 
            {
                win = false;
                String msgout = "hWin";
        try {
            dos.writeUTF(msgout);
        } catch (IOException ex) {
            Logger.getLogger(chat_server.class.getName()).log(Level.SEVERE, null, ex);
        }
            }
    }
    
    public static void checkVertical()
    {
        if(jButton1.getText() == jButton4.getText() 
             && jButton4.getText() == jButton7.getText() 
             && jButton1.getText() != "")
        {
            win = true;
            String msgout = "vWin";
        try {
            dos.writeUTF(msgout);
        } catch (IOException ex) {
            Logger.getLogger(chat_server.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
          
        if(jButton2.getText() == jButton5.getText() 
             && jButton5.getText() == jButton8.getText() 
             && jButton2.getText() != "") 
        {
            win = true;
            String msgout = "vWin";
        try {
            dos.writeUTF(msgout);
        } catch (IOException ex) {
            Logger.getLogger(chat_server.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
          
            if(jButton3.getText() == jButton6.getText() 
             && jButton6.getText() == jButton9.getText() 
             && jButton3.getText() != "")
            {
                win = true;
                String msgout = "vWin";
        try {
            dos.writeUTF(msgout);
        } catch (IOException ex) {
            Logger.getLogger(chat_server.class.getName()).log(Level.SEVERE, null, ex);
        }
            }
    }
    
    public static void checkDiagonal()
    {
        if(jButton1.getText() == jButton5.getText() 
             && jButton5.getText() == jButton9.getText() 
             && jButton1.getText() != "") 
        {
            win = false;
            String msgout = "dWin";
        try {
            dos.writeUTF(msgout);
        } catch (IOException ex) {
            Logger.getLogger(chat_server.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
          
        if(jButton3.getText() == jButton5.getText() 
             && jButton5.getText() == jButton7.getText() 
             && jButton3.getText() != "")
        {
            win = false;
            String msgout = "dWin";
        try {
            dos.writeUTF(msgout);
        } catch (IOException ex) {
            Logger.getLogger(chat_server.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }
    
    public static void declareWinOrDraw()
    {
        if (win == true && pWin == false)
        {
            
            JOptionPane.showMessageDialog(null, "you have won");
            clearBoard();
        }
        if 
                (win == false && pWin == true)
        {
            JOptionPane.showMessageDialog(null, " you have lost ");
            clearBoard();
        }
        if
            (win == false && pWin == false && count ==9)
        {
            JOptionPane.showMessageDialog(null, "its a draw....youre both losers");
            clearBoard();
        }
            
    }
    
    public static void clearBoard()
    {
        jButton1.setText("");
        jButton1.setEnabled(true);
        jButton2.setText("");
        jButton2.setEnabled(true);
        jButton3.setText("");
        jButton3.setEnabled(true);
        jButton4.setText("");
        jButton4.setEnabled(true);
        jButton5.setText("");
        jButton5.setEnabled(true);
        jButton6.setText("");
        jButton6.setEnabled(true);
        jButton7.setText("");
        jButton7.setEnabled(true);
        jButton8.setText("");
        jButton8.setEnabled(true);
        jButton9.setText("");
        jButton9.setEnabled(true);
        count = 0;
    }
    
    
    
    
    
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        count++;
        String msgout = "ULB";
        try {
            dos.writeUTF(msgout);
        } catch (IOException ex) {
            Logger.getLogger(chat_server.class.getName()).log(Level.SEVERE, null, ex);
        }
        jButton1.setText("X");
        jButton1.setEnabled(false);
        checkHorizntal();
        checkVertical();
        checkDiagonal();
        declareWinOrDraw();
        
                
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
      count++;
        String msgout = "UMB";
        try {
            dos.writeUTF(msgout);
        } catch (IOException ex) {
            Logger.getLogger(chat_server.class.getName()).log(Level.SEVERE, null, ex);
        } 
        jButton2.setText("X");
        jButton2.setEnabled(false);
        checkHorizntal();
        checkVertical();
        checkDiagonal();
        declareWinOrDraw();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        count++;
        String msgout = "URB";
        try {
            dos.writeUTF(msgout);
        } catch (IOException ex) {
            Logger.getLogger(chat_server.class.getName()).log(Level.SEVERE, null, ex);
        }
        jButton3.setText("X");
        jButton3.setEnabled(false);
        checkHorizntal();
        checkVertical();
        checkDiagonal();
        declareWinOrDraw();
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
       count++;
        String msgout = "MLB";
        try {
            dos.writeUTF(msgout);
        } catch (IOException ex) {
            Logger.getLogger(chat_server.class.getName()).log(Level.SEVERE, null, ex);
        }
        jButton4.setText("X");
        jButton4.setEnabled(false);
        checkHorizntal();
        checkVertical();
        checkDiagonal();
        declareWinOrDraw();
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        count++;
        String msgout = "MMB";
        try {
            dos.writeUTF(msgout);
        } catch (IOException ex) {
            Logger.getLogger(chat_server.class.getName()).log(Level.SEVERE, null, ex);
        }
        jButton5.setText("X");
        jButton5.setEnabled(false);
        checkHorizntal();
        checkVertical();
        checkDiagonal();
        declareWinOrDraw();
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        count++;
        String msgout = "MRB";
        try {
            dos.writeUTF(msgout);
        } catch (IOException ex) {
            Logger.getLogger(chat_server.class.getName()).log(Level.SEVERE, null, ex);
        }
        jButton6.setText("X");
        jButton6.setEnabled(false);
        checkHorizntal();
        checkVertical();
        checkDiagonal();
        declareWinOrDraw();
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        count++;
        String msgout = "BLB";
        try {
            dos.writeUTF(msgout);
        } catch (IOException ex) {
            Logger.getLogger(chat_server.class.getName()).log(Level.SEVERE, null, ex);
        }
        jButton7.setText("X");
        jButton7.setEnabled(false);
        checkHorizntal();
        checkVertical();
        checkDiagonal();
        declareWinOrDraw();
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        count++;
        String msgout = "BMB";
        try {
            dos.writeUTF(msgout);
        } catch (IOException ex) {
            Logger.getLogger(chat_server.class.getName()).log(Level.SEVERE, null, ex);
        }
        jButton8.setText("X");
        jButton8.setEnabled(false);
        checkHorizntal();
        checkVertical();
        checkDiagonal();
        declareWinOrDraw();
        
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        count++;
        String msgout = "BRB";
        try {
            dos.writeUTF(msgout);
        } catch (IOException ex) {
            Logger.getLogger(chat_server.class.getName()).log(Level.SEVERE, null, ex);
        }
        jButton9.setText("X");
        jButton9.setEnabled(false);
        checkHorizntal();
        checkVertical();
        checkDiagonal();
        declareWinOrDraw();
        
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "you gave up and becaise of that you have lost");
        String msgout = "GU";
        try {
            dos.writeUTF(msgout);
        } catch (IOException ex) {
            Logger.getLogger(chat_server.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton10ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])  {
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
            java.util.logging.Logger.getLogger(chat_server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(chat_server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(chat_server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(chat_server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new chat_server().setVisible(true);
            }
        });
        
        String msgin = "";
        
        try{
            ss = new ServerSocket(1201);
            s = ss.accept();
            dis = new DataInputStream(s.getInputStream());
            dos = new DataOutputStream(s.getOutputStream());
            
            while (!msgin.equals("exit"))
            {
                msgin = dis.readUTF();
                
                if(msgin.equals("ULB"))
                {
                    jButton1.setText("O");
                    jButton1.setEnabled(false);
                    
                }
                
                if(msgin.equals("UMB"))
           {
               jButton2.setText("O");
               jButton2.setEnabled(false);
               
           }
                if(msgin.equals("URB"))
           {
               jButton3.setText("O");
               jButton3.setEnabled(false);
               
           }
                if(msgin.equals("MLB"))
           {
               jButton4.setText("O");
               jButton4.setEnabled(false);
               
           }
                if(msgin.equals("MMB"))
           {
               jButton5.setText("O");
               jButton5.setEnabled(false);
               
           }
                if(msgin.equals("MRB"))
           {
               jButton6.setText("O");
               jButton6.setEnabled(false);
               
           }
                if(msgin.equals("BLB"))
           {
               jButton7.setText("O");
               jButton7.setEnabled(false);
               
           }
                if(msgin.equals("BMB"))
           {
               jButton8.setText("O");
               jButton8.setEnabled(false);
               
           }
                if(msgin.equals("BRB"))
           {
               jButton9.setText("O");
               jButton9.setEnabled(false);
              
           }
                if(msgin.equals("GU"))
           {
               JOptionPane.showMessageDialog(null, "you have won, opponent have quit");
           }
                if(msgin.equals("hWin"))
                {
                    win = false;
                    pWin = true;
                    
                }  
                if(msgin.equals("vWin"))
                {
                    win = false;
                    pWin = true;
                    
                }  
                if(msgin.equals("dWin"))
                {
                    win = false;
                    pWin = true;
                    
                }  
            }
        } catch (IOException ex) {
            Logger.getLogger(chat_server.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    public static javax.swing.JButton jButton2;
    public static javax.swing.JButton jButton3;
    public static javax.swing.JButton jButton4;
    public static javax.swing.JButton jButton5;
    public static javax.swing.JButton jButton6;
    public static javax.swing.JButton jButton7;
    public static javax.swing.JButton jButton8;
    public static javax.swing.JButton jButton9;
    // End of variables declaration//GEN-END:variables
}