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

            int sum = 0;

            String Imei = Leer.next();

            char arrey[] = new char[8];

            arrey[0] = Imei.charAt(1);
            arrey[1] = Imei.charAt(3);
            arrey[2] = Imei.charAt(5);
            arrey[3] = Imei.charAt(7);
            arrey[4] = Imei.charAt(9);
            arrey[5] = Imei.charAt(11);
            arrey[6] = Imei.charAt(13);

            int arrey2[] = new int[8];

            arrey2[0] = (((int) arrey[0] - 48) * 2);

            arrey2[1] = (((int) arrey[1] - 48) * 2);

            arrey2[2] = (((int) arrey[2] - 48) * 2);
            arrey2[3] = (((int) arrey[3] - 48) * 2);
            arrey2[4] = (((int) arrey[4] - 48) * 2);
            arrey2[5] = (((int) arrey[5] - 48) * 2);
            arrey2[6] = (((int) arrey[6] - 48) * 2);

            int arrey3[] = new int[8];
            arrey3[0] = Imei.charAt(0) - 48;
            arrey3[1] = Imei.charAt(2) - 48;
            arrey3[2] = Imei.charAt(4) - 48;
            arrey3[3] = Imei.charAt(6) - 48;
            arrey3[4] = Imei.charAt(8) - 48;
            arrey3[5] = Imei.charAt(10) - 48;
            arrey3[6] = Imei.charAt(12) - 48;

            for (int j = 0; j < arrey3.length; j++) {
                sum += arrey3[j];
            }

          

            for (int j = 0; j < 7; j++) {

               

                if (arrey2[j] <= 9) {
                    sum += arrey2[j];
                } else if (arrey2[j] == 10) {
                    sum += 1;
                } else if (arrey2[j] == 11) {
                    sum += 2;
                } else if (arrey2[j] == 12) {
                    sum += 3;
                } else if (arrey2[j] == 13) {
                    sum += 4;
                } else if (arrey2[j] == 14) {
                    sum += 5;
                } else if (arrey2[j] == 15) {
                    sum += 6;
                } else if (arrey2[j] == 16) {
                    sum += 7;
                } else if (arrey2[j] == 17) {
                    sum += 8;
                } else if (arrey2[j] == 18) {
                    sum += 9;
                }

            }
 
            int resto=sum%10;
           if(resto>0)
                System.out.println(10-resto);
                        else
               System.out.println(0);
        }

    }

}
