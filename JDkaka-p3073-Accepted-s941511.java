
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
            
            
            String pal=Leer.next();
            
            
            if(pal.length()>10){
             
                String a="";
                a+=pal.charAt(0);
                a+=pal.length()-2;
                a+=pal.charAt(pal.length()-1);
                System.out.println(a);
            }
            else
                System.out.println(pal);
            
            
            
            
            
        }
    
    
    
    
    
    
    
    }
    
}