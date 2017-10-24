
public class Persona
{
    private String variablenombre;
    private String variableapellido;
    private int variableEdad;
    
    /**
     * Constructor for objects of class Persona
     */
    public Persona()
    {
        // le damos valor a las variables   
    }
    
    public Persona(String nombreentrante, String apellidoentrante, int edadentrante)
    {
        this.variablenombre = nombreentrante;
        this.variableapellido = apellidoentrante;
        this.variableEdad = edadentrante;
    }

    public int getEdad()
    {
        return this.variableEdad;
    }
    
    public void setEdad(int edadentrante)
    {
        this.variableEdad = edadentrante;
    }
    
    public String obtenerNombre()
    {
        return this.variablenombre;
    }
    
    public void actualizarNombre(String nombreentrante)
    {
        this.variablenombre = nombreentrante;
    }
}
