import java.util.Scanner;

/**
 *
 * @author Davo1000
 */
public class CojEhvuelto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner Leer = new Scanner(System.in);

        double t = 0;

       
        for (int i = 0; i < 30; i++) {
            t+=Leer.nextDouble();
        }
        
            System.out.printf("%.3f %n", ((t / 30)+t));

       
    }
}
