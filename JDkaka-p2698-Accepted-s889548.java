import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner Leer = new Scanner(System.in);
        int suma = 0;

        String Pal = Leer.nextLine();

        for (int i = 0; i < Pal.length(); i++) {

            char X = Pal.charAt(i);

            if (X == 'A') {
                suma += 1;
            }
            if (X == 'B') {
                suma += 2;
            }
            if (X == 'C') {
                suma += 3;
            }
            if (X == 'D') {
                suma += 4;
            }
            if (X == 'E') {
                suma += 5;
            }
            if (X == 'F') {
                suma += 6;
            }
            if (X == 'G') {
                suma += 7;
            }
            if (X == 'H') {
                suma += 8;
            }
            if (X == 'I') {
                suma += 9;
            }
            if (X == 'J') {
                suma += 10;
            }
            if (X == 'K') {
                suma += 11;
            }
            if (X == 'L') {
                suma += 12;
            }
            if (X == 'M') {
                suma += 13;
            }
            if (X == 'N') {
                suma += 14;
            }
            if (X == 'O') {
                suma += 15;
            }
            if (X == 'P') {
                suma += 16;
            }
            if (X == 'Q') {
                suma += 17;
            }
            if (X == 'R') {
                suma += 18;
            }
            if (X == 'S') {
                suma += 19;
            }
            if (X == 'T') {
                suma += 20;
            }
            if (X == 'U') {
                suma += 21;
            }
            if (X == 'V') {
                suma += 22;
            }
            if (X == 'W') {
                suma += 23;
            }
            if (X == 'X') {
                suma += 24;
            }
            if (X == 'Y') {
                suma += 25;
            }
            if (X == 'Z') {
                suma += 26;
            }
            

        }

    System.out.println(suma);
    }
}