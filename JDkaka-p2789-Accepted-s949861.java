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
        
        String lolt=Leer.next();
        
       
       String lol="";
        for (int i = 0; i < lolt.length(); i++) {
            if(lolt.charAt(i)=='+'){
                lol+='/';
            }
            else
                    lol+=lolt.charAt(i);
        }
        
        
        
        
        
        
        
        String arrey[]=lol.split("/");
        
        int dig[]=new int [arrey.length];
        
        for (int i = 0; i < dig.length; i++) {
            dig[i]=Integer.parseInt(arrey[i]);
        }
        
        
        
        
        
        for (int i = 0; i < dig.length-1; i++) {
            for (int j = 0; j < dig.length-i-1; j++) {
                if(dig[j]>dig[j+1]){
                    int tem=dig[j];
                    dig[j]=dig[j+1];
                    dig[j+1]=tem;
                }
            }
        }
        
        for (int i = 0; i < dig.length-1; i++) {
            System.out.print(dig[i]+"+");
        }
        System.out.println(dig[dig.length-1]);
    }
    
}
