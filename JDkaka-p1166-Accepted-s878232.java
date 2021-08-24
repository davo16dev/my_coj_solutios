import java.util.Scanner;
public class JavaApplication48 {

    
     public static void main(String[] args) {
     
        int even=0;
        int odd=0;
    Scanner Leer = new Scanner(System.in);

        int a=Leer.nextInt();
 for(int i=0 ; i<a ; i++){
     even=0;
     odd=0;
     int b=Leer.nextInt();
     for(int j=0 ; j<b ; j++){
         int z=Leer.nextInt();
         if(z%2==0)
             even++;
             else
             odd++;
         
         
     }
 System.out.println(even+" even and "+odd+" odd.");
 }

}
}