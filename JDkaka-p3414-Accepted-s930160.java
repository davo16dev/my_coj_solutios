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
        // TODO code application logic here
    
    
    Scanner Leer=new Scanner(System.in);
    
    String Zero="0";
    String SVC="625";
    
    int a=Leer.nextInt();
    
    
        for (int i = 0; i < a-1; i++) {
           SVC+=Zero;
            
        }
    
    System.out.println(SVC);
            
    }
    
}
