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
    
        Scanner Leer=new Scanner(System.in);
        
        int x=Leer.nextInt();
        
        int array[]=new int[x];
        
        for (int i = 0; i < x; i++) {
            array[i]=Leer.nextInt();
        }
    
        Arrays.sort(array);
        
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    
    }
    
}
