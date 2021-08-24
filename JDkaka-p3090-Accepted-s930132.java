import java.util.Scanner;
/**
 *
 * @author docencia
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc  =  new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if(((a*a)==(b*b)+(c*c))||((b*b)==(a*a)+(c*c))||((c*c)==(b*b)+(a*a)))
            System.out.println("rectangulo");
        else{
            if(((a*a)>(b*b)+(c*c))||((b*b)>(a*a)+(c*c))||((c*c)>(b*b)+(a*a)))
                System.out.println("obtusangulo");
            else
                System.out.println("acutangulo");
        }
    }
    
}