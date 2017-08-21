
package interfaz;


public class Inicio_sesion extends javax.swing.JFrame {

    
    public Inicio_sesion() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Iniciar_Sesion = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Nom_Usuario = new javax.swing.JTextField();
        Contraseña = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        Registrarse = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/Zzz.png"))); // NOI18N
        jLabel2.setText("adasdas");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(java.awt.SystemColor.activeCaptionText);
        setUndecorated(true);

        jPanel2.setLayout(null);

        Iniciar_Sesion.setText("Iniciar Sesión");
        Iniciar_Sesion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Iniciar_Sesion.setMaximumSize(null);
        Iniciar_Sesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Iniciar_SesionActionPerformed(evt);
            }
        });
        jPanel2.add(Iniciar_Sesion);
        Iniciar_Sesion.setBounds(130, 230, 130, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Usuario:");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(70, 160, 50, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Contraseña:");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(50, 190, 70, 20);
        jPanel2.add(Nom_Usuario);
        Nom_Usuario.setBounds(130, 160, 130, 20);

        Contraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContraseñaActionPerformed(evt);
            }
        });
        jPanel2.add(Contraseña);
        Contraseña.setBounds(130, 190, 130, 20);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("¿Aún no tienes una cuenta?");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(120, 270, 170, 20);

        Registrarse.setText("Regístrate");
        Registrarse.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(Registrarse);
        Registrarse.setBounds(130, 300, 130, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/Zzz - Copy.png"))); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(30, 0, 360, 370);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/nautica-color-azul_1209457.jpg"))); // NOI18N
        jLabel8.setText("jLabel8");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(10, 0, 370, 370);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ContraseñaActionPerformed

    private void Iniciar_SesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Iniciar_SesionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Iniciar_SesionActionPerformed
      
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio_sesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Contraseña;
    private javax.swing.JButton Iniciar_Sesion;
    private javax.swing.JTextField Nom_Usuario;
    private javax.swing.JButton Registrarse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
