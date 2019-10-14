/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bases;

import bases.view.menuprincipal;
import java.sql.ResultSet;

/**
 *
 * @author CALIL
 */
public class Bases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException {
        // TODO code application logic here
        
        menuprincipal menu = new menuprincipal();
        menu.setVisible(true);
        
         OracleDB baseDatos = new OracleDB(); 
         baseDatos.conectar();
        /* ResultSet resultados = baseDatos.consultar("SELECT * FROM PRUEVA ");        
         if (resultados != null) {
            try {
                System.out.println("NOMBRE       APELLIIDO        ID");
                System.out.println("--------------------------------");
                while (resultados.next()) {
                    System.out.println(""+resultados.getString("NOMBRE")+"       "+resultados.getString("APELLIDO")+"       "+resultados.getInt("ID"));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }*/
        
    }
    
}
