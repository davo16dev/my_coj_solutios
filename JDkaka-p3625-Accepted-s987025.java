
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
        int fib[] = new int[300];
        boolean mk[] = new boolean[5007];
        fib[0] = 0;
        fib[1] = 1;
        for(int i = 2; i < 300; i++){
            fib[i] = fib[i - 1] + fib[i - 2];
            //System.out.println(fib[i]);
            if(fib[i] > 5000)break;
            mk[fib[i]] = true;
        }
        
        int t;
        t = Leer.nextInt();
        while(t > 0){
            int n = Leer.nextInt();
            /*if(n == 2){
                System.out.println("Ron wins");
            }
            else */if(mk[n])
                System.out.println("Harry wins");
            else
                System.out.println("Ron wins");
            t--;
        }
                
    }

}
