
/**
 * Write a description of class Medico here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Medico
{
    String nombre;
    String apellido;
    int dni;
    Especialidad especialidad;
    
    public Medico()
    {}
    
    public Medico(String apellido, String nombre, int dni, Especialidad especialidad)
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.especialidad = especialidad;
        
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
    
    public Especialidad getEspecialidad()
    {
        return especialidad;
    } 
    
    public void setEspecialidad(Especialidad especialidad)
    {
        this.especialidad = especialidad;
    }

    public String getNombreCompleto()
    {
        return apellido + " " + nombre;
    }
}
