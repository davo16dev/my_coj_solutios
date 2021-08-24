import java.util.Scanner;

/**
 *
 * @author DavoUci16
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner Leer=new Scanner(System.in);
        
        while(true){
            long a=Leer.nextLong();
            
            if(a==-1){
                break;
            }
            
            String res="";
            long comp=0;
            
            for (int i = 1; i < a; i++) {
                if(a%i==0){
                    res+=i+" + ";
                    comp+=i;
                }
            }
            
            String resc="";
            
            for (int i = 0; i < res.length()-2; i++) {
                resc+=res.charAt(i);
            }
            
           if(a==comp){
               System.out.println(a+" = "+resc);
           }
           else
                System.out.println(a+" is NOT perfect.");
        }
        
    }
    
}
