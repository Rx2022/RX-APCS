//import the scanner
import java.util.Scanner;

public class FizzBuzzWhileLoop
{
    public static void main(String[] args)
    {
      Scanner scan=new Scanner(System.in);
      //ask the user to type in a number
      System.out.println("Type a number");
      int bee=scan.nextInt();
      int i=1;
      //if i is less or equal to bee, it keeps adding one
      while(i<=bee)
      {
          //if i can be divided both by 3 and 5, print Fizzbuzz
          if(i%3==0&&i%5==0)
          {
              System.out.println("Fizzbuzz");
          }
          //if i can only be divided by 3, print Fizz
        else if(i%3==0)
          {
           System.out.println("Fizz");
          }
          //if i can only be divided by 5, print Buzz
          else if(i%5==0)
          {
              System.out.println("Buzz");
          }
          //if i can not be divided by 3 or 5, print i
              else
              {
                  System.out.println(i);
              }
              i++;
          scan.close();
          //close the scanner
      }
    }
}