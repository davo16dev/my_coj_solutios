import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Davo1000
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Leer = new Scanner(System.in);


        int x=Leer.nextInt();
        
        String pp=Leer.nextLine();
        
        String[] arrey=pp.split(" ");
        
        int min=0;
        
        int may=0;
        
           for (int j = 0; j < arrey[1].length() ; j++) {
               
                
                
                if ((int)arrey[1].charAt(j) >= 97 && (int)arrey[1].charAt(j) <= 122) {
                    min++;
                }

               else {
                    may++;
                }

            }
           
           
           System.out.println(may +" "+min);
         
        
        
        
        
        

    }
}
