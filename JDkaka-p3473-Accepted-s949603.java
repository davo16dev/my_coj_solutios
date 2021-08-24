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

        int arrey[] = new int[4];

        arrey[0] = Leer.nextInt();
        arrey[1] = Leer.nextInt();
        arrey[2] = Leer.nextInt();
        arrey[3] = Leer.nextInt();

        int cont90 = 0;

        for (int i = 0; i < 4; i++) {
            if (arrey[i] == 90) {
                cont90++;
            }

        }

        if (cont90 == 2) {
            System.out.println("right");
        } else if (cont90 != 2) {
            int cona = 0;
            int conb = 0;
            int conc = 0;
            int cond = 0;

            if (arrey[0] == arrey[1]) {
                cona++;
            }
            if (arrey[0] == arrey[2]) {
                cona++;
            }
            if (arrey[0] == arrey[3]) {
                cona++;
            }

            if (arrey[1] == arrey[0]) {
                conb++;
            }
            if (arrey[1] == arrey[2]) {
                conb++;
            }
            if (arrey[1] == arrey[3]) {
                conb++;
            }

            if (arrey[2] == arrey[1]) {
                conc++;
            }
            if (arrey[2] == arrey[0]) {
                conc++;
            }
            if (arrey[2] == arrey[3]) {
                conc++;
            }

            if (arrey[3] == arrey[1]) {
                cond++;
            }
            if (arrey[3] == arrey[2]) {
                cond++;
            }
            if (arrey[3] == arrey[0]) {
                cond++;
            }
            
            

            if ((cona==1)&&(conb==1)&&(conc==1)&&(cond==1)) {
                System.out.println("isosceles");
            } else {
                System.out.println("none of the previous");
            }

        }

    }
}