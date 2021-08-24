import java.util.Scanner;
public class COJProblem {

    
    public static void main(String[] args) {
      
        Scanner Leer=new Scanner(System.in);
        
        
        
        
        while(true){
            double num1=Leer.nextDouble();
            double num2=Leer.nextDouble();
            
            if(num1==0 && num2==0){
                System.out.println("AXIS");  
                break;
            }
            if(num1==0 || num2==0)
                System.out.println("AXIS");
            
            if(num1>0 && num2>0)
                System.out.println("Q1");
            
            if(num1<0 && num2>0)
                System.out.println("Q2");
            
            if(num1<0 && num2<0)
                System.out.println("Q3");
            
            if(num1>0 && num2<0)
                System.out.println("Q4");
            
            
            
        }
    }
}
