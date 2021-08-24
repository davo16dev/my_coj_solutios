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
    
    
    
    String a=Leer.next();
    String b=Leer.next();
    
    String res="";
    res=a+b;
    
    String res2="";
    
        for (int i = res.length()-1; i >=0; i--) {
            
            
            
            res2=res2+=res.charAt(i);
        }
 
    
        
        if(res.equals(res2))
            System.out.println("Yes");
        else
            System.out.println("No");
        
        
    }
    
}
