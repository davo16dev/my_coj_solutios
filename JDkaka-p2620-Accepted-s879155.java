import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       Scanner Leer =new Scanner(System.in);
       long a=Leer.nextInt();
       
      long dd=a*4;
      String aa="a";
      String Ah="A";
      String H="h";
      String res="";
      for(int i=0 ; i<dd ; i++){
          
          Ah+=aa;
           res=Ah+H;
          
          
      }
       
      System.out.println(res);
           
       
        
    }
    
}