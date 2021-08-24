import java.util.Scanner;
public class COJProblem {

    
    public static void main(String[] args) {
      
        Scanner Leer=new Scanner(System.in);
        String cow = "cow";
        String ow = "ow";
        String neww="";
       String a2="";
        int a=Leer.nextInt();
        
        
        for(int i=0; i<a ; i++){
         String pal=Leer.next();
        
         char a1=pal.charAt(0);
         if(a1=='a'||a1=='e'||a1=='i'||a1=='o' ||a1=='u'){
         System.out.println(pal+cow);
         }
         else
         if(a1!='a'&&a1!='e'&&a1!='i'&&a1!='o' &&a1!='u'){
             
             a2=pal.substring(0, 1);
          
                 neww=pal.substring(1);
         
         
         System.out.println(neww+a2+ow);
         } 
             
             }
    }
}
