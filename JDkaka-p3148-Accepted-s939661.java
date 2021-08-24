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

            String cas = Leer.next();

            char let = cas.charAt(0);
            char num = cas.charAt(1);

            
            
            
            if (((let == 'a') || (let == 'c') || (let == 'e') || (let == 'g')) && (int)num % 2 == 0) {
                System.out.println("BLACK");
            }

            else if(((let == 'a') || (let == 'c') || (let == 'e') || (let == 'g')) && (int) num % 2 != 0) {
                System.out.println("WHITE");
            }

            else if(((let == 'b') || (let == 'd') || (let == 'f') || (let == 'h')) && (int) num % 2 == 0) {
                System.out.println("WHITE");
            }

            else if(((let == 'b') || (let == 'd') || (let == 'f') || (let == 'h')) && (int) num % 2 != 0) {
                System.out.println("BLACK");
            }
        }

    }

}