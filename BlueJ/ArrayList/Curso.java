
/**
 * Define un objeto que representara un curso
 *
 * @author Daniel Xutuc
 * @version 0.0.1
 */
import java.util.*;

public class Curso {
	private ArrayList<Persona> alumnos;
	private int anio;
	private String nombre;
	private Persona profesor;

	/**
     * Constructor for objects of class Persona
     */
    public Curso()
    {
        // initialise without anything
    }

    public void setAnio(int anioo){
    	this.anio = anioo;
    }
    public int getAnio(){
    	return this.anio
    }

    public void setNombre(int namein){
    	this.nombre = namein;
    }

    public int getNombre(){
    	return this.nombre
    }

    public void setProfesor(Persona profesor){
    	this.profesor = profesorin;
    }

    public int getProfesor(){
    	return this.nombre
    }

    public void setAlumno(Persona alumno_a_inscibir){
    	alumnos.add(alumno_a_inscibir);
    }
	
	public void getAlumnos(){
		for(int i=0; i < alumnos.size(); i++){
            Persona personaActual =  alumnos.get(i);
            System.out.println(i+1+" -> Nombre: "+personaActual.getFullname());
        }
	}
}