/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import javax.swing.JOptionPane;


/**
 *
 * @author sanch
 */
public class interdazdef extends javax.swing.JFrame {
  
         Classes clak = new Classes();
    
    
    /**
     * Creates new form interdazdef
     */
    
    public interdazdef() {
        
      
       
        
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

        jLabellanguage = new javax.swing.JLabel();
        jLabelname = new javax.swing.JLabel();
        jLabelperfilfoto = new javax.swing.JLabel();
        jButtonfindwork = new javax.swing.JButton();
        jButtonfriends = new javax.swing.JButton();
        jButtonmessages = new javax.swing.JButton();
        jButtoncontact = new javax.swing.JButton();
        jButtonoptions = new javax.swing.JButton();
        jButtonbackwards = new javax.swing.JButton();
        jLabelsummary = new javax.swing.JLabel();
        jLabelgrama = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabelline2 = new javax.swing.JLabel();
        jButtoninfoo = new javax.swing.JButton();
        jLabelexperience = new javax.swing.JLabel();
        jLabelskills = new javax.swing.JLabel();
        jLabelinf1 = new javax.swing.JLabel();
        jLabelinf2 = new javax.swing.JLabel();
        jLabelinf3 = new javax.swing.JLabel();
        jLabelflag = new javax.swing.JLabel();
        jLabelinf4 = new javax.swing.JLabel();
        jLabelinf5 = new javax.swing.JLabel();
        jLabellines = new javax.swing.JLabel();
        jLabelusertype = new javax.swing.JLabel();
        jLabellineaverde = new javax.swing.JLabel();
        jLabelbckgr = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabellanguage.setFont(new java.awt.Font("Bebas", 1, 24)); // NOI18N
        jLabellanguage.setText("Languages");
        getContentPane().add(jLabellanguage, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 580, -1, -1));

