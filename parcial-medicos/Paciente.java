
/**
 * Write a description of class Paciente here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Paciente
{
    // instance variables - replace the example below with your own
    String nombre;
    String apellido;
    int dni;
    int nrohistoria;
    
    public Paciente()
    {}
    
    public Paciente(String apellido, String nombre, int dni, int nrohistoria)
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.nrohistoria = nrohistoria;
        
    }
    
    public String getNombre()
    {
        return nombre;
    } 
    
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    
    public String getApellido()
    {
        return apellido;
    } 
    
    public void setApellido(String apellido)
    {
        this.apellido = apellido;
    }
    
    public int getDni()
    {
        return dni;
    } 
    
    public void setDni(int dni)
    {
        this.dni = dni;
    }
    
    public int getNroHistoria()
    {
        return nrohistoria;
    } 
    
    public void setNroHistoria(int nrohistoria)
    {
        this.nrohistoria = nrohistoria;
    }
    
    public String getNombreCompleto()
    {
        return apellido + " " + nombre;
    }
}
