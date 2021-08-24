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

           
            
            
            String pal1 = Leer.next();
            String pal2 = Leer.next();

            
            
            int dif=0;
            
            for (int j = 0; j < pal1.length(); j++) {
                
                if(pal1.charAt(j)!=pal2.charAt(j))
                    dif++;
            }
            
            System.out.println(dif);
            
        }

    }

}
