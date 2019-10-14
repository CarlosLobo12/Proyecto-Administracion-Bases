/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author jose1
 */
public class OracleDB {
    private Connection conecction;
    
    public Connection getConecction(){
        return conecction;
    }
    public OracleDB conectar () throws ClassNotFoundException{
        try {
             Class.forName("oracle.jdbc.driver.OracleDriver");
            String BaseDeDatos = "jdbc:oracle:thin:@localhost:1521:xe";
            
            conecction = DriverManager.getConnection(BaseDeDatos, "sys as sysdba","root");            
            if (conecction != null) {
                System.out.println("Conexion exitosa!");
             } else {
                System.out.println("Conexion fallida!");
            }
        } catch (Exception e) {
         e.printStackTrace();
        }        return this;
    }
    public boolean ejecutar( String sql){
        try {
            Statement sentencia;
            sentencia =  getConecction().createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
            sentencia.executeUpdate(sql);
            getConecction().commit();
            sentencia.close();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }        return true;
    }
    public ResultSet consultar(String sql) {
        ResultSet resultado = null;
        try {
            Statement sentencia;
            sentencia = getConecction().createStatement();
            resultado = sentencia.executeQuery(sql);
            //getConecction().commit();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }        return resultado;
    }
}
