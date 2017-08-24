
/**
 * Ejercicios solicitadoss el día Jueves 24 de Agosto
 *
 * @author Daniel Xutuc (@dahngeek)
 * @version 22/08/17
 */
public class EjercicosPrincipal
{
    public static void main(String[] args){
        
        int opcion = 0;
        do{
            System.out.println("------------- Ejercico 24-08-17 ---------" );
            System.out.println("--- 1. Mayor / Menor de 10 elementos -----" );
            System.out.println("--- 2. Transversa de una Matriz      -----" );
            System.out.println("--- 3. SALIR                         -----" );
            opcion = Console.readInt(" Ingrese la opcion elegida: ");
            switch(opcion){
                case 1:
                    extremoDeArregloNumeros();
                    break;
                case 2:
                    transversaMatriz();
                    break;
                case 3:
                    System.out.println(" Adios! ");
                    break;
                default:
                    System.out.println(" Elección Incorrecta. ");
                    break;
            }
        }while(opcion != 3);
    }
    
    public static void extremoDeArregloNumeros(){
        //creamos el vector
        int[] numeros = new int[10];
        
        //ingresamos los datos
        for(int i=0; i<10; i++){
            //almacenamos en la posición actual el elemento que se ingresa
            numeros[i] = Console.readInt(" Ingrese elemento #"+(i+1)+" a comparar:"  );
        }
        // Definimos los valores a comparar, por default el primer elemento será
        int numeroMayor = numeros[0];
        int numeroMenor = numeros[0];
        
        //Recorremos todos los elementos
        for(int i=0; i<10; i++){
            // Vemos si el elemento actual es mayor
            if(numeros[i]>numeroMayor){
                //actualizamos el numero mayor
                numeroMayor = numeros[i];
            }
            //Vemos si el elemento actual es menor del menor
            if(numeros[i] < numeroMenor){
                //actualizamos el menor para que sea el actual si es menor.
                numeroMenor = numeros[i];
            }
        }
        
        System.out.println(" El mayor es " + numeroMayor );
        System.out.println(" El menor es " + numeroMenor );
    }
    
    public static void transversaMatriz(){
        int filas = Console.readInt("¿Cuantas filas?");
        int columnas = Console.readInt("¿Cuantas columnas?");
        
        //Creamos la matriz
        int[][] matriz = new int[filas][columnas];
        //Creamos una matriz traspuesta
        int[][] matriztransversa = new int[columnas][filas];
        
        //Cargamos la matriz
        for(int i=0; i<matriz.length; i++){ //cantidad de filas
            for(int j=0; j< matriz[0].length; j++){ //cantidad de columnas del la primer fila
                int valorGuardar = Console.readInt(" Ingrese el valor para la fila " +(i+1) + " y la columna " +(j+1)  );
                matriz[i][j] = valorGuardar; //Guardamos en la normal
                matriztransversa[j][i] = valorGuardar; //Guardamos en la transpuesta.
            }
        }
        
        
        //Imprimimos las matrices.
        System.out.println(" Matriz");
        imprimirMatriz(matriz);
        
        System.out.println(" Matriz TRANSVERSA");
        imprimirMatriz(matriztransversa);
        
        
    }
    
    
    public static void imprimirMatriz(int[][] matriz){
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[0].length; j++){
                System.out.print(matriz[i][j]+"  ");
            }
            System.out.print("  \n");
        }
    }
}
