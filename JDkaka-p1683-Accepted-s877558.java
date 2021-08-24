import java.util.Scanner;

public class Coj3 {

    public static void main(String[] args) {
    int tot=0;
       int b=0;   
    Scanner Leer = new Scanner(System.in);

        int a=Leer.nextInt();
        for(int i=0 ; i<a ; i++){
    tot=0;     
             b=Leer.nextInt();
            for(int j=1 ; j<=b ; j++){
               if(b%j==0)
                   tot+=j;
            }
           
            if(tot-b<b)
                System.out.println("Deficient");
            
            if(tot-b==b)
                System.out.println("Perfect");
            
            if(tot-b>b)
                System.out.println("Abundant");
            
        }
       
    }

}