
/**
 * Revisa si una palabra es un palindromo
 *
 * @author Daniel Xutuc
 * @version 0.0.1
 */
public class PrincipalPalindromo
{
    public static void main(String[] args){
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
