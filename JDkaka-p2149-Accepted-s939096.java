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
        Scanner Leer = new Scanner(System.in);

        int a = Leer.nextInt();
        int min = 0;
        int may = 0;
        String WW = "";
        for (int i = 0; i < a; i++) {
        
            min=0;
            may=0;
            
            if(i==0){
            String aa=Leer.nextLine();
            }
            
            
            WW = Leer.nextLine();

            
            for (int j = 0; j < WW.length() ; j++) {
               
                
                
                if ((int)WW.charAt(j) >= 97 && (int)WW.charAt(j) <= 122) {
                    min++;
                }

               else {
                    may++;
                }

            }
           

         
                
          
            if (min == may) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }

        }

    }

}