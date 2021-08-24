import java.util.Scanner;

public class JavaApplication51 {

    public static void main(String[] args) {
long tot=0;
        Scanner Leer = new Scanner(System.in);
        int a = Leer.nextInt();
      boolean div3=true;
      boolean div2=true; 
      String num="";
      for (int i = 0; i < a; i++) {
         
             num = Leer.next();
        
           tot=0;
            for(int j=0 ; j<=num.length()-1;j++){
              int u=num.charAt(j)-48;
       tot+=u;
                
        
        }    

         
       if(tot%3==0)
       div3=true;    
       else
        div3=false;
       
       char par=num.charAt(num.length()-1);
       
       if(par=='2'||par=='0'||par=='4'||par=='6'||par=='8')
           div2=true;
       else
           div2=false;
       
       if((div3)&&(div2))
           System.out.println("YES");
       else
           System.out.println("NO");
              
       
      
        }
    
    }
}