
/**
 * Todos los ejercicios hechos en clase 22/08/17
 *
 * @author Daniel Xutuc
 * @version 0.0.1
 */
public class AllExercises
{

    public static void main(String[] args){
        
        int opcion = 0;
        do{
            System.out.println("---------------------------------------------------" );
            System.out.println(" MENÚ DE EJERCICIOS 22/08/2017" );
            System.out.println("     1. Ordenar alfabeticamente 3 nombres. " );
            System.out.println("     2. Separar Vocales/Consonantes" );
            System.out.println("     3. Contar Vocales/Consonantes. " );
            System.out.println("     4. Salir. " );
            opcion = Console.readInt("Ingrese el #número de opcion:");
            switch(opcion){
                case 1:
                    ordenarAlfabeticamente();
                    break;
                case 2:
                    separarString();
                    break;
                case 3:
                    contarVocalesConsonantes();
                    break;
                default:
                    System.out.println("No ingresó una opcion valida.");
                    break;
            }
        } while (opcion!=4);
    }
    
    /**
     * ordenarAlfabeticamente - Recibe 3 palabras 
     * y las ordena alfabeticamente.
     */
    public static void ordenarAlfabeticamente(){
        String palabra1 = Console.readLine("Ingresa la primera palabra:");
        String palabra2 = Console.readLine("Ingresa la segunda palabra:");
        String palabra3 = Console.readLine("Ingresa la tercera palabra:");
        String palabraMayor = "";
        String palabraMenor = "";
        
        System.out.println("-------------Ordenar NOMBRES -----------------" );
        
        //Comparamos las primeras 2 palabras y sacamos mayor/menor
        if(palabra1.compareTo(palabra2)<0){
            palabraMayor = palabra2;
            palabraMenor = palabra1;
            
        } else {
            palabraMayor = palabra1;
            palabraMenor = palabra2;
            
        }
        //Comparamos las palabras restantes a esas mayor, menor.
        if(palabraMenor.compareTo(palabra3)<0){
            //palabra menor va antes de palabra 3 ahora veamos si tambien es
            // menor a palabra mayor
            if(palabra3.compareTo(palabraMayor)<0){
             //imprimimos palabra menor, palabra 3 y palabra mayor
             System.out.println(palabraMenor);
             System.out.println(palabra3);
             System.out.println(palabraMayor);
            } else {
             //imprimimos palabra menor, palabra mayor y palabra3
             System.out.println(palabraMenor);
             System.out.println(palabraMayor);
             System.out.println(palabra3);
            }
        } else {
            //palabra menor va después de palabra 3
            System.out.println(palabra3);
            System.out.println(palabraMenor);
            System.out.println(palabraMayor);
        }
        
    }
    
    /**
     * separarString - Separa las vocales de las consonantes.
     */
    public static void separarString(){
        String frase = Console.readLine("Ingresa la frase:");
        String vocales = "aeiouAEIOU";
        String vocalesFrase = "";
        
        for(int index = 0; index < frase.length(); index++){
            char letraActual = frase.charAt(index);
            if(vocales.indexOf(letraActual) != -1){
                vocalesFrase = vocalesFrase + letraActual;
                frase = frase.substring(0,index)+frase.substring(index+1,frase.length());
                index = index-1;
            }
        }
        System.out.println("-------------Separar VOCALES / CONSONANTES -----------------" );
        System.out.println(" consonantes: " + frase);
        System.out.println(" vocales: " + vocalesFrase);
    }
    
    /**
     * contarVocalesConsonantes - contar cantidad de vocales y consonantes.
     */
    public static void contarVocalesConsonantes(){
        String frase = Console.readLine("Ingresa la frase:");
        String vocales = "aeiouAEIOU";
        int vocalesCount = 0;
        
        for(int index = 0; index < frase.length(); index++){
            char letraActual = frase.charAt(index);
            if(vocales.indexOf(letraActual) != -1){
                vocalesCount++;
            }
        }
        System.out.println("-------------Contar VOCALES / CONSONANTES -----------------" );
        System.out.println(" consonantes: " + (frase.length() - vocalesCount));
        System.out.println(" vocales: " + vocalesCount);
    }
    
}
