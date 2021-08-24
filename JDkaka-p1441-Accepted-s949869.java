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

        long a = 1, b = 1, c = 1;
        int x = 1;
        while (x != 0) {

            a = Leer.nextLong();
            b = Leer.nextLong();
            c = Leer.nextLong();
            boolean men=true;
            boolean zero=true;
            
            if((a<0)||(b<0)||(c<0)){
                men=false;
            }
            
            if((a==0)||(b==0)||(c==0)){
                zero=false;
            }
            
            if ((a == 0) && (b == 0) && (c == 0)) {
                break;
            }

            if((((a*a)==(b*b)+(c*c))||((b*b)==(a*a)+(c*c))||((c*c)==(b*b)+(a*a)))&&(men)&&(zero)){
            System.out.println("right");
                
            }
            else
            System.out.println("wrong");    
        }
    }
}
