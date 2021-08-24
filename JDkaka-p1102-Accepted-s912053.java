import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    Scanner Leer =new Scanner(System.in);
    String X="";
    
    while(!X.equals("0")){ 
     X=Leer.nextLine();
    if(X.equals("0")){
        break;
    }
    int par=0;
    int impar=0;
    
    
  
        for (int i = 0; i < X.length(); i++) {
      
            
        if((i%2)==0)
            par+=X.charAt(i)-48;    
        else
            impar+=X.charAt(i)-48;
          
        
        }
    
    
        if(((par-impar)==0)||((par-impar)%11==0)&& (!X.equals("0"))){
            System.out.println(X+" is a multiple of 11.");

        }
  
        else
              System.out.println(X+" is not a multiple of 11.");
    
    
    
    
     }
    }}