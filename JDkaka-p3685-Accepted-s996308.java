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
        
        for (int i = 0; i < x; i++) {
        
            long y = Leer.nextLong();
            
            System.out.println((long)(3*(Math.pow(y, 2))+2));
            
        }
        
        

     
    }
}
