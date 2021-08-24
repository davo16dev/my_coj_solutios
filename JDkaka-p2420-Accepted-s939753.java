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

        String num = "";
        String num2 = "";

        int x = Leer.nextInt();

        for (int i = 0; i < x; i++) {

            num = "";
            num2 = "";

            long oo = Leer.nextLong();

            while (oo != 0) {

                int a = (int) (oo % 2);

                if (a == 0) {
                    num += "0";

                } else {
                    num += "1";

                }

                oo /= 2;

            }

            for (int j = num.length() - 1; j >= 0; j--) {
                num2 = num2 + num.charAt(j);
            }

           

            if (num.equals(num2)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }

    }
}
