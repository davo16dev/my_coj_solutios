import java.util.Scanner;


public class Main {

 
    public static void main(String[] args) {
      Scanner Leer =new Scanner(System.in);
      long a=Leer.nextInt();
      long b=Leer.nextInt();
      System.out.println(2*(a+b)+(a-b)+(b-a));
    }
}