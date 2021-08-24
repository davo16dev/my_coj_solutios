
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

        for (int i = 0; i < x; i++) {

            if (i == 0) {
                String aa = Leer.nextLine();
            }

            String pal = Leer.nextLine();

            String rep = " ";
            String alf = Leer.nextLine();

            char cod[] = new char[26];

            for (int j = 0; j < alf.length(); j++) {

                cod[j] = alf.charAt(j);

            }

         

            for (int j = 0; j < pal.length(); j++) {

                if(j>0){
                if (pal.charAt(j) == ' ') {
                    rep += " ";
                }}

                if (pal.charAt(j) == 'A') {
                    rep += cod[0];
                }

                if (pal.charAt(j) == 'B') {
                    rep += cod[1];
                }
                if (pal.charAt(j) == 'C') {
                    rep += cod[2];
                }
                if (pal.charAt(j) == 'D') {
                    rep += cod[3];
                }
                if (pal.charAt(j) == 'E') {
                    rep += cod[4];
                }
                if (pal.charAt(j) == 'F') {
                    rep += cod[5];
                }
                if (pal.charAt(j) == 'G') {
                    rep += cod[6];
                }
                if (pal.charAt(j) == 'H') {
                    rep += cod[7];
                }
                if (pal.charAt(j) == 'I') {
                    rep += cod[8];
                }
                if (pal.charAt(j) == 'J') {
                    rep += cod[9];
                }
                if (pal.charAt(j) == 'K') {
                    rep += cod[10];
                }
                if (pal.charAt(j) == 'L') {
                    rep += cod[11];
                }
                if (pal.charAt(j) == 'M') {
                    rep += cod[12];
                }
                if (pal.charAt(j) == 'N') {
                    rep += cod[13];
                }
                if (pal.charAt(j) == 'O') {
                    rep += cod[14];
                }
                if (pal.charAt(j) == 'P') {
                    rep += cod[15];
                }
                if (pal.charAt(j) == 'Q') {
                    rep += cod[16];
                }
                if (pal.charAt(j) == 'R') {
                    rep += cod[17];
                }
                if (pal.charAt(j) == 'S') {
                    rep+=cod[18];
                }
                if (pal.charAt(j) == 'T') {
                    rep+=cod[19];
                }

                if (pal.charAt(j) == 'U') {
                    rep+=cod[20];
                }
                if (pal.charAt(j) == 'V') {
                    rep+=cod[21];
                }
                if (pal.charAt(j) == 'W') {
                    rep+=cod[22];
                }
                if (pal.charAt(j) == 'X') {
                    rep+=cod[23];
                }
                if (pal.charAt(j) == 'Y') {
                    rep+=cod[24];
                }
                if (pal.charAt(j) == 'Z') {
                    rep+=cod[25];
                }
                
                        
            }

            System.out.println((i+1)+rep);
        }

    }

}