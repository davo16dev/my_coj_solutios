import java.math.BigDecimal;
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

        for (int i = 1; i <= x; i++) {

            String num = Leer.next();

            BigDecimal aa = new BigDecimal(num);

            BigDecimal aaa = new BigDecimal("5");

            String res = String.valueOf(aa.divide(aaa));

            res = res.replace('.', ',');

            System.out.println("Case " + i + ": " + res);

        }

    }
}
