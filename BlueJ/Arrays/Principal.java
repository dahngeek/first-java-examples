
/**
 * Write a description of class Principal here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Principal
{
    // instance variables - replace the example below with your own
    public static void main(String[] args){
        int[][] matriz = new int[10][2];
        
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j< matriz[0].length; j++){
                int valorGuardar = Console.readInt(" Ingrese el valor para la fila " +(i+1) + " y la columna " +(j+1)  );
                matriz[i][j] = valorGuardar;
            }
        }
        
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[0].length; j++){
                System.out.print(matriz[i][j]+"  ");
            }
            System.out.print("  \n");
        }
        
    }
}
