
/**
 * Write a description of class Principal here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.sql.*;
public class Principal
{
    public static void main() throws SQLException{
        RazaDAO razaDAO = new RazaDAO();
        razaDAO.nuevaRaza("Pitbull");
        razaDAO.modificarRaza(1,"Doberman");
    }
}
