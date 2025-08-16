//import java.util.*;     //* means look through all the files in util directory to see if what you need is there
import java.util.Scanner;//look for Scanner specifically (this is the preffered method)

public class Addition{
  public static void main(String args[]){
    Scanner input = new Scanner(System.in); //new means what follows is a constructor

    System.out.print("Enter da foist num ");
    int num1 = input.nextInt();
    System.out.print("Enter da next num ");
    int num2 = input.nextInt();

    System.out.printf("The result of %d + %d = %d%n", num1, num2, num1 + num2);

    if(num1 == num2){
      System.out.printf("%d == %d%n", num1, num2);
    }

    if(num1 != num2){
      System.out.printf("%d != %d%n", num1, num2);
    }

    if(num1 < num2){
      System.out.printf("%d < %d%n", num1, num2);
    }

    if(num1 >= num2){
      System.out.printf("%d >= %d%n", num1, num2);
    }
  }
}
