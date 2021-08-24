import java.util.Scanner;
public class JavaApplication48 {

   

    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
    int rey=1 ,  reina=1  , torre=2 , alfil=2 , cab=2 , peon=8 ;
    int r = 0 ,re=0 , t=0 ,al=0 ,c=0 ,p=0 ; 
    int a = Leer.nextInt();

        for (int i = 0; i < a; i++) {
     r = Leer.nextInt();
             re = Leer.nextInt();
              t = Leer.nextInt();
              al = Leer.nextInt();
              c = Leer.nextInt();
              p=Leer.nextInt();
       
         System.out.println((rey-r)+" "+(reina-re)+" "+(torre-t)+" "+(alfil-al)+" "+(cab-c)+" "+(peon-p));
        }
    
   
    
    }}