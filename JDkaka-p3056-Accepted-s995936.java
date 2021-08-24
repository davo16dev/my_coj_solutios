import java.util.Scanner;

/**
 *
 * @author Davo1000
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Leer = new Scanner(System.in);

        int arrey[]=new int[5];
        int arrey2[]=new int[5];

        arrey[0]=Leer.nextInt();
        arrey[1]=Leer.nextInt();
        arrey[2]=Leer.nextInt();
        arrey[3]=Leer.nextInt();
        arrey[4]=Leer.nextInt();
        
        
        arrey2[0]=Leer.nextInt();
        arrey2[1]=Leer.nextInt();
        arrey2[2]=Leer.nextInt();
        arrey2[3]=Leer.nextInt();
        arrey2[4]=Leer.nextInt();
        
   
        
        
        if((arrey[0]+arrey2[0]==1)&&(arrey[1]+arrey2[1]==1)&&(arrey[2]+arrey2[2]==1)&&(arrey[3]+arrey2[3]==1)&&(arrey[4]+arrey2[4]==1)){
            System.out.println("Y");
        }
        else
            System.out.println("N");
    }

}
