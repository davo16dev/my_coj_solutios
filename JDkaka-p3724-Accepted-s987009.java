import java.util.Scanner;

/**
 *
 * @author Davos´
 */
public class TimeCombertion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner Leer = new Scanner(System.in);

        String aaa = Leer.nextLine();

        String arrey[] = aaa.split(":");

        int h;
        String ab = "", abc = "", abd = "";

        if (arrey[2].contains("PM")) {
            h = Integer.parseInt(arrey[0]) + 12;
        } else {

            h = Integer.parseInt(arrey[0]);
        }

        String s = "";

        for (int i = 0; i < arrey[2].length() - 2; i++) {
            s += arrey[2].charAt(i);
        }

        if (h < 10) {

            ab = "0" + h;
        } else {
            ab = "" + h;
        }

        int m = Integer.parseInt(arrey[1]);

        if (m < 10) {

            abc = "0" + m;
        } else {
            abc = "" + m;
        }

        int ss = Integer.parseInt(s);

        if (ss < 10) {

            abd = "0" + ss;
        } else {
            abd = "" + ss;
        }

        if (ab.equals("24")) {
            ab = "12";
        }

        if((ab.equals("12"))&&(arrey[2].contains("AM")))
            System.out.println( "00:" + abc + ":" + abd);
        else
        System.out.println(ab + ":" + abc + ":" + abd);
    }

}
