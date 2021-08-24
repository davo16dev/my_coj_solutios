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

        Scanner Leer = new Scanner(System.in);

     
        int x = Leer.nextInt();

        int con=0;
        
        
        for (int i = 0; i < x; i++) {

            String num = "";
            long y = Leer.nextInt();
            
            long a=0;
            
            
            while (y != 0) {

                a=(int) (y%2);
              
                if(a==0){
                    num+="0";
               
                }
                else{
                    num+="1";
               
                    con++;
                }
     
                y=y/2;
                
                
            }

          
            
      
       
         
        }

           System.out.println(con);
    }

}
