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

        for (int i = 0; i < x; i++) {
            int x1 = Leer.nextInt();
            int y1 = Leer.nextInt();
            int x2 = Leer.nextInt();
            int y2 = Leer.nextInt();
       
        
        int disx=x1-x2;
        int disy=y1-y2;
        
        if(disx<0){
            disx=disx*-1;
        }
         if(disy<0){
            disy=disy*-1;
        }
        
         
            System.out.println(disx+disy);
        
        
        
        }

    }

}