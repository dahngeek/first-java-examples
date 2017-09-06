
/**
 * Define un objeto que representara una persona
 *
 * @author Daniel Xutuc
 * @version 0.0.1
 */
public class Persona
{
    // instance variables - replace the example below with your own
    public int edad;
    public String name;
    public String apellido;
    public int dni;

    /**
     * Constructor for objects of class Persona
     */
    public Persona()
    {
        // initialise without anything
    }
    
    public Persona(int dni, String name, String lastname, int age)
    {
        // initialise instance variables
        this.edad = age;
        this.name = name;
        this.apellido = lastname;
        this.dni = dni;
    }
    
    public String getFullname(){
        return this.name+" "+this.apellido;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getLastname(){
        return this.apellido;
    }
    
    public int getDNI(){
        return this.dni;
    }
    
    public int getAge(){
        return this.edad;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setDNI(int dni){
        this.dni = dni;
    }
    
    public void setAge(int age){
        this.edad = age;
    }
    
    public void setLastname(String lastname){
        this.apellido = lastname;
    }
}
