
/**
 * Write a description of class Principal here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Principal
{
  public static void main(String[] args){
    String nombre = Console.readLine("Ingrese su nombre:");
    int edad = Console.readInt("Ingrese su edad:");
    if(edad > 18){
        System.out.println(nombre+" es mayor de edad.");
    } else {
        System.out.println(nombre+" es menor de edad.");
    }
    int a = Console.readInt("Ingrese un nuúmero del 1 al 7:");
    switch(a){
        case 1:
            System.out.println("Domingo");
        break;
        case 2:
            System.out.println("Lunes");
        break;
        case 3:
            System.out.println("Martes");
        break;
        case 4:
            System.out.println("Miercoles");
        break;
        case 5:
            System.out.println("Jueves");
        break;
        case 6:
            System.out.println("Viernes");
        break;
        case 7:
            System.out.println("Sábado!!!");
        break;
        default:
            System.out.println("No es un número del uno al 7");
        break;
    }
  }
}
