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
    public ResultSet cargarDirectorio() throws ClassNotFoundException{
         OracleDB baseDatos = new OracleDB(); 
         baseDatos.conectar();
         ResultSet resultados = baseDatos.consultar("select * from all_directories"); 
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
    public ResultSet consulta(String sql,String usuario) throws ClassNotFoundException {
        OracleDB baseDatos = new OracleDB(); 
         baseDatos.conectar(usuario,"root");
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
    public void respaldoTabla(String tabla, String usuario,String contrasena,String directorio) throws ClassNotFoundException{
        
        OracleDB basesDatos = new OracleDB();
        basesDatos.conectar(usuario, contrasena);
        
        ResultSet resultado = null;
        
        String sql = "EXPDP " + usuario + "/" + contrasena + 
                "@XE TABLES="+usuario+"." + tabla + " DIRECTORY="+"C:/"+" DUMPFILE=" + tabla + ".DMP LOGFILE=" + tabla + ".LOG";
         try {
            Runtime.getRuntime().exec(sql);
        } catch (Exception e) {
        }/*
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
        */
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
         String sql = "alter session set \""+"_ORACLE_SCRIPT"+"\" = TRUE ";
         ResultSet alter = baseDatos.consultar(sql);
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
         baseDatos.conectar(user, password);
         ResultSet resultados = baseDatos.consultar("select role, granted_role from role_role_privs"); 
        return resultados;
    }
    
    public ResultSet asignarRolUsuario(String rol, String user) throws ClassNotFoundException{
        
        OracleDB baseDatos = new OracleDB(); 
         baseDatos.conectar();
         ResultSet sql = baseDatos.consultar("GRANT CONNECT TO "+rol+"");
         ResultSet sql2 = baseDatos.consultar("GRANT "+rol+" TO "+user+"");
         
        return sql2;
    }
    
    public ResultSet mostrarRoles() throws ClassNotFoundException{
        
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
         String sql3 =new String("CREATE USER " + nombre + " IDENTIFIED BY " + contrasena+ "");
         ResultSet alter = baseDatos.consultar(sql);
         ResultSet resultados = baseDatos.consultar(sql3); 
         return resultados;
    }
    
    public ResultSet permisoConnect(String user) throws ClassNotFoundException{
        
        OracleDB baseDatos = new OracleDB(); 
         baseDatos.conectar();
         ResultSet resultados = baseDatos.consultar("GRANT CONNECT TO " + user + ""); 
         return resultados;
    }
    
    public ResultSet permisoResource(String user) throws ClassNotFoundException{
        
        OracleDB baseDatos = new OracleDB(); 
         baseDatos.conectar();
         ResultSet resultados = baseDatos.consultar("GRANT RESOURCE, CREATE SESSION TO " + user + ""); 
         return resultados;
    }
    
    public ResultSet permisoAllPrivileges(String user) throws ClassNotFoundException{
        
        OracleDB baseDatos = new OracleDB(); 
         baseDatos.conectar();
         ResultSet resultados = baseDatos.consultar("GRANT ALL PRIVILEGES TO " + user + ""); 
         return resultados;
    }
    
    public ResultSet mostrarUsername() throws ClassNotFoundException{
        
        OracleDB baseDatos = new OracleDB(); 
         baseDatos.conectar();
         ResultSet resultados = baseDatos.consultar("SELECT USERNAME FROM DBA_USERS"); 
         return resultados;
    }
    
    public ResultSet mostrarPermisosUsuarios(String usuario, String contrasena) throws ClassNotFoundException{
        
        OracleDB baseDatos = new OracleDB(); 
         baseDatos.conectar(usuario, contrasena);
         ResultSet resultados = baseDatos.consultar("select USERNAME,GRANTED_ROLE from user_role_privs"); 
         return resultados;
    }
    
    //terminan metodos del la ventana de usuarios 
    
    ///////////////////////////////////////////////////////////////////////////
    
    //metodos de la ventana de auditoria
    
    public ResultSet auditoriaFull(String usuario, String tabla) throws ClassNotFoundException{
        
        OracleDB baseDatos = new OracleDB(); 
         baseDatos.conectar();
         ResultSet resultados = baseDatos.consultar("audit all ON "  + usuario + "." + tabla +  "by access"); 
         return resultados;
    }
    
    public ResultSet auditoriaInsert(String usuario, String tabla) throws ClassNotFoundException{
        
        OracleDB baseDatos = new OracleDB(); 
         baseDatos.conectar();
         ResultSet resultados = baseDatos.consultar("audit insert ON " + usuario + "." + tabla + " by access"); 
         return resultados;
    }
    
    public ResultSet auditoriaUpdate(String usuario, String tabla) throws ClassNotFoundException{
        
        OracleDB baseDatos = new OracleDB(); 
         baseDatos.conectar();
         ResultSet resultados = baseDatos.consultar("audit update ON " + usuario + "." + tabla + " by access"); 
         return resultados;
    }
    
    public ResultSet auditoriaDelete(String usuario, String tabla) throws ClassNotFoundException{
        
        OracleDB baseDatos = new OracleDB(); 
         baseDatos.conectar();
         ResultSet resultados = baseDatos.consultar("audit delete ON " + usuario + "." + tabla + " by access"); 
         return resultados;
    }
    
    public ResultSet auditoriaSelect(String usuario, String tabla) throws ClassNotFoundException{
        
        OracleDB baseDatos = new OracleDB(); 
         baseDatos.conectar();
         ResultSet resultados = baseDatos.consultar("audit select ON " + usuario + "." + tabla + " by access"); 
         return resultados;
    }
    
    public ResultSet auditoriaBorrarFull(String usuario, String tabla) throws ClassNotFoundException{
        
        OracleDB baseDatos = new OracleDB(); 
         baseDatos.conectar();
         ResultSet resultados = baseDatos.consultar("NOAUDIT all ON "+usuario+"."+tabla+""); 
         return resultados;
    }
    
    public ResultSet auditoriaBorrarInsert(String usuario, String tabla) throws ClassNotFoundException{
        
        OracleDB baseDatos = new OracleDB(); 
         baseDatos.conectar();
         ResultSet resultados = baseDatos.consultar("NOAUDIT INSERT ON " + usuario + "." + tabla + ""); 
         return resultados;
    }
    
    public ResultSet auditoriaBorrarUpdate(String usuario, String tabla) throws ClassNotFoundException{
        
        OracleDB baseDatos = new OracleDB(); 
         baseDatos.conectar();
         ResultSet resultados = baseDatos.consultar("NOAUDIT UPDATE ON " + usuario + "." + tabla + ""); 
         return resultados;
    }
    
    public ResultSet auditoriaBorrarDelete(String usuario, String tabla) throws ClassNotFoundException{
        
        OracleDB baseDatos = new OracleDB(); 
         baseDatos.conectar();
         ResultSet resultados = baseDatos.consultar("NOAUDIT DELETE ON " + usuario + "." + tabla + ""); 
         return resultados;
    }
    
    public ResultSet auditoriaBorrarSelect(String usuario, String tabla) throws ClassNotFoundException{
        
        OracleDB baseDatos = new OracleDB(); 
         baseDatos.conectar();
         ResultSet resultados = baseDatos.consultar("NOAUDIT SELECT ON " + usuario + "." + tabla + ""); 
         return resultados;
    }
    
    public ResultSet iniciarAuditoria() throws ClassNotFoundException{
        
        OracleDB baseDatos = new OracleDB(); 
         baseDatos.conectar();
         ResultSet resultados = baseDatos.consultar("alter system set audit_trail=DB scope=spfile"); 
         return resultados;
    }
    
    public ResultSet mostrarAuditoria(String usuario, String contrasena) throws ClassNotFoundException{
        
        OracleDB baseDatos = new OracleDB(); 
         baseDatos.conectar(usuario,contrasena);
         ResultSet resultados = baseDatos.consultar("Select object_name, object_type, aud, del, ins, sel, upd,alt,aud,com,gra,ind,loc,ren,fbk from user_obj_audit_opts"); 
         return resultados;
    }
    
    
    
    //aca terminan los metodos de la ventana auditoria
    
    
    //metodos de la ventana de estadisticas 
    
    public ResultSet estadisticaSchema(String schema) throws ClassNotFoundException{
        
        OracleDB baseDatos = new OracleDB(); 
         baseDatos.conectar();
        ResultSet resultados = null;
         //ResultSet resultados = baseDatos.consultar("EXEC dbms_stats.gather_schema_stats('"+schema+"', cascade => true)"); 
         String homeDirectory = System.getProperty("user.home");
         String sql = "EXEC dbms_stats.gather_schema_stats('"+schema+"', cascade => true)";
         try {
            Process child = Runtime.getRuntime().exec(String.format(sql, homeDirectory));
        } catch (Exception e) {
        }
       return resultados;
    }
    
    public ResultSet estadisticaTabla(String schema, String tabla) throws ClassNotFoundException{
        
        OracleDB baseDatos = new OracleDB(); 
         baseDatos.conectar();
         ResultSet resultados = null;
                 //baseDatos.consultar("EXEC DBMS_STATS.gather_table_stats('"+schema+"', '"+tabla+"', cascade => true)"); 
         String sql = "EXEC DBMS_STATS.gather_table_stats('"+schema+"', '"+tabla+"', cascade => true)";
         try {
            Process child = Runtime.getRuntime().exec(sql);
        } catch (Exception e) {
        }
       return resultados;
    }
    
    public ResultSet MostrarEstadistica(String schema, String tabla, String contrasena) throws ClassNotFoundException{
        
        OracleDB baseDatos = new OracleDB(); 
         baseDatos.conectar(schema,contrasena);
         ResultSet resultados = baseDatos.consultar("SELECT * FROM USER_TAB_COL_STATISTICS WHERE table_name = '"+tabla+"'"); 
       return resultados;
    }
    
    public ResultSet analizarEstadistica(String schema, String tabla) throws ClassNotFoundException{
        
        OracleDB baseDatos = new OracleDB(); 
         baseDatos.conectar();
         ResultSet resultados = baseDatos.consultar("ANALYZE TABLE "+schema+"."+tabla+" COMPUTE STATISTICS"); 
       return resultados;
    }
    
    //aca terminan los metodos de la ventana de estadisticas 
    
    
    //metodos ventana de tunning
    
    public ResultSet borrarPlan() throws ClassNotFoundException{
        
        OracleDB baseDatos = new OracleDB(); 
         baseDatos.conectar();
         ResultSet resultados = baseDatos.consultar("DELETE PLAN_TABLE"); 
       return resultados;
    }
    
    public ResultSet crearPlan(String plan) throws ClassNotFoundException{
        
        OracleDB baseDatos = new OracleDB(); 
         //baseDatos.conectar();
          baseDatos.conectar("PUBS", "root");
         ResultSet resultados = baseDatos.consultar(""+plan+""); 
       return resultados;
    }
    
    public ResultSet crearIndex(String tabla, String columna,String schema) throws ClassNotFoundException{
        
        OracleDB baseDatos = new OracleDB(); 
         baseDatos.conectar(schema,"root");
         ResultSet resultados = baseDatos.consultar("CREATE INDEX IDX_" + tabla + " ON " + tabla+"("+columna+")"); 
       return resultados;
    }
    
    //aca terminan los metodos de la ventana de tunning
    
    
}
