import java.util.Scanner;

public class JavaApplication51 {

    public static void main(String[] args) {
long tot=0;
        Scanner Leer = new Scanner(System.in);
        int a = Leer.nextInt();
      double pro=0;
      for (int i = 0; i < a; i++) {
      double jug=Leer.nextDouble();
      pro+=jug;
      
      }   
    System.out.printf("%.2f\n",pro/a);
    }
}