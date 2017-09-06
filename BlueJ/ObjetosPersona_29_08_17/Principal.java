
/**
 * Recolecta Información de personas, y permite clasificarlas
 *
 * @author Daniel Xutuc (dahngeek)
 * @version 0.0.1
 */
public class Principal
{
    public static int peopleQuantity = 0;
    public static Persona[] personas;
    
    public static void main(){
        System.out.println("======== Gestión de personas ========");
        do{
            peopleQuantity = Console.readInt("¿Cuantas personas ingresará?");
            personas = new Persona[peopleQuantity];
            for(int i=0; i < peopleQuantity; i++){
                personas[i] = obtenerPersona();
            }
        }while(peopleQuantity == 0);
        obtenerMenorMayor();
    }
    
    public static void obtenerMenorMayor(){
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
    }
    
    public static Persona obtenerPersona(){
        String name = Console.readLine("    Nombre: ");
        String lastname = Console.readLine("    Apellido: ");
        int edad = Console.readInt("    Edad: ");
        int dni = Console.readInt("    DNI: ");
        return new Persona(dni, name, lastname, edad);
    }
}
