import java.math.BigInteger;
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

        int x = Leer.nextInt();

        for (int i = 0; i < x; i++) {

            long y = Leer.nextLong();
            BigInteger bi = new BigInteger("1");
            BigInteger bi2 = new BigInteger("1");

            while (y != 1) {

                String aa = String.valueOf(y);

                bi = new BigInteger(aa);

                bi2= bi2.multiply(bi);
                
                y--;
            }

            System.out.println(bi2);

        }

    }
}
