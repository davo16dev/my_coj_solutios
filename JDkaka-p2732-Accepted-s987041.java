
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
        
        //char c = 'A';
        //int x = c;
        //System.out.println(x);
        int t;
        t = Leer.nextInt();
        
        
        
        for (int i = 0; i < t; i++) {
            String ans = "";
            String cad = Leer.next();
            
            for(int k = 0; k < cad.length(); k++)
            {
                char c = cad.charAt(k);
                if(c >= 'a' && c <= 'z')
                {
                    int x = c - 'a';
                    char sol = (char) (x + 'A');
                    ans += sol;
                }
                else{
                    int x = c - 'A';
                    char sol = (char) (x + 'a');
                    ans += sol;
                }
            }
            System.out.println(ans);
         }
       
    }

}
