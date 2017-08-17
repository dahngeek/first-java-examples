
/**
 * Todos los ejercicios hechos en clase 17/08/17
 *
 * @author Daniel Xutuc
 * @version 0.0.1
 */
public class AllExercises
{

    public static void main(String[] args){
        System.out.println(" MENÚ DE EJERCICIOS " );
        System.out.println("     1. Obtener Promedio de 10 elementos. " );
        System.out.println("     2. Dibujar un rectangulo. " );
        System.out.println("     3. Determinar si es palindromo. " );
        int opcion = Console.readInt("Ingrese eln # de opcion:");
        switch(opcion){
            case 1:
                getPromedio();
                break;
            case 2:
                drawSquare();
                break;
            case 3:
                checkPalindromo();
                break;
            default:
                System.out.println("No ingresó una opcion valida");
                break;
        }
    }
    
    /**
     * getPromedio - recibe 10 números y saca un promedio de ellos
     */
    public static void getPromedio(){
        int suma = Console.readInt(" Ingrese un Número:" );
        for(int i=0; i<10; i++){
            int sumador = Console.readInt(" Ingrese otro Número:" );
            suma = suma + sumador;
        }
        System.out.println("+----------------------------+");
        System.out.println("El promedio es: " + suma/10);
        System.out.println("+----------------------------+");
    }
    
    /**
     * drawSquare - dibuja un cuadrado con las dimensiones que pregunta y recibe.
     */
    public static void drawSquare(){
        
        int ancho = Console.readInt(" Ingrese el ancho de la figura: ");
        int alto = Console.readInt(" Ingrese el alto de la figura: ");
        
        String fillSymbol = "  ";
        String startendSymbol = "|";
        for(int y=0; y<alto; y++){
            if(y==0 || y==alto-1){
                fillSymbol = "--";
                startendSymbol = "+";
            } else {
                fillSymbol = "  ";
                startendSymbol = "|";
            }
            System.out.print(startendSymbol);
            for(int x=0; x<ancho; x++){
                System.out.print(fillSymbol);
            }
            System.out.print(startendSymbol+"\n");
        }
    }
    
    /**
     * checkPalindromo - recibe una palabra y revisa si es palindromo.
     */
    public static void checkPalindromo(){
        String palabra = Console.readLine("Ingresa la palabra:");
        boolean palindromo = true;
        for(int i = 0; i< palabra.length(); i++){
            if(palabra.charAt(i) != palabra.charAt((palabra.length()-1)-i)){
                palindromo = false;
                break;
            }
        }
        if(palindromo){
            System.out.println(palabra + " ES palindromo." );
        } else {
            System.out.println(palabra + " NO es palindromo." );
        }
    }
    
}
