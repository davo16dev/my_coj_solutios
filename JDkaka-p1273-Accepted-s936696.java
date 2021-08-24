import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner Leer = new Scanner(System.in);

        int x=Leer.nextInt();
        
        for (int i = 0; i < x; i++) {
            
            int a=Leer.nextInt();
            int b=Leer.nextInt();
            int c=Leer.nextInt();
            
            
            int aa=0;
            
            
            for (int j = a+1; j > 0; j--) {
                aa+=j;
            }
                    
            System.out.println(aa*b*c);
      
        
        
        }
      
    }
}