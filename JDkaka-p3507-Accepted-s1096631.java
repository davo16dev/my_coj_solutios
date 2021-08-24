

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

        boolean casi = false;

        int x = Leer.nextInt();
        String pal;
        for (int i = 1; i <= x; i++) {

            casi = false;
            pal = Leer.next();

            if (pal.equals(pali(pal))) {
                System.out.println("Case #" + i + ": palindrome");
            } else {
                if (true) {

                    for (int j = 0; j < pal.length(); j++) {

                        if (cali(pal, j).equals(pali(cali(pal, j)))) {
                            casi = true;

                            System.out.println("Case #" + i + ": near-palindrome");
                            break;
                        }
                    }

                }
            }

            if ((!(pal.equals(pali(pal))))&&(!(casi))) {
                System.out.println("Case #" + i + ": neither");
            }
        }

    }

    static public String pali(String pal) {
        String pali = "";
        for (int i = pal.length() - 1; i > 0; i--) {
            pali += pal.charAt(i);
        }
        pali += pal.charAt(0);
        return pali;
    }

    static public String cali(String pal, int n) {
        String pali = "";

        for (int i = 0; i < pal.length(); i++) {
            if (n == i) {
                continue;
            }
            pali += pal.charAt(i);
        }

        return pali;
    }

}
