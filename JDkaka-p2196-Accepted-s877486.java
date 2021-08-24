import java.util.Scanner;

public class Coj {

    
    public static void main(String[] args) {
        
        Scanner Leer = new Scanner(System.in);
String a="";

        
        int con=Leer.nextInt();
        
        
  for(int i=0 ; i <con ; i++ ){      
     
      a=Leer.next();

char b=a.charAt(a.length()-1);

if(b=='2'||b=='0'||b=='4'||b=='6'||b=='8')
    System.out.println("even");
else
    System.out.println("odd");
  }
    }
}