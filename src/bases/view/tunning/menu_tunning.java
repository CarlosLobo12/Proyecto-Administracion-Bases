/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bases.view.tunning;

import bases.model.Modelo;
import bases.view.menuprincipal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author CALIL
 */
public class menu_tunning extends javax.swing.JFrame {

    /**
     * Creates new form menu_tunning
     */
    public menu_tunning() throws SQLException {
        initComponents();
        
        try {
            comboUsuarios();
        } catch (Exception e) {
        }
        
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        //comboUsuarios();
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
        btn_regresar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btn_eliminaPlan = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        plan_ejecucion = new javax.swing.JTextArea();
        btn_CrearPlan = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btn_CrearIndex = new javax.swing.JButton();
        schema_indice = new javax.swing.JComboBox<>();
        tabla_indice = new javax.swing.JComboBox<>();
        columna_indice = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Menu de Tunning de consultas");

        btn_regresar.setText("Regresar");
        btn_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regresarActionPerformed(evt);
            }
        });

        jLabel2.setText("Borrar plan ");

        btn_eliminaPlan.setText("Borrar plan");
        btn_eliminaPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminaPlanActionPerformed(evt);
            }
        });

        jLabel3.setText("Plan de ejecucion");

        jLabel4.setText("Digite el plan:");

        plan_ejecucion.setColumns(20);
        plan_ejecucion.setRows(5);
        jScrollPane1.setViewportView(plan_ejecucion);

        btn_CrearPlan.setText("Crear plan");
        btn_CrearPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CrearPlanActionPerformed(evt);
            }
        });

        jLabel5.setText("Creacion de indice");

        jLabel6.setText("Seleccione el schema:");

        jLabel7.setText("Seleccione la tabla:");

        jLabel8.setText("Seleccione la columna:");

        btn_CrearIndex.setText("Crear index");

        schema_indice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                schema_indiceActionPerformed(evt);
            }
        });

        tabla_indice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabla_indiceActionPerformed(evt);
            }
        });

        columna_indice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                columna_indiceActionPerformed(evt);
            }
        });

        jLabel9.setText("Ver plan de ejecucion");

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(btn_CrearIndex)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_regresar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_eliminaPlan)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(btn_CrearPlan)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9)
                                .addGap(221, 221, 221))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(columna_indice, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(schema_indice, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tabla_indice, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 226, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(72, 72, 72))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(420, 420, 420)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_eliminaPlan)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_CrearPlan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(schema_indice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(tabla_indice, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(columna_indice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(61, 61, 61))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_regresar)
                            .addComponent(btn_CrearIndex))
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regresarActionPerformed
        // TODO add your handling code here:
        menuprincipal menu = new menuprincipal();
        this.setVisible(false);
        menu.setVisible(true);
    }//GEN-LAST:event_btn_regresarActionPerformed

    
        public void comboColumna() throws SQLException{
    
           Modelo modelo = new Modelo();
           String col = (String) tabla_indice.getSelectedItem();
    
        String sql ="select column_name from all_tab_columns where table_name = '"+col+"'";
        try {
            if (modelo.consulta(sql)!=null) {
                ResultSet resultados;
                resultados = modelo.consulta(sql);
                 if (resultados!=null) {
                    while(resultados.next()){
                     Object dato[]= new Object [7];
                      columna_indice.addItem(resultados.getString("column_name"));
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
            Logger.getLogger(menu_tunning.class.getName()).log(Level.SEVERE, null, ex);
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
                      schema_indice.addItem(resultados.getString("USERNAME"));
                } 
            } 
                System.out.println(resultados);
            }else{
                System.out.println("Adios mundo");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(menu_tunning.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void comboTabla() throws SQLException{
    
      Modelo modelo = new Modelo();
    
        String sql ="SELECT TABLE_NAME FROM DBA_TABLES WHERE OWNER = '" + schema_indice.getSelectedItem() + "'";
        try {
            if (modelo.consulta(sql)!=null) {
                ResultSet resultados;
                resultados = modelo.consulta(sql);
                 if (resultados!=null) {
                    while(resultados.next()){
                     Object dato[]= new Object [7];
                      tabla_indice.addItem(resultados.getString("TABLE_NAME"));
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
            Logger.getLogger(menu_tunning.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void btn_eliminaPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminaPlanActionPerformed
        // TODO add your handling code here:
        
        Modelo modelo = new Modelo();
        
        try {
            modelo.borrarPlan();
            JOptionPane.showMessageDialog(null, "Plan eliminado correctamente!");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error, intente nuevamente!");
            Logger.getLogger(menu_tunning.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_eliminaPlanActionPerformed

    private void btn_CrearPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CrearPlanActionPerformed
        // TODO add your handling code here:
        Modelo modelo = new Modelo();
        
        String plan = plan_ejecucion.getText();
        //String sql = "SELECT SUBSTR (LPAD(' ', LEVEL-1) || OPERATION ||' (' '|| OPTIONS || ')',1,30 ) OPERACION,   OBJECT_NAME OBJETO FROM PLAN_TABLE START WITH ID = 0 CONNECT BY PRIOR ID=PARENT_ID";
        
        try {
            //modelo.consulta(sql);
            modelo.crearPlan(plan);
            JOptionPane.showMessageDialog(null, "Plan eliminado correctamente!");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error, intente nuevamente!");
            Logger.getLogger(menu_tunning.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_CrearPlanActionPerformed

    private void schema_indiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_schema_indiceActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            tabla_indice.removeAllItems();
            comboTabla();
            
         } catch (SQLException ex) {
            Logger.getLogger(menu_tunning.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_schema_indiceActionPerformed

    private void tabla_indiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabla_indiceActionPerformed
        try {
            // TODO add your handling code here:
             columna_indice.removeAllItems();
            comboColumna();
        } catch (SQLException ex) {
            Logger.getLogger(menu_tunning.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tabla_indiceActionPerformed

    private void columna_indiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_columna_indiceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_columna_indiceActionPerformed

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
            java.util.logging.Logger.getLogger(menu_tunning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu_tunning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu_tunning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu_tunning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new menu_tunning().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(menu_tunning.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_CrearIndex;
    private javax.swing.JButton btn_CrearPlan;
    private javax.swing.JButton btn_eliminaPlan;
    private javax.swing.JButton btn_regresar;
    private javax.swing.JComboBox<String> columna_indice;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea plan_ejecucion;
    private javax.swing.JComboBox<String> schema_indice;
    private javax.swing.JComboBox<String> tabla_indice;
    // End of variables declaration//GEN-END:variables
}
