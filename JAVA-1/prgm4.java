import java.util.Scanner;
public class  prgm4 {

     public static void main(String[] args) {
          int n1,n2,n3,n4;
          Scanner s=new Scanner(System.in);
          n1=s.nextInt();
          n2=s.nextInt();
          n3=s.nextInt();
          n4=s.nextInt();
          if(n1>n2 && n1>n3 && n1>n4)
               {
                    System.out.println(n1+"is the great");
               }
          else if ( n2>n3 && n2>n4) 
               {
                    System.out.println(n2+"is the great"); 
               }
          else if(n3>n4)
               {
                    System.out.println(n3+"is the great"); 
               } 
               else{
                    System.out.println(n4+ "is great");
               } 
          }
               
              

     }
