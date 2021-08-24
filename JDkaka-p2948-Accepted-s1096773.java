import java.util.Scanner;

/**
 *
 * @author Davo1000
 */
public class CojEhvuelto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner Leer = new Scanner(System.in);

        double x = Leer.nextInt();

        String pal = "";

        for (int i = 0; i < x; i++) {

            pal = Leer.next();

        
            System.out.println(EEUU(pal));
              
        }

        //     System.out.printf("%.3f %n", ((t / 30)+t));
    }

    static String EEUU(String pal) {
       
        long x = 0;
        for (int i = 0; i < pal.length(); i++) {

            x+=Long.valueOf(pal.charAt(i)-48);
            
        }

        String a=String.valueOf(x);
        
        if(a.length()==1){
            return a;
        }
  
        return EEUU(a);
    }

}
