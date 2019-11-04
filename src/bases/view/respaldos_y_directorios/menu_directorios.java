/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bases.view.respaldos_y_directorios;

import bases.model.Modelo;
import bases.view.admin_tablespaces.menu_admin_tablespaces;
import bases.view.menuprincipal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author CALIL
 */
public class menu_directorios extends javax.swing.JFrame {

    /**
     * Creates new form menu_directorios
     */
    public menu_directorios() {
        initComponents();
        try {
            comboDirectorios();
        } catch (SQLException ex) {
            Logger.getLogger(menu_directorios.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setResizable(false);
        this.setLocationRelativeTo(null);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nom_directorio = new javax.swing.JTextField();
        path_directorio = new javax.swing.JTextField();
        btn_creaDirectorio = new javax.swing.JButton();
        combo_directorioEliminar = new javax.swing.JComboBox<>();
        btn_eliminarDirectorio = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btn_actualizaDirectorios = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Menu de directorios ");

        jLabel2.setText("Creacion de directorios");

        jLabel3.setText("Nombre del directorio:");

        jLabel4.setText("Path del directorio:");

        jLabel5.setText("Eliminacion de directorios ");

        jLabel6.setText("Seleccione el directorio:");

        btn_creaDirectorio.setText("Crear directorio");
        btn_creaDirectorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_creaDirectorioActionPerformed(evt);
            }
        });

        btn_eliminarDirectorio.setText("Eliminar directorio");
        btn_eliminarDirectorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarDirectorioActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        btn_actualizaDirectorios.setText("Ver Directorios");
        btn_actualizaDirectorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizaDirectoriosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(btn_eliminarDirectorio))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(30, 30, 30)
                                .addComponent(combo_directorioEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(path_directorio, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(39, 39, 39)
                                    .addComponent(nom_directorio, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(btn_creaDirectorio)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_actualizaDirectorios)
                .addGap(275, 275, 275))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(453, 453, 453))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(nom_directorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(path_directorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btn_creaDirectorio)
                        .addGap(59, 59, 59)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(combo_directorioEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(btn_eliminarDirectorio))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_actualizaDirectorios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        menuprincipal menu = new menuprincipal();
        this.setVisible(false);
        menu.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
 
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
                      combo_directorioEliminar.addItem(resultados.getString("DIRECTORY_NAME"));
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
    
    
    public DefaultTableModel modelo1;
 
 public void actualizarTabla(){
 
     Modelo modelo = new Modelo();
        try {
            ResultSet resultados;
            resultados = modelo.cargarDirectorio();

            modelo1 = new DefaultTableModel();

            jTable1.setModel(modelo1);
            modelo1.addColumn("Owner");
            modelo1.addColumn("Directorio");
            modelo1.addColumn("PATH ");
            modelo1.addColumn("ID");
            
            if (resultados!=null) {
                    while(resultados.next()){
                     Object dato[]= new Object [4];
                     
                     for (int i=0;i<4;i++){
                         dato[i] = resultados.getObject(i+1);
                     } 
                     modelo1.addRow(dato);
                } 
            } 
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(menu_directorios.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(menu_directorios.class.getName()).log(Level.SEVERE, null, ex);
        }
 }
 
    private void btn_actualizaDirectoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizaDirectoriosActionPerformed
        // TODO add your handling code here:
        actualizarTabla();
        
    }//GEN-LAST:event_btn_actualizaDirectoriosActionPerformed

    private void btn_creaDirectorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_creaDirectorioActionPerformed
        // TODO add your handling code here:
        Modelo modelo = new Modelo();
        
        
        String nombre = nom_directorio.getText();
        String path = path_directorio.getText();
        String sql = "CREATE OR REPLACE DIRECTORY "+nombre+" AS '"+path+"'";
        
          
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
        
    }//GEN-LAST:event_btn_creaDirectorioActionPerformed

    private void btn_eliminarDirectorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarDirectorioActionPerformed
        // TODO add your handling code here:
         Modelo modelo = new Modelo();
        
        
        String nombre = (String) combo_directorioEliminar.getSelectedItem();
        String sql = "DROP DIRECTORY "+nombre+"";
        
          
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
        
    }//GEN-LAST:event_btn_eliminarDirectorioActionPerformed

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
            java.util.logging.Logger.getLogger(menu_directorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu_directorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu_directorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu_directorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu_directorios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualizaDirectorios;
    private javax.swing.JButton btn_creaDirectorio;
    private javax.swing.JButton btn_eliminarDirectorio;
    private javax.swing.JComboBox<String> combo_directorioEliminar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nom_directorio;
    private javax.swing.JTextField path_directorio;
    // End of variables declaration//GEN-END:variables
}
