import java.util.Scanner;

public class Coj {

    
    public static void main(String[] args) {
        
        Scanner Leer = new Scanner(System.in);
String a="";

        
        int con=Leer.nextInt();
        
        
  for(int i=0 ; i <con ; i++ ){      
     
      a=Leer.next();

char b=a.charAt(a.length()-1);

if(b=='5'||b=='0')
    System.out.println("YES");
else
    System.out.println("NO");
  }
    }
}