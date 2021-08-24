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
        
        int x=1;
        while(x!=0){
            
            int y=Leer.nextInt();
            
            if(y==0)
                break;
            
            
            int adn=(y-2)*4;
            

            int bor=(4*(y-2))*2;
            
            
            if(y<3)
                System.out.println(0);
            else
            System.out.println(adn+bor);
                 
            
            
      
            
            
        }
    
    
    }
}