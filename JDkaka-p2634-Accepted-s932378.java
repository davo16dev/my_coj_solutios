import java.util.Scanner;

/**
 *
 * @author Charlie-PC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner Leer=new Scanner(System.in);
        
        int e=0 , f=0 , m=0 ,a=0 , my=0 , ju=0 , jl=0 ,ag=0 ,sep=0 , oc=0 , no=0 , dc=0 ;
        
        
        int x=Leer.nextInt();
        
        for (int i = 0; i < x; i++) {
          
          String num=Leer.next();
          String aaa=Leer.next();
          
          
          String arrey[]=aaa.split("/");
          
           
                        
          
          if(arrey[1].equals("1"))
            e++;
          if(arrey[1].equals("2"))
            f++;
          if(arrey[1].equals("3"))
            m++;
          if(arrey[1].equals("4"))
            a++;
          if(arrey[1].equals("5"))
            my++;
          if(arrey[1].equals("6"))
            ju++;
          if(arrey[1].equals("7"))
            jl++;
          if(arrey[1].equals("8"))
            ag++;
          if(arrey[1].equals("9"))
            sep++;
          if(arrey[1].equals("10"))
            oc++;
          if(arrey[1].equals("11"))
            no++;
          if(arrey[1].equals("12"))
            dc++;

            
        }
            
            System.out.println(1+" "+e);
            System.out.println(2+" "+f);
            System.out.println(3+" "+m);
            System.out.println(4+" "+a);
            System.out.println(5+" "+my);
            System.out.println(6+" "+ju);
            System.out.println(7+" "+jl);
            System.out.println(8+" "+ag);
            System.out.println(9+" "+sep);
            System.out.println(10+" "+oc);
            System.out.println(11+" "+no);
            System.out.println(12+" "+dc);
    }
    }
    

