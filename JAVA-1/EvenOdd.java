import java.util.Scanner;
public class EvenOdd {
//      static public void main(String[] args){}
     public static void main(String...args){
          Scanner s=new Scanner(System.in);
          int number =s.nextInt();
          =(number%2==0)?System.out.println("Even"):System.out.println("Odd");
          System.out.println("");
     }
     
}
