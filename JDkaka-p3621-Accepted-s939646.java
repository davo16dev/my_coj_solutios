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
        // TODO code application logic here
 
    
        Scanner Leer=new Scanner(System.in);
        
        
        
        
        int x=Leer.nextInt();
        
        
        
        for (int i = 0; i < x; i++) {
            
            double x1=Leer.nextDouble();
            double y1=Leer.nextDouble();
            double r1=Leer.nextDouble();
            double x2=Leer.nextDouble();
            double y2=Leer.nextDouble();
            double r2=Leer.nextDouble();
            
            double may;
            double men;
            
            double dis=Math.sqrt(((x1-x2)*(x1-x2))+((y1-y2)*(y1-y2)));
            
            
            if(r1>r2){
                may=r1;
                men=r2;
            }
            else{
                may=r2;
                men=r1;
            }
            
            
            
            if(dis>r1+r2)
                System.out.println("EXT");
            
            else if(dis==r1+r2)
                System.out.println("TANGENT EXT");
            else if((x1==x2)&&(y1==y2)&&(r1==r2))
                System.out.println("SAME");
            else if(may==dis+men)
                System.out.println("TANGENT INT");
            else if(may>dis+men)
                System.out.println("INT");
            else 
                System.out.println("SEC");
        }
    
    
    
    }
    
}