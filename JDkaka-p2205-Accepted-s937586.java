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

        int x =Leer.nextInt();

        int o=0;
        
        for (int i = 0; i < x; i++) {

            int con=0;
            int a = Leer.nextInt();
            int b = Leer.nextInt();
            String num="";
            
            for (int j = a; j <= b; j++) {
                
                
                int oo=j;
                
                while (oo != 0) {

                a=(int) (oo%2);
              
                if(a==0){
                    num+="0";
               
                }
                else{
                    num+="1";
               
                    con++;
                }
     
                oo=oo/2;
               
                
            }
                
           
                
                
            }
            
            System.out.println(con);

        }

    }

}