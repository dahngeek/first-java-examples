//DAO = Database Access Object
import java.sql.*;
import java.util.*;
public class RazaDAO extends Conexion //para acceder a la clase Conexion sin crear la instancia "c"
{
    public void nuevaRaza(String raza) throws SQLException 
    //throws solo lo agarra en la clase en que está llamado. el try/catch lo toma en todas partes
    {

        //va a ser toda la consulta sql ; 
        //"raza" antes del parentesis es el nombre de la tabla en el DB browser; 
        //dentro del parentesis es el nombre del CAMPO "raza". 
        //Luego tantos signos de pregunta como campos vamos a completar.
        //se reemplaza el signo de pregunta por el parametro que le doy al metodo.
        //en lugar del "extends Conexion" hacíamos antes lo siguiente:
        //Conexion c = new Conexion;
        //c.conectar();

        String sql = "INSERT INTO raza (raza) VALUES (?)"; 
        conectar();

        PreparedStatement ps = conexion.prepareStatement(sql); 
        //Convierto el texto de la var "sql" en una consulta sql
        //pasa el string a una consulta sql para manejar en java

        ps.setString(1, raza); 
        //primero va un numero, correspondiente a la posicion del signo de pregunta
        //después va la variable que quiero grabar

        ps.execute(); //ejecuto la consulta
        ps.close(); //cierro la consulta
        desconectar();
    }

    public void modificarRaza(int id, String nuevaRaza) throws SQLException
    {
        String sql = "UPDATE raza SET raza=? WHERE id=?";
        //el primer raza es la tabla, el segundo es el campo.
        //con comas separo los campos. en este caso solo uno que voy a modificar
        //El "?" es lo que paso por parametro

        conectar();
        PreparedStatement ps = conexion.prepareStatement(sql);
        ps.setString(1,nuevaRaza);
        ps.setInt(2,id);
        ps.execute(); //ejecuto la consulta
        ps.close(); //cierro la consulta
        desconectar();

    }

    public void eliminarRaza(int id) throws SQLException
    {
        String sql = "DELETE FROM raza WHERE id=?";
        conectar();

        PreparedStatement ps = conexion.prepareStatement(sql);
        ps.setInt(1,id); //es el id que esta pasando por parametro en el metodo
        ps.execute();
        ps.close();
        desconectar();

    }

    public List listarRaza() throws SQLException
    {
        List lista = new ArrayList();

        String sql = "SELECT * FROM raza"; //seleccionar todo de la tabla raza

        conectar();

        //no tengo que pasar valores, sino recuperar valores -->
        Statement st = conexion.createStatement();
        //llamo a la conexion y le digo que cree un statement
        
        ResultSet rs = st.executeQuery(sql);
        //ResultSet es como una especie de ArrayList, pero con datos de SQL
        //tengo todos los datos en el ResultSet; ahora tengo que especificar
        //si corresponden al nombre o al id de la raza
        //hay que descomponer los datos que hay adentro para diferenciar
        
        while(rs.next()) //mientras haya un siguiente registro en el ResulSet, el bucle se ejecuta
        {
            Raza r = new Raza();
            r.setId(rs.getInt("id")); //entre comillas el nombre de la columna de la 
            //base de datos que quiero recuperar
            
            r.setRaza(rs.getString("raza"));
            //ahora paso el objeto r a la lista que cree al comienzo
            
            lista.add(r);
        }
        
        return lista;
    }
}