        jLabelname.setBackground(new java.awt.Color(255, 255, 255));
        jLabelname.setFont(new java.awt.Font("Bebas", 1, 36)); // NOI18N
        jLabelname.setOpaque(true);
        jLabelname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelnameMouseEntered(evt);
            }
        });
        getContentPane().add(jLabelname, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 320, 290, 50));

        jLabelperfilfoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/profilepicgrande.png"))); // NOI18N
        getContentPane().add(jLabelperfilfoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, -1, -1));

        jButtonfindwork.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Picture11.png"))); // NOI18N
        jButtonfindwork.setBorder(null);
        jButtonfindwork.setBorderPainted(false);
        jButtonfindwork.setContentAreaFilled(false);
        jButtonfindwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonfindworkActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonfindwork, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 470, 70, 40));

        jButtonfriends.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/friends.png"))); // NOI18N
        jButtonfriends.setBorder(null);
        jButtonfriends.setBorderPainted(false);
        jButtonfriends.setContentAreaFilled(false);
        getContentPane().add(jButtonfriends, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 470, -1, 40));

        jButtonmessages.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/message.png"))); // NOI18N
        jButtonmessages.setBorder(null);
        jButtonmessages.setBorderPainted(false);
        jButtonmessages.setContentAreaFilled(false);
        getContentPane().add(jButtonmessages, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 470, 70, 40));

        jButtoncontact.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/infouser.png"))); // NOI18N
        jButtoncontact.setBorder(null);
        jButtoncontact.setBorderPainted(false);
        jButtoncontact.setContentAreaFilled(false);
        getContentPane().add(jButtoncontact, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 460, 70, 50));

        jButtonoptions.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/options.png"))); // NOI18N
        jButtonoptions.setBorder(null);
        jButtonoptions.setBorderPainted(false);
        jButtonoptions.setContentAreaFilled(false);
        jButtonoptions.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonoptionsMouseClicked(evt);
            }
        });
        jButtonoptions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonoptionsActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonoptions, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 0, 50, 60));

        jButtonbackwards.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/back.png"))); // NOI18N
        jButtonbackwards.setBorder(null);
        jButtonbackwards.setBorderPainted(false);
        jButtonbackwards.setContentAreaFilled(false);
        jButtonbackwards.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonbackwardsActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonbackwards, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, 60));

        jLabelsummary.setFont(new java.awt.Font("Bebas", 1, 24)); // NOI18N
        jLabelsummary.setText(" summary");
        getContentPane().add(jLabelsummary, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 560, -1, -1));

        jLabelgrama.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bg verde.jpg"))); // NOI18N
        getContentPane().add(jLabelgrama, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -100, 1030, -1));

        jScrollPane3.setBorder(null);

        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextArea3.setRows(5);
        jTextArea3.setText("              \tFerris State University, \n\tBig Rapids, MI.\n    \tBachelor of Science\n  \tMichigan Manufacturing \n\tCertified Six Sigma Black Belt");
        jTextArea3.setBorder(null);
        jScrollPane3.setViewportView(jTextArea3);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 600, 300, 100));

        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextArea2.setRows(5);
        jTextArea2.setText("Business Strategy\nSales Management\nChange Management\nManagement Negotiation\nNew Business\nDevelopment Coaching");
        jTextArea2.setAutoscrolls(false);
        jTextArea2.setBorder(null);
        jTextArea2.setCaretColor(new java.awt.Color(255, 255, 255));
        jTextArea2.setMaximumSize(new java.awt.Dimension(0, 0));
        jTextArea2.setMinimumSize(new java.awt.Dimension(0, 0));
        jTextArea2.setRequestFocusEnabled(false);
        jTextArea2.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(jTextArea2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 730, 180, 110));

        jScrollPane1.setBorder(null);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Extensive experience in engineering and management, \nresearch and development, leadership and mentoring, \nand test and problem solving. \nMy engineering forte is in electrical/electronic and \nautomated \ntest systems. Expert at analyzing and solving \nthe most complex\nof problems.\n My solutions have saved over $23,000,000 in costs\nto date. Self motivated professional, capable of\nworking independently or as part of a team.");
        jTextArea1.setAutoscrolls(false);
        jTextArea1.setBorder(null);
        jTextArea1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 600, 350, 230));

        jLabelline2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Picture12.png"))); // NOI18N
        getContentPane().add(jLabelline2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 510, 150, 10));

        jButtoninfoo.setBackground(new java.awt.Color(255, 255, 255));
        jButtoninfoo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/info.png"))); // NOI18N
        jButtoninfoo.setBorder(null);
        jButtoninfoo.setBorderPainted(false);
        jButtoninfoo.setContentAreaFilled(false);
        jButtoninfoo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtoninfooMouseClicked(evt);
            }
        });
        jButtoninfoo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtoninfooActionPerformed(evt);
            }
        });
        getContentPane().add(jButtoninfoo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, -1, -1));

        jLabelexperience.setFont(new java.awt.Font("Bebas", 1, 24)); // NOI18N
        jLabelexperience.setText("Education");
        getContentPane().add(jLabelexperience, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 550, 130, 30));

        jLabelskills.setFont(new java.awt.Font("Bebas", 1, 24)); // NOI18N
        jLabelskills.setText(" Skills");
        getContentPane().add(jLabelskills, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 700, -1, -1));

        jLabelinf1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/infinity1.png"))); // NOI18N
        getContentPane().add(jLabelinf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 380, -1, -1));

        jLabelinf2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/infinity2.png"))); // NOI18N
        getContentPane().add(jLabelinf2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 380, -1, -1));

        jLabelinf3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/infinity3.png"))); // NOI18N
        getContentPane().add(jLabelinf3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 380, -1, -1));

        jLabelflag.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/glafrenw.png"))); // NOI18N
        getContentPane().add(jLabelflag, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 620, -1, -1));

        jLabelinf4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/infinity4.png"))); // NOI18N
        getContentPane().add(jLabelinf4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 380, -1, -1));

        jLabelinf5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/infinity5.png"))); // NOI18N
        getContentPane().add(jLabelinf5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 430, -1, -1));

        jLabellines.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Picture12.png"))); // NOI18N
        getContentPane().add(jLabellines, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 510, 150, 10));

        jLabelusertype.setFont(new java.awt.Font("Bebas", 0, 12)); // NOI18N
        jLabelusertype.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/infinity5username.png"))); // NOI18N
        getContentPane().add(jLabelusertype, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 480, 120, 70));

        jLabellineaverde.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LineasPF.png"))); // NOI18N
        getContentPane().add(jLabellineaverde, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 230, 1070, 160));

        jLabelbckgr.setBackground(new java.awt.Color(255, 255, 255));
        jLabelbckgr.setOpaque(true);
        getContentPane().add(jLabelbckgr, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 870));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtoninfooActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtoninfooActionPerformed
        // TODO add your handling code here  
    }//GEN-LAST:event_jButtoninfooActionPerformed

    private void jButtonbackwardsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonbackwardsActionPerformed
        Inicio_sesion2 nombre2 = new Inicio_sesion2();
        nombre2.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jButtonbackwardsActionPerformed

    private void jButtonfindworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonfindworkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonfindworkActionPerformed

    private void jButtonoptionsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonoptionsMouseClicked
      Configuracion abrir = new Configuracion();
      abrir.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_jButtonoptionsMouseClicked

    private void jButtonoptionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonoptionsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonoptionsActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        
        
     
            
      
    }//GEN-LAST:event_formWindowActivated

    private void jLabelnameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelnameMouseEntered
        //
        //
    }//GEN-LAST:event_jLabelnameMouseEntered

    private void jButtoninfooMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtoninfooMouseClicked
        JOptionPane.showMessageDialog(this, "ZEPENOOB");
    }//GEN-LAST:event_jButtoninfooMouseClicked

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
            java.util.logging.Logger.getLogger(interdazdef.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interdazdef.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interdazdef.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interdazdef.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interdazdef().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonbackwards;
    private javax.swing.JButton jButtoncontact;
    private javax.swing.JButton jButtonfindwork;
    private javax.swing.JButton jButtonfriends;
    private javax.swing.JButton jButtoninfoo;
    private javax.swing.JButton jButtonmessages;
    private javax.swing.JButton jButtonoptions;
    private javax.swing.JLabel jLabelbckgr;
    private javax.swing.JLabel jLabelexperience;
    private javax.swing.JLabel jLabelflag;
    private javax.swing.JLabel jLabelgrama;
    private javax.swing.JLabel jLabelinf1;
    private javax.swing.JLabel jLabelinf2;
    private javax.swing.JLabel jLabelinf3;
    private javax.swing.JLabel jLabelinf4;
    private javax.swing.JLabel jLabelinf5;
    private javax.swing.JLabel jLabellanguage;
    private javax.swing.JLabel jLabelline2;
    private javax.swing.JLabel jLabellineaverde;
    private javax.swing.JLabel jLabellines;
    private javax.swing.JLabel jLabelname;
    private javax.swing.JLabel jLabelperfilfoto;
    private javax.swing.JLabel jLabelskills;
    private javax.swing.JLabel jLabelsummary;
    private javax.swing.JLabel jLabelusertype;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    // End of variables declaration//GEN-END:variables
}
