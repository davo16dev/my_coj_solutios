import java.util.Scanner;
public class COJComputmat {

    
    public static void main(String[] args) {
        Scanner Leer=new Scanner(System.in);
        
        String N=Leer.nextLine();
        int con=0;
       
        for(int i=0 ; i<=N.length()-1; i++ ){
        int a=N.charAt(i);
         
        if (a=='A'||a=='D'||a=='Q'||a=='P'||a=='O'||a=='R')
            con++;
        
        if(a=='B')
            con+=2;
      
        
        }
  
        System.out.println(con);
    }
    
}