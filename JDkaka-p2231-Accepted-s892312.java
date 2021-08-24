import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    int A=0 , B=0 ;
    
    Scanner Leer=new Scanner(System.in);
    
    int x=Leer.nextInt();

    
        for (int i = 0; i < x; i++) {
            
            String Aa=Leer.next();
            String Bb=Leer.next();
            
        if((Aa.equals("rock")&&(Bb.equals("scissors")))||(Aa.equals("scissors")&&(Bb.equals("paper")))||(Aa.equals("paper")&&(Bb.equals("rock"))))
            A++;
 
     else   
     if((Bb.equals("rock")&&(Aa.equals("rock")))||(Bb.equals("scissors")&&(Aa.equals("scissors")))||(Bb.equals("paper")&&(Aa.equals("paper")))){
            B++; 
            A++;}
      else
     B++;
                   }
    
    
        if(A>B)
        System.out.println("A win");
   
        if(A<B)
        System.out.println("B win");
    if(A==B)
        System.out.println("tied");
    
    
    
    }
    
}