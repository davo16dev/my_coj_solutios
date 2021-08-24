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

        long sum = 0;
        long tr13 = 0;
        long res = 0;

        int a = Leer.nextInt();

        for (int i = 0; i < a; i++) {
            sum = 0;
            tr13 = 0;
            res = 0;
            long X = Leer.nextLong();
            long Y = X;

            while (X != 0) {
                int u = (int) (X % 10);
                sum += u;

                X /= 10;
            }

           

            tr13 = Y % 1000;
            tr13 *= 10;
           

            res = tr13 + sum;

            if ((res > 999) && (res < 9999)) {
                System.out.println(res);
            } else {
                if (res < 100) {
                    System.out.println(res + 1000);
                } else {
                    String W = String.valueOf(res);
                    if (res > 9999) {
                        System.out.println(W.substring(W.length() - 4, W.length()));
                    }

                }
            }
        }
    }
}
