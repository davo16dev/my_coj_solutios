import java.util.Scanner;

/**
 *
 * @author Davos´
 */
public class TimeCombertion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner Leer = new Scanner(System.in);

        int x=Leer.nextInt();
        
        for (int i = 0; i < x; i++) {
            
        
        int m=Leer.nextInt();
        int n=Leer.nextInt();
        
        int y=mcd(m , n);
            System.out.println((m*n)/(y*y));
        
        }
        
    }

    public static int mcd(int n, int m) {
        if (m == 0) {
            return n;
        }
        return mcd(m, n % m);

    }

}
