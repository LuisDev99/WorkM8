
package interfaz;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Inicio_sesion extends javax.swing.JFrame {
    public  ArrayList <String> usuarios = new ArrayList<>();
    public  ArrayList <String> contrasenas = new ArrayList<>();
    public static String posicion;
    public static boolean verificador = false;
    public static boolean verificador1 = false;

    
    public Inicio_sesion() {
        initComponents();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        Iniciar_Sesion = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Uname = new javax.swing.JTextField();
        Pword = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        Registrarse = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(java.awt.SystemColor.activeCaptionText);
        setIconImages(null);
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
        jPanel2.add(Uname);
        Uname.setBounds(130, 160, 130, 20);

        Pword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PwordActionPerformed(evt);
            }
        });
        jPanel2.add(Pword);
        Pword.setBounds(130, 190, 130, 20);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("¿Aún no tienes una cuenta?");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(120, 270, 170, 20);

        Registrarse.setText("Regístrate");
        Registrarse.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Registrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarseActionPerformed(evt);
            }
        });
        jPanel2.add(Registrarse);
        Registrarse.setBounds(130, 300, 130, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PwordActionPerformed
        
    }//GEN-LAST:event_PwordActionPerformed

    private void Iniciar_SesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Iniciar_SesionActionPerformed
        
        for(int x = 0 ; x<usuarios.size();x++){
         if(Uname.getText().equals(usuarios.get(x)) && Pword.getText().equals(contrasenas.get(x))){
              verificador = true;
              
            }
           break;
          }
          
           if(verificador == true){
               Registrarse id = new Registrarse();
               id.setVisible(true);
               this.dispose();
               
               
           }
           
          
          else{
             JOptionPane.showMessageDialog(this,"Contrasena Incorrecta");
          }
          
        
          
      
     
      
    }//GEN-LAST:event_Iniciar_SesionActionPerformed

    private void RegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarseActionPerformed
               Registrarse id = new Registrarse();
               id.setVisible(true);
               this.dispose();
    }//GEN-LAST:event_RegistrarseActionPerformed
      
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio_sesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Iniciar_Sesion;
    private javax.swing.JPasswordField Pword;
    private javax.swing.JButton Registrarse;
    private javax.swing.JTextField Uname;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
 

   
}
