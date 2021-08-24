import java.util.Scanner;

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

        double x = Leer.nextInt();

        for (int i = 0; i < x; i++) {

            int N = Leer.nextInt();

            String pal = Leer.next();

            int cual = Leer.nextInt();

            int arrey[]=new int[N];
            
            for (int j = 0; j < arrey.length; j++) {
                arrey[j]=j+1;
            }
            
            if(pal.equals("odd"))
                System.out.println((2*cual-1)+1);
            else
                System.out.println((2*cual-1));
             
            
                
        }

        //     System.out.printf("%.3f %n", ((t / 30)+t));
    }
}
