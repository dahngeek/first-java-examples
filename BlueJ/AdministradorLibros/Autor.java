import java.util.*;
public class Autor
{
    private String nombre;
    private String apellido;
    private String nacionalidad;
    private ArrayList<Libro> libros;
    
    Autor (){
        libros=new ArrayList<Libro>();
    }
    
    Autor (String nombre, String apellido, String nacionalidad){
    
    }
    
    public void setNombre(String nom){
        this.nombre = nom;
    }
    
    public void setApellido(String ape){
        this.apellido = ape;
    }
    
    public void setNacionalidad(String nac){
        this.nacionalidad = nac;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public String getFullname(){
        return this.nombre+ " " + this.apellido;
    }
    
    public String getApellido(){
        return this.apellido;
    }
    
    public String getNacionalidad(String nac){
        return this.nacionalidad;
    }
    
    public void addBook(Libro libr){
        libros.add(libr);
    }
    
    public ArrayList<Libro> getBooks(){
        return libros;
    }
    
    public int getLibrosCount(){
        return libros.size();
    }
}
