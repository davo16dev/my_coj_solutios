
import java.util.Scanner;
public class JavaApplication45 {

    
    public static void main(String[] args) {
       
    Scanner Leer=new Scanner(System.in);
    int a=Leer.nextInt();
        int b=Leer.nextInt();
    int c=Leer.nextInt();

   
    
    if(((b*b)-(4*a*c))>=0)
        System.out.println("YES");
    else
          System.out.println("NO");
  
    }
}