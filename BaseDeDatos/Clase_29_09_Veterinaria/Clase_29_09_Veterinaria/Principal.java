import java.sql.*;
public class Principal //extends RazaDAO
{
    public void menu() throws SQLException
    {
        int op=0;

        do
        {
            System.out.println("1. Nueva Raza");
            System.out.println("2. Modificar Raza");
            System.out.println("3. Eliminar Raza");
            System.out.println("4. Listar Razas");
            op = Console.readInt("Seleccione una opción");

            switch(op)
            {
                case 1:nuevaRaza();break;
                case 2:modificarRaza();break;
                case 3:eliminarRaza();break;
                case 0:System.out.println("Gracias por usar el sistema"); break;
            }
        }while(op!=0);

    }

    public void nuevaRaza() throws SQLException
    {
        String nombre = Console.readLine("Introduzca la nueva raza: ");
        RazaDAO rdao = new RazaDAO();
        rdao.nuevaRaza(nombre);
        
    }
    
    public void modificarRaza()
    {
        int id = Console.readInt(" ");
        String nombre = Console.readLine("");
        
    }
    
    public void eliminarRaza()
    {
        
    }
    
    public void ListarRazas()
    {
        
    }
    
   /* 
    public static void main() throws SQLException
    {
        RazaDAO razaDAO = new RazaDAO();
        razaDAO.nuevaRaza("Pitbull");

        razaDAO.modificarRaza(1,"Boxer");
    }*/
}
