/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bases.model;

import bases.OracleDB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author jose1
 */
public class Modelo {
    public ResultSet cargarTableSpace() throws ClassNotFoundException{
        
        OracleDB baseDatos = new OracleDB(); 
         baseDatos.conectar();
         ResultSet resultados = baseDatos.consultar("SELECT TABLESPACE_NAME, MAX_SIZE, CONTENTS,STATUS FROM DBA_TABLESPACES"); 
       return resultados;
    }
    public ResultSet consulta(String sql) throws ClassNotFoundException {
        OracleDB baseDatos = new OracleDB(); 
         baseDatos.conectar();
        ResultSet resultado = null;
        try {
            Statement sentencia;
            sentencia = baseDatos.getConecction().createStatement();
            resultado = sentencia.executeQuery(sql);
            //getConecction().commit();
            return resultado;
        } catch (SQLException e) {
            e.printStackTrace();
            return (ResultSet) this;
        } 
    }
    
}
