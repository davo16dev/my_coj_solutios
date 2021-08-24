import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Charlie-PC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner Leer = new Scanner(System.in);

        String pal=Leer.nextLine();
        
        char letras []=new char[pal.length()];
        
        for (int i = 0; i < pal.length(); i++) {
            letras[i]=pal.charAt(i);
            
        }
            
        Arrays.sort(letras);

  
        for (int i = 0; i < letras.length; i++) {
        System.out.print(letras[i]);    
        }
        
    
    }

  

}