import java.util.Scanner;

public class Coj3 {

    public static void main(String[] args) {

        Scanner Leer = new Scanner(System.in);
double Factor;
String May="";
double Mayor=0;
        int a = Leer.nextInt();
        for (int i = 0; i < a; i++) {
            String s=Leer.next();
            int PA = Leer.nextInt();
            int PJ = Leer.nextInt();
            int G = Leer.nextInt();
            int A = Leer.nextInt();
            int TA = Leer.nextInt();
            int TR = Leer.nextInt();
            
            Factor=Math.log10(PA)+PJ+2*G+A-(TA+(2*TR));
            
            if(Mayor<Factor){
                Mayor=Factor;
            May=s;
            }
           
           
        }
    System.out.println(May);
    }

}