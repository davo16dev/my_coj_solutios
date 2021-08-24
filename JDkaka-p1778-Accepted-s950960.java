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

        Scanner Leer = new Scanner(System.in);
        
        int x = Leer.nextInt();

        for (int i = 0; i < x; i++) {
            double AC=Leer.nextInt();
            double AB=Leer.nextInt();
            
            
            
            
            
            double A1=(((AC/2)*(AB/2))/2);
            double A2=((AC/2)*(AB/4))/2;
            
    
            
            
            System.out.printf("%.8f\n",A1+A2);
        }
    }

}
