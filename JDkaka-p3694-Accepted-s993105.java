
import java.util.Scanner;

/**
 *
 * @author Davo1000
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Leer=new Scanner(System.in);
        
        
        while(true){
            long x=Leer.nextLong();
            
            if(x==0){
                break;
            }
            
            int con=0;
            
            for (int i = 1; i < x; i++) {
                
                long v=(long) Math.pow(i, 3);
                
                
                
                if(v>x)
                    break;
                
                if(x%v==0)
                    con++;
                
                
                
            }
             
            if(x==1)
                   System.out.println(1);
                else
            System.out.println(con);
            
        }
        
        
       
    }
    
}
