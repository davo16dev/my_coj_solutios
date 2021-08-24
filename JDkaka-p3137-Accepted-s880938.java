import java.util.Scanner;
public class COJProblem {

    
    public static void main(String[] args) {
      
        Scanner Leer=new Scanner(System.in);
        
        int a=Leer.nextInt();
        for(int i=0; i<a ; i++){
            int n1=Leer.nextInt();
            int n2=Leer.nextInt(); 
            int n3=Leer.nextInt();
            
        boolean suma=true;
        boolean div=true;    
           
        if((n1+n2==n3)||(n1-n2==n3)||(n1*n2==n3)){
            suma=true;
        }
         else
                suma=false;
            
        if((n2!=0)&&((n1/n2==n3)||(n1%n2==n3))){
          div=true;     
        }
        else
            div=false;
        
        
        if((suma)||(div)){
            System.out.println("YES");
        }
        else
            System.out.println("NO");
        
    }
    }
}
