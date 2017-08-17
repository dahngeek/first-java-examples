
/**
 * Write a description of class Principal here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Principal
{
    public static void main(String[] args){
        int a = 0;
        int t = 0;
        do{
            a = Console.readInt(" Ingrese un número (0 para terminar)" );
            t = t+a;
        }while(a!=0);
        
        System.out.println(" La suma total fue: " + t);
    }
}
