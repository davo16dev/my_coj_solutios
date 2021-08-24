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
        int arrey[] = new int[x];

        for (int i = 0; i < arrey.length; i++) {
            arrey[i] = Leer.nextInt();
        }

        int mayor = arrey[0];
        int menor = arrey[0];
        int romp = 0;

        for (int i = 1; i < arrey.length; i++) {
            if (arrey[i] > mayor) {
                romp++;
                mayor = arrey[i];
            }

            if (arrey[i] < menor) {
                romp++;
                menor = arrey[i];
            }

        }

        System.out.println(romp);
    }

}
