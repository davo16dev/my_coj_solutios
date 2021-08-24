import java.util.Scanner;

/**
 *
 * @author Charlie-PC
 */
public class JavaApplication66 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    Scanner Leer=new Scanner(System.in);
    
    
    long equipos=Leer.nextLong();
    long juegos=0;
    long res=Leer.nextLong();
        
    equipos--;
    for (int i = (int) equipos; i >= 0; i--) {
   
            
            juegos+=i;
           
            equipos--;
        }
    
        System.out.println(juegos*res);
    
    
    
    
    }
    
}