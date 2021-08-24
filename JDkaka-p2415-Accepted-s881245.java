import java.util.Scanner;

public class CCCok {

    public static void main(String[] args) {

        Scanner Leer = new Scanner(System.in);

        double rt=0;
        double ht=0;
        double VOLT=0;
        
        int a = Leer.nextInt();
        for (int i = 0; i < a; i++) {

            ht=0;
            rt=0;
            int b = Leer.nextInt();
            VOLT=0;
            for (int j = 0; j < b; j++) {
            
                double r=Leer.nextDouble();
            double h=Leer.nextDouble();
            
            double VOL=(Math.pow(r, 2))*Math.PI*h;
           
            VOLT+=VOL;    
        
            }
       
            System.out.printf("%.2f\n",VOLT);
        
        
        }

    }
}