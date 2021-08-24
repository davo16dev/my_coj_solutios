import java.util.Scanner;
public class DETERMINE {

    
    public static void main(String[] args) {
        Scanner Leer=new Scanner(System.in);
        long a=Leer.nextInt();
         long b=Leer.nextInt();
          long c=Leer.nextInt();
          boolean triang=true;
          if(((a+b+c)==180)&&(a>0)&&(b>0)&&(c>0))
              triang=true;
          else
             
              triang=false;        
          
          if(triang){
              if((b==60)&&(c==60)&&(a==60))
                  System.out.println("Equilateral");
              else
              if((a==b)||(c==b)||(a==c))
           System.out.println("Isosceles");
              else 
              if((a!=b)||(c!=b)||(a!=c))
           System.out.println("Scalene");
          }
        else
System.out.println("Error");    }
    
}