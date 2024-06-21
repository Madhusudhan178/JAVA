import java.util.Scanner;

class prgm2 {
  public static void main(String[] args) {
     //create 2 char variables
    char char1, char2;
    //read characters
    Scanner s = new Scanner(System.in);
    char1 = s.next().charAt(0);
    char2 = s.next().charAt(0);
    //
    if (char1 < char2) {
      System.out.println(char1+ " is smallest char");
    } else {
      System.out.println(char2+"is greater");
    }

  }
}