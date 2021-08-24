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
        
        Scanner Leer = new Scanner(System.in);
        
        
        int arrey[]=new int[3];
        
        for (int i = 0; i < arrey.length; i++) {
            arrey[i]=Leer.nextInt();
        }
        
        for (int i = 0; i < arrey.length; i++) {
            for (int j = 0; j < arrey.length-1; j++) {
                if(arrey[j]>arrey[j+1]){
                   int temp=arrey[j];
                   arrey[j]=arrey[j+1];
                   arrey[j+1]=temp;
            }
        }
        }
                
             
            
        String orden=Leer.next();
        
        
        if(orden.equals("ABC")){
            System.out.println(arrey[0]+" "+arrey[1]+" "+arrey[2]);
        }
        else if(orden.equals("ACB")){
            System.out.println(arrey[0]+" "+arrey[2]+" "+arrey[1]);
        }
        else if(orden.equals("BAC")){
            System.out.println(arrey[1]+" "+arrey[0]+" "+arrey[2]);
        }
          else if(orden.equals("BCA")){
            System.out.println(arrey[1]+" "+arrey[2]+" "+arrey[0]);
        }    
        else if(orden.equals("CAB")){
            System.out.println(arrey[2]+" "+arrey[0]+" "+arrey[1]);
        }
          else if(orden.equals("CBA")){
            System.out.println(arrey[2]+" "+arrey[1]+" "+arrey[0]);
        }    
        
            
            
            
            
        }
    }
    

