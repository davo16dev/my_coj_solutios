import java.util.Scanner;

public class AAAAA {

    public static void main(String[] args) {

        Scanner Leer = new Scanner(System.in);

       String Pal=Leer.nextLine();
       
       int A=0;
       int Otro=0;
       for (int i = 0; i < Pal.length(); i++) {
            
            char lt=Pal.charAt(i);
            
            if((lt=='A')||(lt=='E')||(lt=='I')||(lt=='O')||(lt=='U'))
                A++;
            else
                Otro++;
            
            
        }
    System.out.println(A+" "+Otro);
    
    }

}