import java.util.Scanner;
import javax.sound.midi.SysexMessage;

/**
 *
 * @author Davo1000
 */
public class CojEhvuelto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner Leer = new Scanner(System.in);

        int x = Leer.nextInt();

        for (int i = 0; i < x; i++) {

            double t = 0;

            for (int j = 0; j < 10; j++) {
                t += Leer.nextDouble();
            }

            System.out.printf("%.3f %n", (t*0.85));
            
        }
    }
}
