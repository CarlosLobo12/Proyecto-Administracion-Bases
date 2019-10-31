/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bases.view.recuperacion_respaldos;

import bases.model.Modelo;
import bases.view.admin_tablespaces.menu_admin_tablespaces;
import bases.view.creacion_respaldos.menu_creacion_respaldos;
import bases.view.menuprincipal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CALIL
 */
public class menu_recuperacionRespaldos extends javax.swing.JFrame {

    /**
     * Creates new form menu_recuperacionRespaldos
     */
    public menu_recuperacionRespaldos() {
        try {
            initComponents();
            comboDirectorios();
            comboUsuarios();
            comboSquemas();
            this.setResizable(false);
            this.setLocationRelativeTo(null);
        } catch (SQLException ex) {
            Logger.getLogger(menu_recuperacionRespaldos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void comboUsuarios () throws SQLException {
    
     Modelo modelo = new Modelo();
    
    String sql ="SELECT USERNAME FROM DBA_USERS";
        try {
            if (modelo.consulta(sql)!=null) {
                ResultSet resultados;
                resultados = modelo.consulta(sql);
                 if (resultados!=null) {
                    while(resultados.next()){
                     Object dato[]= new Object [7];
                      check_ususario.addItem(resultados.getString("USERNAME"));
                     /*for (int i=0;i<7;i++){
                         dato[i] = resultados.getObject(i+1);
                        
                     }*/ 

                } 
            } 
                System.out.println(resultados);
            }else{
                System.out.println("Adios mundo");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(menu_admin_tablespaces.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    

        
public void comboDirectorios () throws SQLException{
    
    Modelo modelo = new Modelo();
    
    String sql ="select DIRECTORY_NAME from all_directories";
        try {
            if (modelo.consulta(sql)!=null) {
                ResultSet resultados;
                resultados = modelo.consulta(sql);
                 if (resultados!=null) {
                    while(resultados.next()){
                     Object dato[]= new Object [7];
                      directorio_Recuperar.addItem(resultados.getString("DIRECTORY_NAME"));
                     /*for (int i=0;i<7;i++){
                         dato[i] = resultados.getObject(i+1);
                        
                     }*/ 

                } 
            } 
                System.out.println(resultados);
            }else{
                System.out.println("Adios mundo");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(menu_admin_tablespaces.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    String sql2 ="select DIRECTORY_NAME from all_directories";
        try {
            if (modelo.consulta(sql)!=null) {
                ResultSet resultados;
                resultados = modelo.consulta(sql2);
                 if (resultados!=null) {
                    while(resultados.next()){
                     Object dato[]= new Object [7];
                      directorio_RecuperarSchema.addItem(resultados.getString("DIRECTORY_NAME"));
                     /*for (int i=0;i<7;i++){
                         dato[i] = resultados.getObject(i+1);
                        
                     }*/ 

                } 
            } 
                System.out.println(resultados);
            }else{
                System.out.println("Adios mundo");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(menu_admin_tablespaces.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    


public void comboTabla() throws SQLException{
    
      Modelo modelo = new Modelo();
    
    String sql ="SELECT TABLE_NAME FROM DBA_TABLES WHERE OWNER = '" + check_ususario.getSelectedItem() + "'";
        try {
            if (modelo.consulta(sql)!=null) {
                ResultSet resultados;
                resultados = modelo.consulta(sql);
                 if (resultados!=null) {
                    while(resultados.next()){
                     Object dato[]= new Object [7];
                      comboTabla.addItem(resultados.getString("TABLE_NAME"));
                     /*for (int i=0;i<7;i++){
                         dato[i] = resultados.getObject(i+1);
                        
                     }*/ 

                } 
            } 
                System.out.println(resultados);
            }else{
                System.out.println("Adios mundo");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(menu_admin_tablespaces.class.getName()).log(Level.SEVERE, null, ex);
        }
}


public void comboSquemas() throws SQLException{
    
    Modelo modelo = new Modelo();
    
    String sql ="SELECT USERNAME FROM DBA_USERS";
        try {
            if (modelo.consulta(sql)!=null) {
                ResultSet resultados;
                resultados = modelo.consulta(sql);
                 if (resultados!=null) {
                    while(resultados.next()){
                     Object dato[]= new Object [7];
                      check_schema.addItem(resultados.getString("USERNAME"));
                     /*for (int i=0;i<7;i++){
                         dato[i] = resultados.getObject(i+1);
                        
                     }*/ 

                } 
            } 
                System.out.println(resultados);
            }else{
                System.out.println("Adios mundo");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(menu_admin_tablespaces.class.getName()).log(Level.SEVERE, null, ex);
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

        btn_regresar1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tabla_Recuperar = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        check_ususario = new javax.swing.JComboBox<>();
        password_conexion = new javax.swing.JTextField();
        comboTabla = new javax.swing.JComboBox<>();
        directorio_Recuperar = new javax.swing.JComboBox<>();
        btn_recuperar = new javax.swing.JButton();
        btn_recuperarFull = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        check_schema = new javax.swing.JComboBox<>();
        password_schema = new javax.swing.JTextField();
        directorio_RecuperarSchema = new javax.swing.JComboBox<>();
        btn_recuperar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_regresar1.setText("Regresar");
        btn_regresar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regresar1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Menu de recuperacion de respaldos");

        jLabel2.setText("Recuperacion de tablas ");

        jLabel3.setText("Recuperacion por Schema");

        jLabel4.setText("Recuperacion Full");

        jLabel5.setText("Selccione Ususrio");

        tabla_Recuperar.setText("Tabla a recuperar:");

        jLabel7.setText("Digite la contraseña:");

        jLabel8.setText("Seleccione el directorio:");

        check_ususario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_ususarioActionPerformed(evt);
            }
        });

        btn_recuperar.setText("Recuperar tabla");
        btn_recuperar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_recuperarActionPerformed(evt);
            }
        });

        btn_recuperarFull.setText("Recuperar Full");
        btn_recuperarFull.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_recuperarFullActionPerformed(evt);
            }
        });

        jLabel6.setText("Selccione el Schema:");

        jLabel9.setText("Digite la contraseña:");

        jLabel10.setText("Seleccione el directorio:");

        btn_recuperar1.setText("Recuperar schema");
        btn_recuperar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_recuperar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(922, Short.MAX_VALUE)
                        .addComponent(btn_regresar1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(380, 380, 380)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tabla_Recuperar, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(check_ususario, 0, 157, Short.MAX_VALUE)
                    .addComponent(password_conexion)
                    .addComponent(comboTabla, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(directorio_Recuperar, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(check_schema, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(password_schema)
                    .addComponent(directorio_RecuperarSchema, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(102, 102, 102))
            .addGroup(layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(200, 200, 200))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_recuperarFull)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(btn_recuperar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_recuperar1)))
                        .addGap(202, 202, 202))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_recuperar1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(check_ususario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(password_conexion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tabla_Recuperar)
                                    .addComponent(comboTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(directorio_Recuperar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(check_schema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(password_schema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(directorio_RecuperarSchema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addComponent(btn_recuperar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(29, 29, 29)
                        .addComponent(btn_recuperarFull)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)))
                .addComponent(btn_regresar1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_regresar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regresar1ActionPerformed
        // TODO add your handling code here:
        menuprincipal menu = new menuprincipal();
        this.setVisible(false);
        menu.setVisible(true);
    }//GEN-LAST:event_btn_regresar1ActionPerformed

    private void check_ususarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_ususarioActionPerformed
        // TODO add your handling code here:
         try {
            // TODO add your handling code here:
            comboTabla.removeAllItems();
            comboTabla();
         } catch (SQLException ex) {
            Logger.getLogger(menu_creacion_respaldos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_check_ususarioActionPerformed

    private void btn_recuperarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_recuperarActionPerformed
        // TODO add your handling code here:
        
        Modelo modelo = new Modelo();
        
          String usuario = (String) check_ususario.getSelectedItem();
          String contracena = password_conexion.getText();
          String tabla = (String) comboTabla.getSelectedItem();
          String directorio = (String) directorio_Recuperar.getSelectedItem();
          String sql = "IMPDP " + usuario + "/" + 
                  contracena + "@XE TABLES="+usuario+"." + tabla + " DIRECTORY="+directorio+" DUMPFILE=" + tabla + ".DMP LOGFILE=" + tabla + ".LOG;";
        
        try {
            if (modelo.consulta(sql)!=null) {
                ResultSet resultados;
                resultados = modelo.consulta(sql);      
                System.out.println(resultados);
            }else{
                System.out.println("Adios mundo");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(menu_admin_tablespaces.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_recuperarActionPerformed

    private void btn_recuperar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_recuperar1ActionPerformed
        // TODO add your handling code here:
        Modelo modelo = new Modelo();
        
       String usuario = (String) check_schema.getSelectedItem();
       String contracena = password_schema.getText();
       String directorio = (String) directorio_RecuperarSchema.getSelectedItem();
       
       String sql = "IMPDP " + usuario + "/" + contracena + "@XE SCHEMAS=" + 
                usuario + " DIRECTORY="+directorio+" DUMPFILE=" + usuario + ".DMP LOGFILE=" + usuario + ".LOG;";
        
        try {
            if (modelo.consulta(sql)!=null) {
                ResultSet resultados;
                resultados = modelo.consulta(sql);      
                System.out.println(resultados);
            }else{
                System.out.println("Adios mundo");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(menu_admin_tablespaces.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_recuperar1ActionPerformed

    private void btn_recuperarFullActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_recuperarFullActionPerformed
        // TODO add your handling code here:
        Modelo modelo = new Modelo();     
       String sql = "IMPDP SYSTEM/root@XE FULL=Y DIRECTORY=RESPALDO DUMPFILE=XE.DMP LOGFILE=XE.LOG;";
        
        try {
            if (modelo.consulta(sql)!=null) {
                ResultSet resultados;
                resultados = modelo.consulta(sql);      
                System.out.println(resultados);
            }else{
                System.out.println("Adios mundo");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(menu_admin_tablespaces.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_recuperarFullActionPerformed

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
            java.util.logging.Logger.getLogger(menu_recuperacionRespaldos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu_recuperacionRespaldos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu_recuperacionRespaldos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu_recuperacionRespaldos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu_recuperacionRespaldos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_recuperar;
    private javax.swing.JButton btn_recuperar1;
    private javax.swing.JButton btn_recuperarFull;
    private javax.swing.JButton btn_regresar1;
    private javax.swing.JComboBox<String> check_schema;
    private javax.swing.JComboBox<String> check_ususario;
    private javax.swing.JComboBox<String> comboTabla;
    private javax.swing.JComboBox<String> directorio_Recuperar;
    private javax.swing.JComboBox<String> directorio_RecuperarSchema;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField password_conexion;
    private javax.swing.JTextField password_schema;
    private javax.swing.JLabel tabla_Recuperar;
    // End of variables declaration//GEN-END:variables
}
