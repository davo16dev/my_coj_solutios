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

        String Oracion = Leer.nextLine();

        String Arrey[] = Oracion.split(" ");
        int cont = 0;

        for (int i = 0; i < Arrey.length; i++) {

            cont = 0;

            for (int j = 0; j < Arrey[i].length(); j++) {

                
                 cont = 0;
                if (Arrey[i].length() == 9) {
                    if ((Arrey[i].charAt(0) == 'K') || (Arrey[i].charAt(0) == 'k')) {
                        cont++;
                    }

                    if ((Arrey[i].charAt(1) == 'R') || (Arrey[i].charAt(1) == 'r')) {
                        cont++;
                    }

                    if ((Arrey[i].charAt(2) == 'O') || (Arrey[i].charAt(2) == 'o')) {
                        cont++;
                    }

                    if ((Arrey[i].charAt(3) == 'K') || (Arrey[i].charAt(3) == 'k')) {
                        cont++;
                    }

                    if ((Arrey[i].charAt(4) == 'E') || (Arrey[i].charAt(4) == 'e')) {
                        cont++;
                    }

                    if ((Arrey[i].charAt(5) == 'T') || (Arrey[i].charAt(5) == 't')) {
                        cont++;
                    }

                    if ((Arrey[i].charAt(6) == 'T') || (Arrey[i].charAt(6) == 't')) {
                        cont++;
                    }

                    if ((Arrey[i].charAt(7) == 'E') || (Arrey[i].charAt(7) == 'e')) {
                        cont++;
                    }

                    if ((Arrey[i].charAt(8) == 'N') || (Arrey[i].charAt(8) == 'n')) {
                        cont++;
                    }
                }
                else 
                    continue;

                if (cont == 9) {
                    Arrey[i] = "croqueta";
                }

            }

           

        }
        for (int k = 0; k < Arrey.length; k++) {
            System.out.print(Arrey[k] + " ");

        }

    }
}