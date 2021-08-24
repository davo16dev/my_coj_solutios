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

        int x = Leer.nextInt();

        for (int i = 0; i < x; i++) {

            int a = Leer.nextInt();
            int b = Leer.nextInt();

           int  pos=1;
            int arrey[][] = new int[b][a];

            for (int j = 0; j < b; j++) {
                for (int k = 0; k < a; k++) {

                    arrey[j][k] = Leer.nextInt();

                }
            }

            
            int mayor=-1;
           
            for (int j = 0; j < a; j++) {


                int cont=0;

                




                for (int k = 0; k < arrey.length; k++) {
                   cont+=arrey[k][j];
                    
                }
            
                if(cont>mayor){
                    mayor=cont;
                    pos=j;
                }
            
            
            }

            System.out.println(pos+1);
        }

    }

}
