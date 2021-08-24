import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        
       int a=1;
       int b=1;
       
       while(a!=0&&b!=0){
           a=Leer.nextInt();
           b=Leer.nextInt();
           if(a==0&&b==0)
          break;
               System.out.println(a+b);
       }
       
           
    }
}