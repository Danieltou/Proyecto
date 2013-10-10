
package agendajarroba;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class Conexion {
    
    
  private String puerto = "3306/"; 
  private String nombreBaseDatos= "mydb";
  private String usuario= "root";
  private String contrasenia="2783275";
  private String url="jdbc:mysql://localhost:";
  private String driver= "com.mysql.jdbc.Driver";
  private Connection conexion=null;
  private Statement stm =null;     
  private ResultSet resultado = null ;
  private CallableStatement procedimiento; 

  private String cadenaConexion=url+puerto+nombreBaseDatos;
  
  public void conectar(){
  
      try{
           Class.forName(driver);
           conexion = DriverManager.getConnection(cadenaConexion, usuario, contrasenia);
           stm = conexion.createStatement();
      
      }catch(SQLException | ClassNotFoundException ex){
      
         
      } 
  }
public void procedimiento(String procedimientoAlmacenado){
        
        try {
            this.procedimiento = conexion.prepareCall(procedimientoAlmacenado);
        } catch (SQLException ex) {
           
        } 
    }
    
    public CallableStatement getProcedimiento(){
        return this.procedimiento;
    }
    public void desconectar() {

        try {

            this.conexion.close();
            this.resultado.close();
            this.stm.close();
            
        } catch (Exception e) {
            
           
        }
    }

    public Statement getStatement() {
        return stm;
    }

    public ResultSet getResultado() {
        return resultado;
    }

    public Connection getConexion() {

        return conexion;
    }
    public void setResultado(ResultSet resultado) {
        this.resultado = resultado;
    }
}
