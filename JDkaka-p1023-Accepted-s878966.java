import java.util.Scanner;
public class JavaApplication51 {

  
    public static void main(String[] args) {
   Scanner Leer=new Scanner(System.in);
        
        double suma=0;
       
        for(int i=0 ; i<12 ; i++){
            double a=Leer.nextDouble();
            suma+=a;
        }
    System.out.printf("$%.2f\n",suma/12);
    }
    
    
}