import java.util.Scanner;
//import the scabber
public class FizzBuzzForLoop
{
    public static void main(String[] args)
    {
      Scanner scan=new Scanner(System.in);
      //ask user to type a number
      System.out.println("Type a number");
      int bee=scan.nextInt();
      //if the i is less or equal to the number user typed, it keeps adding one 
      for(int i=1;i<=bee;i++)
      {
        //if i can be divided completely by 3 and 5, it prints out Fizzbuzz
        if(i%3==0&&i%5==0)
        {
            System.out.println("Fizzbuzz");
        }
        //if i can only be divided by 3, it prints Fizz
      else if(i%3==0)
        {
         System.out.println("Fizz");
        }
        //if i can only be divided by 5, it prints Buzz
        else if(i%5==0)
        {
            System.out.println("Buzz");
        }
        //if i can not be divided by 3 or 5, it prints i.
            else
            {
                System.out.println(i);
            }

      }
      scan.close();
      //close the scan
    }
}