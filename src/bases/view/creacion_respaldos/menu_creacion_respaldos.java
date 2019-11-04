/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bases.view.creacion_respaldos;

import bases.model.Modelo;
import bases.view.admin_tablespaces.menu_admin_tablespaces;
import bases.view.menuprincipal;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CALIL
 */


public class menu_creacion_respaldos extends javax.swing.JFrame {

    /**
     * Creates new form menu_creacion_respaldos
     */
   
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
                      selecUser.addItem(resultados.getString("USERNAME"));
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
                      direcS.addItem(resultados.getString("DIRECTORY_NAME"));
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
                      direcT.addItem(resultados.getString("DIRECTORY_NAME"));
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
    
    String sql ="SELECT TABLE_NAME FROM DBA_TABLES WHERE OWNER = '" + selecUser.getSelectedItem() + "'";
        try {
            if (modelo.consulta(sql)!=null) {
                ResultSet resultados;
                resultados = modelo.consulta(sql);
                 if (resultados!=null) {
                    while(resultados.next()){
                     Object dato[]= new Object [7];
                      tabla_sele.addItem(resultados.getString("TABLE_NAME"));
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
                      schema_respaldo.addItem(resultados.getString("USERNAME"));
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

 
    public menu_creacion_respaldos() {
        initComponents();
         try {
        // TODO add your handling code here:
        comboDirectorios();
        comboUsuarios();
        comboSquemas();
    } catch (SQLException ex) {
        Logger.getLogger(menu_creacion_respaldos.class.getName()).log(Level.SEVERE, null, ex);
    }
        this.setResizable(false);
        this.setLocationRelativeTo( null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_regresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btn_regresar1 = new javax.swing.JButton();
        schema_respaldo = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        btn_respaldo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nom_contra = new javax.swing.JTextField();
        nom_dumpfile1 = new javax.swing.JTextField();
        direcS = new javax.swing.JComboBox<>();
        selecUser = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        tabla_sele = new javax.swing.JComboBox<>();
        direcT = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();

        btn_regresar.setText("Regresar");
        btn_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regresarActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Menu de creacion de respaldos");

        btn_regresar1.setText("Regresar");
        btn_regresar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regresar1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Dijite las contraseña ");

        btn_respaldo.setText("Crear respaldo");
        btn_respaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_respaldoActionPerformed(evt);
            }
        });

        jLabel2.setText("      Respaldos por Schemas ");

        jLabel3.setText("Seleccionar Schema");

        nom_contra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nom_contraActionPerformed(evt);
            }
        });

        selecUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecUserActionPerformed(evt);
            }
        });

        jButton1.setText("Crear resplado");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setText("Seleccione el Usuario ");

        jLabel7.setText("Dijite  la contraseña ");

        jLabel8.setText("Seleccione tabla");

        jLabel9.setText("Seleccione directorio");

        jLabel10.setText("Creacion de respaldos por tablas ");

        jLabel11.setText("Creacion de respaldo Full");

        jButton2.setText("Respaldo Full");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        tabla_sele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabla_seleActionPerformed(evt);
            }
        });

        jLabel12.setText("Seleccione directorio");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(417, 417, 417)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(direcS, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(nom_contra, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addGap(33, 33, 33)
                                            .addComponent(schema_respaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(91, 91, 91)
                                        .addComponent(btn_respaldo))
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(313, 313, 313)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(selecUser, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(nom_dumpfile1)
                                            .addComponent(tabla_sele, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(direcT, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(118, 118, 118)
                                        .addComponent(jButton1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(btn_regresar1)
                .addGap(40, 40, 40))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jLabel11))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(jButton2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel6))
                    .addComponent(selecUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nom_dumpfile1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tabla_sele, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(direcT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(84, 84, 84)
                .addComponent(jButton1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(schema_respaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nom_contra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(direcS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(75, 75, 75)
                .addComponent(btn_respaldo)
                .addGap(60, 60, 60)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(110, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_regresar1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regresarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_regresarActionPerformed

    private void btn_regresar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regresar1ActionPerformed
   
        menuprincipal menu = new menuprincipal();
        this.setVisible(false);
        menu.setVisible(true);
    }//GEN-LAST:event_btn_regresar1ActionPerformed

    private void nom_contraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nom_contraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nom_contraActionPerformed

    private void btn_respaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_respaldoActionPerformed
        Modelo modelo = new Modelo();
        
       String usuario = (String) schema_respaldo.getSelectedItem();
       String contracena = nom_contra.getText();
       String directorio = (String) direcS.getSelectedItem();
       
       String sql = "EXPDP " + usuario + "/" + contracena + "@XE SCHEMAS=" + usuario + " DIRECTORY="+ directorio + " DUMPFILE=" + usuario + ".DMP LOGFILE=" + usuario + ".LOG";
        
        try {
            Process child = Runtime.getRuntime().exec(sql);
             BufferedReader in = new BufferedReader(  
                                new InputStreamReader(child.getInputStream()));  
            String line = null;  
            while ((line = in.readLine()) != null) {  
                System.out.println(line);  
            }  
        } catch (Exception e) {
        }
       
       /*
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
        }*/
    }//GEN-LAST:event_btn_respaldoActionPerformed

    private void selecUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecUserActionPerformed
   
        try {
            // TODO add your handling code here:
            tabla_sele.removeAllItems();
            comboTabla();
         } catch (SQLException ex) {
            Logger.getLogger(menu_creacion_respaldos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_selecUserActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
          Modelo modelo = new Modelo();
        
          String usuario = (String) selecUser.getSelectedItem();
          String contracena = nom_dumpfile1.getText();
          String tabla = (String) tabla_sele.getSelectedItem();
          String directorio = (String) direcT.getSelectedItem();
    try {
        modelo.respaldoTabla(tabla, usuario, contracena,directorio);
        // modelo.conectaVal((String) schema_respaldo.getSelectedItem(), nom_contra.getText(), "EXPDP " + schema_respaldo.getSelectedItem() + "/" +  nom_contra.getText() + "@XE TABLES="+schema_respaldo.getSelectedItem()+"." + tabla_sele.getSelectedItem() + " DIRECTORY="+direcT.getSelectedItem()+" DUMPFILE=" + direcT.getSelectedItem() + ".DMP LOGFILE=" + direcT.getSelectedItem() + ".LOG;");
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(menu_creacion_respaldos.class.getName()).log(Level.SEVERE, null, ex);
    }
   
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Modelo modelo = new Modelo();     
       String sql = "EXPDP SYSTEM/root@XE FULL=Y DIRECTORY=RESPALDO DUMPFILE=XE.DMP LOGFILE=XE.LOG;";
        
        try {
             System.out.println("entro"); 
            Process child = Runtime.getRuntime().exec(sql);
            BufferedReader in = new BufferedReader(  
                                new InputStreamReader(child.getInputStream()));  
            String line = null;  
            System.out.println();
            while ((line = in.readLine()) != null) {  
                System.out.println(line);  
            }
           
        } catch (Exception e) {
            System.out.println("fallo"); 
       }//System.out.println("bases.view.creacion_respaldos.menu_creacion_respaldos.jButton2ActionPerformed()");
        /*
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
        }*/
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tabla_seleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabla_seleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tabla_seleActionPerformed

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
            java.util.logging.Logger.getLogger(menu_creacion_respaldos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu_creacion_respaldos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu_creacion_respaldos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu_creacion_respaldos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu_creacion_respaldos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_regresar;
    private javax.swing.JButton btn_regresar1;
    private javax.swing.JButton btn_respaldo;
    private javax.swing.JComboBox<String> direcS;
    private javax.swing.JComboBox<String> direcT;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nom_contra;
    private javax.swing.JTextField nom_dumpfile1;
    private javax.swing.JComboBox<String> schema_respaldo;
    private javax.swing.JComboBox<String> selecUser;
    private javax.swing.JComboBox<String> tabla_sele;
    // End of variables declaration//GEN-END:variables
}
