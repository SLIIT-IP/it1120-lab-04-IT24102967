import java.util.Scanner;

public class IT24102967Lab4Q3{
       public static void main(String[] args)
{
       Scanner sc = new Scanner(System.in);
      
       System.out.print("Enter a number: ");
       double number = sc.nextDouble();

       if (number > 0) {
          System.out.println("The number is: positive.");
       } else if (number < 0) {
           System.out.println("The number is: negative.");
       } else {
           System.out.println("The number is:  zero.");
       }

      }
}