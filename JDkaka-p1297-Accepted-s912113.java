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

        Scanner Leer = new Scanner(System.in);

        int x = Leer.nextInt();

        boolean once = false;
        boolean tres = false;
        boolean cinco = false;

        for (int i = 0; i < x; i++) {
            
            String X = Leer.next();

            char ult = X.charAt(X.length() - 1);

            if ((ult == '5') || (ult == '0')) 
                cinco = true;
            else
                cinco=false;
            

            long cifras = 0;
            for (int j = 0; j < X.length(); j++) {

                cifras += X.charAt(j) - 48;
            }

            if (cifras % 3 == 0) {
                tres = true;
            }
            else
                tres=false;

            int par = 0;
            int impar = 0;

            for (int k = 0; k < X.length(); k++) {

                if ((k % 2) == 0) {
                    par += X.charAt(k) - 48;
                } else {
                    impar += X.charAt(k) - 48;
                }

            }

            if (((par - impar) == 0) || ((par - impar) % 11 == 0) && (!X.equals("0"))) {
                once = true;
            }
            else
                once=false;

            if ((tres) && (cinco) && (once)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }

    }
}
