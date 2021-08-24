import java.util.Scanner;

public class JavaApplication51 {

    public static void main(String[] args) {
long tot=0;
        Scanner Leer = new Scanner(System.in);
        int a = Leer.nextInt();
      
        for (int i = 0; i < a; i++) {
         
            String num = Leer.next();
        
           tot=0;
            for(int j=0 ; j<=num.length()-1;j++){
              int u=num.charAt(j)-48;
       tot+=u;
                
        
        }    
       if(num.charAt(0)!='-')
            System.out.println(tot);
       else
           System.out.println(tot+3);
        }
    }
}