import java.util.Scanner;
public class JavaApplication45 {

    
    public static void main(String[] args) {
      
    Scanner Leer=new Scanner(System.in);
    int a=1;
    int ball=0;
    while(a!=0){
     ball=0;
        a=Leer.nextInt();
        if(a==0)
            break;
        for(int i=1; i<=a ; i++){
            ball+=i*i;
        }
        if(a!=0){
            System.out.println(ball);
        }    
        
    }
    }
    
}