import java.util.Scanner;

/**
 *
 * @author Charlie-PC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner Leer = new Scanner(System.in);

     int x=Leer.nextInt();
     
        for (int i = 0; i < x; i++) {
            double a=Leer.nextDouble();
            String op=Leer.next();
            double b=Leer.nextDouble();
        
            String op2=Leer.next();
        
            double c=Leer.nextDouble();
            
            if(op.equals("+")){
                if(a+b==c){
                    System.out.println("Yes");
                }
                else
                    System.out.println("No");
            }
            
            if(op.equals("-")){
                if(a-b==c){
                    System.out.println("Yes");
                }
                else
                    System.out.println("No");
            }
        
            if(op.equals("*")){
                if(a*b==c){
                    System.out.println("Yes");
                }
                else
                    System.out.println("No");
            }
            
            if(op.equals("/")){
                if(b==0){
                    System.out.println("No");
                    continue;}
                    else
                    if(a/b==c){
                       System.out.println("Yes");
                            }
                else
                        System.out.println("No");
                
            }
        }
        
    
    }
}