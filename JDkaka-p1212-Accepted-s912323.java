
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
        String OP = "**";

        while (OP.equals("**")) {
           

            String music = Leer.next();
 if (music.equals("*")) {
                break;
            }
            String A[] = music.split("/");

            double nota = 0;
            int bien = 0;

            for (int i = 1; i < A.length ; i++) {
                for (int j = 0; j < A[i].length(); j++) {
                    char x = A[i].charAt(j);
                    if (x == 'W') {
                        nota += 1;
                    }
                    if (x == 'H') {
                        nota += 0.5;
                    }
                    if (x == 'Q') {
                        nota += 0.25;
                    }
                    if (x == 'E') {
                        nota +=0.125 ;
                    }
                    if (x == 'S') {
                        nota += 0.0625;
                    }
                    if (x == 'T') {
                        nota +=0.03125 ;
                    }

                    if (x == 'X') {
                        nota +=0.015625;
                    }

                    
                }

                   
                
                if(nota==1)
                        bien++;
            nota=0;
            }

            System.out.println(bien);
        }
    }
}