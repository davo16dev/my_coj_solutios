import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Davo1000
 */
public class COJdenuevo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner Leer = new Scanner(System.in);

        int x = Leer.nextInt();

        Leer.nextLine();
        
        for (int i = 0; i < x; i++) {

            
            
            
            String lol = Leer.nextLine();

            String lol2 = Leer.nextLine();

            lol.toUpperCase();
            lol2.toUpperCase();
            
            lol=KitarEspacio(lol);
            lol2=KitarEspacio(lol2);
            
            lol=Ord(lol);
            lol2=Ord(lol2);
            
            if(lol.equals(lol2))
                System.out.println("yes");
            else
                System.out.println("no");
            

        }

    }
    
    
    static String Ord(String lol){
        
        String lol2="";
        
        char array[]=new char[lol.length()];
        
        for (int i = 0; i < lol.length(); i++) {
            array[i]=lol.charAt(i);
        }
        
        Arrays.sort(array);
        
        for (int i = 0; i < array.length; i++) {
            lol2+=array[i];
        }
        
        
        
        return lol2;
    }
    
    
    
    
    

    static String KitarEspacio(String lol) {

        String lol2 = "";

        for (int i = 0; i < lol.length(); i++) {
            if (lol.charAt(i) == ' ') {
                continue;
            }

            lol2 += lol.charAt(i);
        }

        return lol2;
    }

}
