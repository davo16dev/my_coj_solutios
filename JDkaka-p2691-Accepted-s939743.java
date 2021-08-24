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
        int y = Leer.nextInt();

        int conA = 0;
        int conB = 0;

        for (int i = 0; i < x; i++) {
            conA += Leer.nextInt();
        }

        for (int i = 0; i < y; i++) {
            conB += Leer.nextInt();
        }

        if (conA > conB) {
            System.out.println("first win");
        } else if (conA == conB) {
            System.out.println("tie");
        } else {
            System.out.println("second win");
        }
    }

}
