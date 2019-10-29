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
         ResultSet resultados = baseDatos.consultar("SELECT t.tablespace_name ,t.status ,ROUND (MAX (d.bytes) / 1024 / 1024, 2),ROUND ((MAX (d.bytes) / 1024 / 1024) - (SUM (DECODE (f.bytes, NULL, 0, f.bytes)) / 1024 / 1024), 2), ROUND (SUM (DECODE (f.bytes, NULL, 0, f.bytes) ) / 1024 / 1024, 2) , t.pct_increase , SUBSTR (d.file_name, 1, 80)  FROM DBA_FREE_SPACE f, DBA_DATA_FILES d, DBA_TABLESPACES t WHERE t.tablespace_name = d.tablespace_name AND f.tablespace_name(+) = d.tablespace_name AND f.file_id(+) = d.file_id GROUP BY t.tablespace_name, d.file_name, t.pct_increase, t.status ORDER BY 1, 3 DESC"); 
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
