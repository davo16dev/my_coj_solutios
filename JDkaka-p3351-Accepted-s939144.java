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

            boolean May = false;
            boolean Espejo = false;
            int may = 0;

            boolean Esp = true;

            String T2 = "";
            String Torre = "";
            Torre = Leer.next();

            for (int j = 0; j < Torre.length(); j++) {

                if ((int) Torre.charAt(j) >= 65 && (int) Torre.charAt(j) <= 90) {

                    may++;
                }

            }

            if (may == Torre.length()) {
                May = true;
            }

            for (int j = Torre.length() - 1; j >= 0; j--) {
                T2 = T2 + Torre.charAt(j);

            }

            if (T2.equals(Torre)) {
                Espejo = true;
            }

            for (int j = 0; j < Torre.length(); j++) {

              

           
                
                if (( Torre.charAt(j)== 'A') || (Torre.charAt(j) == 'H') || (Torre.charAt(j) == 'I') || (Torre.charAt(j) == 'M') ||  (Torre.charAt(j) == 'O')  || (Torre.charAt(j) == 'T') || (Torre.charAt(j) == 'U') || (Torre.charAt(j) == 'V') || (Torre.charAt(j) == 'X') || (Torre.charAt(j) == 'Y') ||(Torre.charAt(j)=='W')) {

                    
                }
                else
                    Esp=false;
            
               
                
                
               
            }
            
           

            if ((Espejo) && (May) && (Esp)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }

    }

}
