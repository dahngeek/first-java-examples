
/**
 * Write a description of class Conexion here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.sql.*;
public class Conexion
{
    // instance variables - replace the example below with your own
    private static final String DRIVER = "org.sqlite.JDBC";
    private static final String URL = "jdbc:sqlite:veterinaria.sqlite";

    Connection conexion;
    
    protected void conectar() throws SQLException{
        try{
            Class.forName(DRIVER);
        } catch(Exception e){
            System.out.println(e);
        }
        
        conexion = DriverManager.getConnection(URL);
    }
    
    protected void desconectar() throws SQLException{
        conexion.close();
    }
}
