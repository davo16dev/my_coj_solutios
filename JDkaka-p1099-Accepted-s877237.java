import java.util.Scanner;


public class Main {

 
    public static void main(String[] args) {
      Scanner Leer =new Scanner(System.in); 

      int a=1;
while(a!=0){
   a=Leer.nextInt();
   if(a==0)
       break;
   int b=Leer.nextInt();
   int c=Leer.nextInt();
   
  if((a*a+b*b==c*c)||(a*a+c*c==b*b||b*b+c*c==a*a))
      System.out.println("right");
  else
      System.out.println("wrong");

   
       }
       
    }
}