import java.math.BigInteger;
import java.util.Arrays;
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

        String lol=Leer.next();
        BigInteger lolr=new BigInteger(lol);
        
        
        
        int x = Leer.nextInt();

        String a=lolr.pow(x).toString();
        
        String res="";
        
        for (int i = 0; i < a.length(); i++) {
            if(i>0){
            if(i%70==0)
                res+="\n";
            }
            res+=a.charAt(i);
                
        }
 
        System.out.println(res);
    }

}
