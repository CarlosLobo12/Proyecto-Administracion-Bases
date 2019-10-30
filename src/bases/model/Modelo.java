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
import javax.swing.JOptionPane;

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
    public ResultSet conectaVal(String schema, String contrasena, String sql) throws ClassNotFoundException{
        OracleDB basesDatos = new OracleDB();
        basesDatos.conectar(schema, contrasena);
        
        ResultSet resultado = null;
        
        try {
            Statement sentencia;
            sentencia = basesDatos.getConecction().createStatement();
            resultado = sentencia.executeQuery(sql);
            //getConecction().commit();
            return resultado;
        } catch (SQLException e) {
            e.printStackTrace();
            return (ResultSet) this;
        } 
    }
    
     public ResultSet crearRol(String rol, String password) throws ClassNotFoundException{
        
         OracleDB baseDatos = new OracleDB(); 
         baseDatos.conectar();
         ResultSet resultados = null;
         if(rol.isEmpty()){
             JOptionPane.showMessageDialog(null, "El rol no puede estar vacio, vuelva a intentarlo");
         }else{
            if(password.isEmpty()){
             resultados = baseDatos.consultar("CREATE ROLE "+rol+" NOT IDENTIFIED");
         }  else {
             resultados = baseDatos.consultar("CREATE ROLE "+rol+" IDENTIFIED BY "+password+""); 
            } 
         }
         
       return resultados;
    }
    
    public ResultSet verRoles(String user, String password) throws ClassNotFoundException{
        
        OracleDB baseDatos = new OracleDB(); 
         baseDatos.conectar();
         ResultSet resultados = baseDatos.consultar("select role, granted_role from role_role_privs"); 
       return resultados;
    }
    
    public ResultSet mostrarRoles(String usuario, String password) throws ClassNotFoundException{
        
        OracleDB baseDatos = new OracleDB(); 
         baseDatos.conectar();
         ResultSet resultados = baseDatos.consultar("select ROLE from DBA_ROLES"); 
       return resultados;
    }
    
    public ResultSet rolInsert(String schema, String table, String user) throws ClassNotFoundException{
        
        OracleDB baseDatos = new OracleDB(); 
         baseDatos.conectar();
         ResultSet resultados = baseDatos.consultar("GRANT INSERT ON "+schema+"."+table+" TO "+user+""); 
       return resultados;
    }
    
    public ResultSet rolUpdate(String schema, String table, String user) throws ClassNotFoundException{
        
        OracleDB baseDatos = new OracleDB(); 
         baseDatos.conectar();
         ResultSet resultados = baseDatos.consultar("GRANT UPDATE ON " + schema + "." + table + " TO " + user + ""); 
       return resultados;
    }
    
    public ResultSet rolDelete(String schema, String table, String user) throws ClassNotFoundException{
        
        OracleDB baseDatos = new OracleDB(); 
         baseDatos.conectar();
         ResultSet resultados = baseDatos.consultar("GRANT DELETE ON " + schema + "." + table + " TO " + user + ""); 
       return resultados;
    }
    
    public ResultSet rolSelect(String schema, String table, String user) throws ClassNotFoundException{
        
        OracleDB baseDatos = new OracleDB(); 
         baseDatos.conectar();
         ResultSet resultados = baseDatos.consultar("GRANT SELECT ON " + schema + "." + table + " TO " + user + ""); 
       return resultados;
    }
    
    //aca terminana los metodos de la ventana crear roles 
    /////////////////////////////////////////////////////////////////////////////
    //metodos ventana de creacion de usuarios
    
    public ResultSet crearUsuario(String nombre, String contrasena) throws ClassNotFoundException{
        
        OracleDB baseDatos = new OracleDB(); 
         baseDatos.conectar();
         String sql = "alter session set \""+"_ORACLE_SCRIPT"+"\" = TRUE ";//asi se coloca las comillas doblers 
         String sql3 =new String("CREATE USER \"" + nombre + "\" IDENTIFIED BY \"" + contrasena+ "\"");
         ResultSet alter = baseDatos.consultar(sql);
         ResultSet resultados = baseDatos.consultar(sql3); 
         return resultados;
    }
    
    public ResultSet permisoConnect(String user) throws ClassNotFoundException{
        
        OracleDB baseDatos = new OracleDB(); 
         baseDatos.conectar();
         ResultSet resultados = baseDatos.consultar("GRANT CONNECT TO \"" + user + "\""); 
         return resultados;
    }
    
    public ResultSet permisoResource(String user) throws ClassNotFoundException{
        
        OracleDB baseDatos = new OracleDB(); 
         baseDatos.conectar();
         ResultSet resultados = baseDatos.consultar("GRANT RESOURCE, CREATE SESSION TO \"" + user + "\""); 
         return resultados;
    }
    
    public ResultSet permisoAllPrivileges(String user) throws ClassNotFoundException{
        
        OracleDB baseDatos = new OracleDB(); 
         baseDatos.conectar();
         ResultSet resultados = baseDatos.consultar("GRANT ALL PRIVILEGES TO \"" + user + "\""); 
         return resultados;
    }
    
    public ResultSet mostrarUsername() throws ClassNotFoundException{
        
        OracleDB baseDatos = new OracleDB(); 
         baseDatos.conectar();
         ResultSet resultados = baseDatos.consultar("SELECT USERNAME FROM DBA_USERS"); 
         return resultados;
    }
    
    public ResultSet mostrarPermisosUsuarios() throws ClassNotFoundException{
        
        OracleDB baseDatos = new OracleDB(); 
         baseDatos.conectar();
         ResultSet resultados = baseDatos.consultar("select USERNAME,GRANTED_ROLE from user_role_privs"); 
         return resultados;
    }
    
}
