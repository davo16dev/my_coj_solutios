import java.util.Arrays;
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

            int m = Leer.nextInt();

            long w = Leer.nextLong();

            int arrey[] = new int[m];

            for (int a = 0; a < m; a++) {

                arrey[a] = Leer.nextInt();

            }

            
           Arrays.sort(arrey);

            for (int j = 1; j < arrey.length; j++) {
                arrey[j] = arrey[j - 1] + arrey[j];
            }

            long a=0;
            
            for (int j = 0; j < arrey.length; j++) {
                if (arrey[j] < w) {
                a++;    

                }
                else
                    continue;
            }

            System.out.println(a);
        }

    }
}