
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

        String arrey[] = new String[5];

        String a = Leer.nextLine();
        if (a.contains("FBI")) {
            arrey[0] = "1";
        } else {
            arrey[0] = "x";
        }

        String b = Leer.nextLine();
        if (b.contains("FBI")) {
            arrey[1] = "2";
        } else {
            arrey[1] = "x";
        }

        String c = Leer.nextLine();
        if (c.contains("FBI")) {
            arrey[2] = "3";
        } else {
            arrey[2] = "x";
        }

        String d = Leer.nextLine();
        if (d.contains("FBI")) {
            arrey[3] = "4";
        } else {
            arrey[3] = "x";
        }

        String e = Leer.nextLine();
        if (e.contains("FBI")) {
            arrey[4] = "5";
        } else {
            arrey[4] = "x";
        }

        int con=0;
        for (int i = 0; i < arrey.length; i++) {
            if (arrey[i] != "x") {
                System.out.print(arrey[i]+  " ");
            } else {
                con++;
                continue;
            }
            
            
            
            
        }

        
        if(con==5){
            System.out.println("HE GOT AWAY!");
        }
    }

}
