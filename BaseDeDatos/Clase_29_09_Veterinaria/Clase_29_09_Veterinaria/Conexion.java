//importar paquete sql, que tiene todos los metodos de JAVA
import java.sql.*; //importa todas las clases que hay dentro del paquete sql
public class Conexion
{
    private static final String DRIVER = "org.sqlite.JDBC";//codigos necesarios para poder cargar la base de datos en SQLite
    private static final String URL = "jdbc:sqlite:veterinaria.sqlite";//ubicacion de la base de datos que vamos a crear

    //metodos para conectarnos y desconectarnos

    Connection conexion;
    //Dos formas de agarrar las excepciones. Con el try/catch (ventaja mostrar cual es el error y direccionar a otro lado) o con el throws que evita que se cuelgue pero nada mas
    protected void conectar() throws SQLException //puedo poner "," y seguir poniendo otras excepciones p ej "ClassNotFoundException"
    {
        //en el try/catch solo puedo poner una excepcion en cada try/catch
        try //dentro del try ponemos todo lo que puede generar algún error
        {
            //lo primero es importar el driver para poder utilizar el resto de las clases
            Class.forName(DRIVER);//como parametro la dirección del DRIVER. 
            //esto fue cargar el driver. Despues de cargarlo, tenemos que asignarselo a la variable conexion que esta mas arriba
        }

        catch(ClassNotFoundException e) //tengo que poner adentro el tipo de escepcion que puede ocurrir, y se crea una variable cualquiera, generalmente "e"
        {
            System.out.println("No se cargó el driver");

        }

        conexion = DriverManager.getConnection(URL); //el parametro es el lugar donde tengo grabada la base de datos
    }

    protected void desconectar() throws SQLException
    {
        conexion.close(); //cierra la base de datos
    }
}
