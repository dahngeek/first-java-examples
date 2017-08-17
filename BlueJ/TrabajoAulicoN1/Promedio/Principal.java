
/**
 * Recibe 10 valores e imprime su promedio
 *
 * @author Daniel Xutuc
 * @version 0.0.1
 */
public class Principal
{
    public static void main(String[] argumentos){
        int suma = Console.readInt(" Ingrese un Número:" );
        for(int i=0; i<10; i++){
            int sumador = Console.readInt(" Ingrese otro Número:" );
            suma = suma + sumador;
        }
        System.out.println("+----------------------------+");
        System.out.println("El promedio es: " + suma/10);
        System.out.println("+----------------------------+");
    }
}
