
/**
 * Recolecta Información de personas, y permite clasificarlas
 *
 * @author Daniel Xutuc (dahngeek)
 * @version 0.0.1
 */

import java.util.*;

public class Principal
{
    public static int peopleQuantity = 0;
    public static ArrayList<Persona> personas;
    public static ArrayList<Curso> cursos;
    
    public static void main(){
        
    }

    public static void mostarMenu(){
        int opcion = Console.readInt("Ingrese la opcion: ");
        switch(opcion){
            case 1:
                personas.add(agregarPersona());
                limpiarConsola();
                System.out.println("Se creó la persona.");
                break;
            case 2:
                listarPersonas();
                break;
            case 3:
                crearCurso();
                break;

        }

    }

    public static void limpiarConsola(){
        for(int i=0; i<50; i++){
            System.out.println();
        }
    }

    public static void crearCurso(){
        Curso cursoACrear = new Curso();
        cursoACrear.setAnio( Console.readInt("Ingrese el Año:") );
        cursoACrear.setProfesor( Console.readInt("Ingrese el Año:") );
    }

    public static void listarPersonas(){
        for(int i=0; i < personas.size(); i++){
            Persona personaActual =  personas.get(i);
            System.out.println("Persona #"+ i+1);
            System.out.println(" | Nombre: "+personaActual.getFullname());
            System.out.println(" | Edad: "+personaActual.getAge());
            System.out.println(" | DNI: "+personaActual.getDNI());
        }
    }
    
    /*public static void obtenerMenorMayor(){
        Persona mayor = personas[0];
        Persona menor = personas[0];
        
        for(int i=0; i < peopleQuantity; i++){
            if(personas[i].getAge() > mayor.getAge()){
                //ACtualizamos el elemento mayor
                mayor = personas[i];
            }
            
            if(personas[i].getAge() < menor.getAge()){
                //ACtualizamos el elemento mayor
                menor = personas[i];
            }
        }
        
        System.out.println(mayor.getFullname() + " es el mayor con " + mayor.getAge() );
        System.out.println(menor.getFullname() + " es el menor con " + menor.getAge() );
    }*/
    
    public static Persona obtenerPersona(){
        String name = Console.readLine("    Nombre: ");
        String lastname = Console.readLine("    Apellido: ");
        int edad = Console.readInt("    Edad: ");
        int dni = Console.readInt("    DNI: ");
        return new Persona(dni, name, lastname, edad);
    }
}
