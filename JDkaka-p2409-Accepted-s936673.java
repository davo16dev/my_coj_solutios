import java.util.Scanner;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner Leer=new Scanner(System.in);
        
        String gato=Leer.next();
        
        long x=Leer.nextInt();
        long y=Leer.nextInt();
        
        if(x>=y)
            System.out.println(gato + " "+(x-y));
        else 
             System.out.println(gato + " "+((x-y)*-1));
    }
    
}