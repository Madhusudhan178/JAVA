import java.util.Scanner;
public class prgm3 {

     public static void main(String[] args) {
          int n1,n2,n3;
          Scanner s=new Scanner(System.in);
          n1=s.nextInt();
          n2=s.nextInt();
          n3=s.nextInt();
          if((n1<0 || n2<0 || n3<0) )
          {
               System.out.println("Age is invalid");
          }
          else if(n1<n2 && n1<n3)
               {
                    System.out.println(n1+"is the smalles");
               }
          else if (n2<n1 && n2<n3) 
               {
                    System.out.println(n2+"is the smallest"); 
               }
          else  
               {
                    System.out.println(n3+"is the smallest"); 
               }  
               
              

     }
}