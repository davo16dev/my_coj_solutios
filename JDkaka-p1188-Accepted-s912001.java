import java.util.Scanner;


public class CowM {

    
    
    public static void main(String[] args) {
    
        
        Scanner Leer=new Scanner(System.in);
        
        String A=Leer.next();
        String B=Leer.next();
        
        int Cow=0;
        
        
        for (int i = 0; i < A.length(); i++) {
            for (int j = 0; j < B.length(); j++) {
                int a=A.charAt(i)-48;
                int b=B.charAt(j)-48;
          
             Cow+=a*b;  
            }
        }
        
        System.out.println(Cow);
        
    }
    
}