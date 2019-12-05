import java.util.Scanner;

public class FizzBuzzWhileLoop
{
    public static void main(String[] args)
    {
      Scanner scan=new Scanner(System.in);
      System.out.println("Type a number");
      int bee=scan.nextInt();
      int i=1;
      while(i<=bee)
      {
          if(i%3==0&&i%5==0)
          {
              System.out.println("Fizzbuzz");
          }
        else if(i%3==0)
          {
           System.out.println("Fizz");
          }
          else if(i%5==0)
          {
              System.out.println("Buzz");
          }
              else
              {
                  System.out.println(i);
              }
              i++;
          scan.close();
      }
    }
}