import java.util.Scanner;
public class COJComputmat {

    
    public static void main(String[] args) {
        Scanner Leer=new Scanner(System.in);
    double a=Leer.nextInt();
    double b=Leer.nextInt();
    double c=Leer.nextInt();
    
    double PerA=a+a+a;
    double PerB=b+b+b;
    double PerC=c+c+c;
    double PerD=a+b+c;
    
    double SPA=PerA/2;
    double SPB=PerB/2;
    double SPC=PerC/2;
    double SPD=PerD/2;
    
    double AtA=Math.sqrt(SPA*(SPA-a)*(SPA-a)*(SPA-a));
   double AtB=Math.sqrt(SPB*(SPB-b)*(SPB-b)*(SPB-b));
   double AtC=Math.sqrt(SPC*(SPC-c)*(SPC-c)*(SPC-c));
   double AtD=Math.sqrt(SPD*(SPD-a)*(SPD-b)*(SPD-c));
      
      
    
    
    double cirA=Math.pow((AtA/SPA),2)*3.14159265359;
        double cirB=Math.pow((AtB/SPB),2)*3.14159265359;
            double cirC=Math.pow((AtC/SPC),2)*3.14159265359;
                double cirD=Math.pow((AtD/SPD),2)*3.14159265359;
        
        System.out.printf("%.3f\n",cirA+cirB+cirC+cirD);
        
    }
    
}