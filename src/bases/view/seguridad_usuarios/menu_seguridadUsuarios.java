/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bases.view.seguridad_usuarios;

import bases.model.Modelo;
import bases.view.menuprincipal;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CALIL
 */
public class menu_seguridadUsuarios extends javax.swing.JFrame {

    /**
     * Creates new form menu_seguridadUsuarios
     */
    public menu_seguridadUsuarios() {
        initComponents();
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

        jLabel1 = new javax.swing.JLabel();
        btn_regresar2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nom_usuario = new javax.swing.JTextField();
        opc_connect = new javax.swing.JCheckBox();
        opc_execute = new javax.swing.JCheckBox();
        opc_sysdba = new javax.swing.JCheckBox();
        btn_crearUsuario = new javax.swing.JButton();
        create_session = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        opc_insert = new javax.swing.JCheckBox();
        opc_Select = new javax.swing.JCheckBox();
        opc_update = new javax.swing.JCheckBox();
        opc_Delete = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        area_permisos = new javax.swing.JTextArea();
        usuario_permisos = new javax.swing.JComboBox<>();
        pass_usuarioPermisos = new javax.swing.JTextField();
        btn_buscarPermisos = new javax.swing.JButton();
        permiso_resource = new javax.swing.JCheckBox();
        all_privileges = new javax.swing.JCheckBox();
        jLabel11 = new javax.swing.JLabel();
        pass_usuario = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Menu de Seguridad de usuarios ");

        btn_regresar2.setText("Regresar");
        btn_regresar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regresar2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Creacion de usuarios");

        jLabel3.setText("Nombre usuario ");

        jLabel4.setText("Asignar permisos");

        opc_connect.setText("Grant connect");

        opc_execute.setText("Grant execute");

        opc_sysdba.setText("Grant sysdba");

        btn_crearUsuario.setText("Crear nuevo usuario");
        btn_crearUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_crearUsuarioActionPerformed(evt);
            }
        });

        create_session.setText("Grant create session");

        jLabel7.setText("Permisos de system");

        opc_insert.setText("Insert");

        opc_Select.setText("Select");

        opc_update.setText("Update");

        opc_Delete.setText("Delete");

        jLabel8.setText("Ver permisos de usuarios");

        jLabel9.setText("Seleccionar usuario:");

        jLabel10.setText("Password:");

        area_permisos.setColumns(20);
        area_permisos.setRows(5);
        jScrollPane2.setViewportView(area_permisos);

        usuario_permisos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btn_buscarPermisos.setText("Buscar permisos");

        permiso_resource.setText("Grant resource");

        all_privileges.setText("Grant all privileges");

        jLabel11.setText("Contraseña:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_regresar2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(435, 435, 435)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addComponent(btn_crearUsuario)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(jLabel2))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(84, 84, 84)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(opc_update)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(2, 2, 2)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(opc_Delete)
                                                .addComponent(opc_Select)))
                                        .addComponent(opc_insert)))
                                .addComponent(jLabel4)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel11)
                                    .addGap(63, 63, 63)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(opc_sysdba)
                                        .addComponent(opc_execute)
                                        .addComponent(opc_connect)
                                        .addComponent(create_session)
                                        .addComponent(all_privileges)
                                        .addComponent(permiso_resource)
                                        .addComponent(pass_usuario)))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(217, 217, 217)
                            .addComponent(nom_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 239, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(usuario_permisos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pass_usuarioPermisos, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(69, 69, 69))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btn_buscarPermisos)
                                .addGap(73, 73, 73)))))
                .addGap(160, 160, 160))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(nom_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(pass_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(opc_connect)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(opc_execute)
                                .addGap(2, 2, 2)
                                .addComponent(opc_sysdba)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(create_session))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(usuario_permisos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(pass_usuarioPermisos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_buscarPermisos)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(permiso_resource)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(all_privileges)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_regresar2)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(opc_insert))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(opc_update)
                        .addGap(4, 4, 4)
                        .addComponent(opc_Select)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(opc_Delete)
                        .addGap(18, 18, 18)
                        .addComponent(btn_crearUsuario)
                        .addGap(27, 27, 27))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_regresar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regresar2ActionPerformed
        // TODO add your handling code here:
        menuprincipal menu = new menuprincipal();
        this.setVisible(false);
        menu.setVisible(true);
    }//GEN-LAST:event_btn_regresar2ActionPerformed

    private void btn_crearUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_crearUsuarioActionPerformed
        // TODO add your handling code here:
        String user = nom_usuario.getText();
        String pass = pass_usuario.getText();
        Modelo modelo = new Modelo();
        
        try {
            modelo.crearUsuario(user, pass);
            /*if(opc_connect.isSelected()){
                modelo.permisoConnect(user);
            }else if(opc_execute.isSelected()){
                modelo.permisoResource(user);
            }else if(all_privileges.isSelected()){
                modelo.permisoAllPrivileges(user);
            }*/
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(menu_seguridadUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_crearUsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(menu_seguridadUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu_seguridadUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu_seguridadUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu_seguridadUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu_seguridadUsuarios().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox all_privileges;
    private javax.swing.JTextArea area_permisos;
    private javax.swing.JButton btn_buscarPermisos;
    private javax.swing.JButton btn_crearUsuario;
    private javax.swing.JButton btn_regresar2;
    private javax.swing.JCheckBox create_session;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nom_usuario;
    private javax.swing.JCheckBox opc_Delete;
    private javax.swing.JCheckBox opc_Select;
    private javax.swing.JCheckBox opc_connect;
    private javax.swing.JCheckBox opc_execute;
    private javax.swing.JCheckBox opc_insert;
    private javax.swing.JCheckBox opc_sysdba;
    private javax.swing.JCheckBox opc_update;
    private javax.swing.JTextField pass_usuario;
    private javax.swing.JTextField pass_usuarioPermisos;
    private javax.swing.JCheckBox permiso_resource;
    private javax.swing.JComboBox<String> usuario_permisos;
    // End of variables declaration//GEN-END:variables
}
