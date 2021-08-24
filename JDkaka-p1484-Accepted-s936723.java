import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner Leer = new Scanner(System.in);

        int x=Leer.nextInt();
      
        int yy=0;
        double mayor=0;
        
        
        for (int i = 0; i < x; i++) {
            
            
            double y=Leer.nextInt();
            
            if(y>=mayor){
                mayor=y;
            yy=i+1;
            }
        }
      
      System.out.println(yy);
    }
}