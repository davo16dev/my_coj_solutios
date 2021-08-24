
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
  
 Scanner Leer=new Scanner(System.in);
 
 
 int x=Leer.nextInt();
 
 int glad[]=new int [x];
        for (int i = 0; i < x; i++) {
            
            glad[i]=Leer.nextInt();
            
        }

int help;


        for (int i = 0; i < (x-1); i++) {
            for (int j = 0; j < x-i-1; j++) {
                if(glad[j]>glad[j+1]){
                    help=glad[j];
                    glad[j]=glad[j+1];
                    glad[j+1]=help;
                }
            }
            
        }
        
        
        System.out.print(glad[glad.length-1]+" ");
        for (int i = 0; i < glad.length-1; i++) {
            System.out.print(glad[i]+" ");
        }
        
        
        
    }
    
}
