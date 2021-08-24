import java.util.Scanner;

/**
 *
 * @author Davo1000
 */
public class COJdenuevo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner Leer = new Scanner(System.in);

        String lol = Leer.next();

        if (lol.equals("circle")) {
            double x = Leer.nextDouble();
            double res = (x * x) * (3.14);
            System.out.printf("%.2f", res);
        } else
        if(lol.equals("triangle"))
        {
            double a = Leer.nextDouble();
            double b = Leer.nextDouble();
            double res2 = (a * b) / 2;
            System.out.printf("%.2f", res2);

        }else{
            double a = Leer.nextDouble();
            double b = Leer.nextDouble();
            double res2 = (a * b) / 2;
            System.out.printf("%.2f", res2);

        }

    }

}
