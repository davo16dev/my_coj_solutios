import java.util.Scanner;


public class Main {
 
    public static void main(String[] args) {
      Scanner Leer =new Scanner(System.in);        
      int a=Leer.nextInt();
    if(a>=0)
        System.out.println(a*(a+1)/2);
     else
        System.out.println(-1*(a*(a-1)/2)+1) ; 
     if(a==0)
         System.out.println("1");
   
    }}