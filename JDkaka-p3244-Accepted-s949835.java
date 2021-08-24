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

        int arrey[] = new int[8];

        arrey[0] = Leer.nextInt();
        arrey[1] = Leer.nextInt();
        arrey[2] = Leer.nextInt();
        arrey[3] = Leer.nextInt();
        arrey[4] = Leer.nextInt();
        arrey[5] = Leer.nextInt();
        arrey[6] = Leer.nextInt();
        arrey[7] = Leer.nextInt();

        int arrey2[] = new int[8];

        arrey2[0] = arrey[0] + arrey[1] + arrey[2] + arrey[3];
        arrey2[1] = arrey[1] + arrey[2] + arrey[3] + arrey[4];
        arrey2[2] = arrey[2] + arrey[3] + arrey[4] + arrey[5];
        arrey2[3] = arrey[3] + arrey[4] + arrey[5] + arrey[6];
        arrey2[4] = arrey[4] + arrey[5] + arrey[6] + arrey[7];
        arrey2[5] = arrey[5] + arrey[6] + arrey[7] + arrey[0];
        arrey2[6] = arrey[6] + arrey[7] + arrey[0] + arrey[1];
        arrey2[7] = arrey[7] + arrey[0] + arrey[1] + arrey[2];
    
        int mayor=arrey2[0];
        
        for (int i = 0; i < arrey2.length; i++) {
           
            
           
          
            if(mayor<arrey2[i]){
                mayor=arrey2[i];
            }
        }
    
    
        System.out.println(mayor);
    }

}
