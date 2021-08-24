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

    
        Scanner Leer=new Scanner(System.in);
        
        
        int x=Leer.nextInt();
        
        
        for (int i = 0; i < x; i++) {
            
        
        
        double a=Leer.nextDouble();
        
        
        double areac=a*a;
        
        
        double areacc=((a/2)*(a/2))*Math.PI;
        
    
        System.out.printf("%.2f\n",areac-areacc);
    
        }
    }
    
}