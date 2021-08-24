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
        int dig[] = new int[x ];
        for (int i = 0; i < x; i++) {
            dig[i] = Leer.nextInt();

        }

        for (int i = 0; i < dig.length - 1; i++) {
            for (int j = 0; j < dig.length - i - 1; j++) {
                if (dig[j] > dig[j + 1]) {
                    int tem = dig[j];
                    dig[j] = dig[j + 1];
                    dig[j + 1] = tem;
                }
            }
        }
        
        
        for (int i = 0; i < dig.length; i++) {
            System.out.println(dig[i]);
        }

    }

}