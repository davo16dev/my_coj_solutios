import java.util.Scanner;

/**
 *
 * @author Davo1000
 */
public class COJdenuevo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner Leer = new Scanner(System.in);

        int x = Leer.nextInt();

        for (int i = 0; i < x; i++) {

            int a=Leer.nextInt();
            long lol=0;
            
            for (int j = 0; j < a; j++) {
                
                lol+=Leer.nextLong();
            }
            
            if(lol%a==0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }

    }

}
