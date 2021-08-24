import java.util.Scanner;


public class Main {

 
    public static void main(String[] args) {
      Scanner Leer =new Scanner(System.in); 
int c=Leer.nextInt();

for(int i=0; i<c ; i++){
           
      int a=Leer.nextInt();
int b=Leer.nextInt();

if((a==b)&&(a%2==0))
    System.out.println("L");
if((a==b)&&(a%2!=0))
    System.out.println("R");

if((a!=b)&&(a>b)&&(b%2==0))
    System.out.println("U");

if((a!=b)&&(a>b)&&(b%2!=0))
    System.out.println("D");

if((a!=b)&&(a<b)&&(a%2==0))
     System.out.println("L");
if((a!=b)&&(a<b)&&(a%2!=0))
     System.out.println("R");


}
   
    

    }
}