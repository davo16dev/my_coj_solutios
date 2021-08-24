import java.util.Scanner;
/**
 *
 * @author bhroque
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc =  new Scanner ( System.in);
        int cont = sc.nextInt(), a;
        for (int i = 0; i < cont; i++) {
            a = sc.nextInt();
            System.out.println(a-1);
        }
        
    }
    
}
