
/**
 * Juego de azar de 3 dados
 *
 * @author Daniel Xutuc
 * @version 24/08/17
 */
import java.util.*;

public class Dados
{
    public static void main(String[] args){
        int opcion = 0;
        do{
            juego();
            System.out.println(" ================ ");
            System.out.println(" 1 . Continuar ");
            System.out.println(" 2 . Salir ");
            System.out.println(" ================ ");
            opcion = Console.readInt(" Opcion: " );
        }
        while(opcion != 2);
    }
    
    public static void juego(){
                
        Random randy = new Random();
        
        //Almacenamos los dados del usuario
        int[] usuarioDados = new int[3];
        for(int i = 0; i < 3; i++){
            usuarioDados[i] = Console.readInt(" Ingrese el dado #"+ (i+1) +":"  );
        }
        
        //Almacenamos los dados al azar
        int[] arregloDados = new int[3];
        for(int j = 0; j < 3; j++){ //recorremos las posiciones 0 al 2 (3)
            arregloDados[j] = randy.nextInt(6)+1;
        }
        
        int cantidadAcertados = 0;
        int sumaDados = 0;
        int sumaUsuario = 0;
        
        //Recorremos todos los dados del usuario
        int posicionUsuario = 0;
        while(posicionUsuario < 3){ //desde 0 hasta 2
            
            //Compararemos con todos los dados
            for(int posRand = 0; posRand < 3; posRand++){ 
                if(usuarioDados[posicionUsuario] == arregloDados[posRand]){
                    cantidadAcertados++;
                    break;
                }
            }
            
            sumaDados = sumaDados + arregloDados[posicionUsuario]; //corre 3 veces
            sumaUsuario = sumaUsuario + usuarioDados[posicionUsuario]; //corre 3 veces
            posicionUsuario++;
        }
        
        if(cantidadAcertados == 3){
            System.out.println(" Gano completamente! ");
        } else {
            if(sumaDados == sumaUsuario){
                System.out.println(" Gano por sumas. ");
            } else {
                System.out.println(" Perdió ");
            }
        }
    }
}
