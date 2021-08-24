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

        while (true) {
            String pal = Leer.nextLine();

            if (pal.equals("*")) {
                break;
            }

            char mas = 0, min = 0;
            char c = pal.charAt(0);
            mas = c;

            if ((pal.charAt(0) >= 'A') && (pal.charAt(0) <= 'Z')) {

                min = (char) (c + 32);

            } else {
                mas = (char) c;

                min = (char) (c - 32);
            }

            String[] arrey = pal.split(" ");

            boolean des = true;

            for (int i = 0; i < arrey.length; i++) {
                char y = arrey[i].charAt(0);
                if ((y != (char) mas) && (y != (char) min)) {
                    des = false;

                    break;
                }
            }

            if (des) {
                System.out.println("Y");
            } else {
                System.out.println("N");
            }

        }

    }

}
