import java.util.Scanner;
public class SimpleCounter
{
    public static void main(String[] args)
    {
     int number=1;
     Scanner scan=new Scanner(System.in);
     System.out.println("Type a number.");
     int user=scan.nextInt();
     while(number<=user)
     {
         System.out.println(number);
         number++;
     }
    
    }
}