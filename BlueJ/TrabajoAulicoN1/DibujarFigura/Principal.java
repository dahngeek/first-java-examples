
/**
 * Imprime un rectangulo en base a el ancho y alto que recibe
 *
 * @author Daniel Xutuc
 * @version 17082017
 */
public class Principal
{
    public static void main(String[] args){
        
        int ancho = Console.readInt(" Ingrese el ancho de la figura: ");
        int alto = Console.readInt(" Ingrese el alto de la figura: ");
        for(int y=0; y<alto; y++){
            for(int x=0; x<ancho; x++){
                System.out.print(" .");
            }
            System.out.print("\n");
        }
    }
}
