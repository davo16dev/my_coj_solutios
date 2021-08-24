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

        String nomb[] = new String[x];

        for (int i = 0; i < x; i++) {

            String a = Leer.next();
            String b = Leer.next();

            nomb[i] = b;

        }

        int y = Leer.nextInt();

        String bus[] = new String[y];

        for (int i = 0; i < y; i++) {

            String a = Leer.next();
            String b = Leer.next();

            bus[i] = b;

            
        }
        
        int con=0;
        
        
        
        for (int i = 0; i < bus.length; i++) {
            con=0;
            
            for (int j = 0; j < nomb.length; j++) {
                
                
                
                if(bus[i].equals(nomb[j]))
                    con++;
                
                
                
            }
        
            System.out.println(con);
        
        }
        
        
        

    }

}