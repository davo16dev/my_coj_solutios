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
        
        
        for (int i = 0; i < x; i++) {
            
            
            String c=Leer.next();
            
            
            String real=c+c;
            
          
          
            String neww="";
            
            
            
            for (int j = 0; j < real.length(); j++) {
                if(j<real.length()-c.length()){
                   
                   
                    
                    neww+=real.charAt(j);
                }
                else
                    neww+="0";
            }
            
            if(neww.equals("00")){
                System.out.println("0");
            }
            else
            System.out.println(neww);
            
            
            
            
        }
        
        
        
    }
    
}
