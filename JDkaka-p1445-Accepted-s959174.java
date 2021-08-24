import java.util.Scanner;

/**
 *
 * @author DavoUci16
 */
public class PGAP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner Leer = new Scanner(System.in);

        while (true) {
            long a = Leer.nextLong();
            long b = Leer.nextLong();
            long c = Leer.nextLong();
            long div = 1;

            if ((a == 0) && (b == 0) && (c == 0)) {
                break;
            }

            long pos = b - a;

            if(a!=0){
                 div = b / a;
            }
            
           

         
            if (c == b + pos) {
                System.out.println("AP " + (c + pos));
            } else {
                System.out.println("GP " + (c * div));
            }

        }
    }
}
