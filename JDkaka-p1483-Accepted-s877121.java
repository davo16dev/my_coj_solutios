import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) {
      Scanner Leer =new Scanner(System.in); 

      String S=Leer.next();
 
if(S.equals("square")){
      int a = Leer.nextInt();
  System.out.println(a*a);
  }
if(S.equals("rectangle")){
    int a=Leer.nextInt();
    int b=Leer.nextInt();
    System.out.println(a*b);
}  
        
   
    }
}