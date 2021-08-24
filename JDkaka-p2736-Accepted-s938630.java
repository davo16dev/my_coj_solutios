import java.util.Scanner;

/**
 *
 * @author Charlie-PC
 */
public class JavaApplication45 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner Leer = new Scanner(System.in);

        String bin = Leer.next();

    
     
        long ones = 0;

        int x=0;
     
        
        while(x!=1){
        
        System.out.println(bin);    
            
            if(ones==1)
                break;
            
            
            ones=0;
        
        
        for (int i = 0; i < bin.length(); i++) {

            
            
            
            if (bin.charAt(i) == '1') {
                ones++;
            }
        }
           
        
        String binf="";
        bin="";
        
        
        
        
        while(ones!=0 ){
            
            long a= ones%2;
            
            if(a==0){
            binf+="0";
            
            }
            
            
            if(a==1){
            binf+="1";
            
            }
            
            ones/=2;
            
        }
        
        
        for (int i = binf.length()-1; i >=0; i--) {
            bin=bin+binf.charAt(i);
            
        }
        
        
       ones=0; 
        
        for (int i = 0; i < bin.length(); i++) {

            
            
            
            if (bin.charAt(i) == '1') {
                ones++;
            }
        }
        
            

        }
        }

    }


