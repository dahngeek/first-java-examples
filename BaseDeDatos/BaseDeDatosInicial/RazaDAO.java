
/**
 * Database Access Object de Raza
 *
 * @author Daniel Xutuc
 * @version 0.0.0
 */
import java.sql.*;
public class RazaDAO extends Conexion
{
    public void nuevaRaza(String raza) throws SQLException
    {
        String sql = "INSERT INTO raza (raza) VALUES (?)";
        
        conectar();
        PreparedStatement ps = conexion.prepareStatement(sql);
        ps.setString(1,raza);
        ps.execute();
        ps.close();
        desconectar();
    }
    public void modificarRaza(int id, String nuevaRaza) throws SQLException
    {
        String sql = " UPDATE raza SET raza=? WHERE id=?";
        
        conectar();
        PreparedStatement ps = conexion.prepareStatement(sql);
        ps.setString(1, nuevaRaza);
        ps.setInt(2, id);
        ps.execute();
        ps.close();
        desconectar();
    }
}
