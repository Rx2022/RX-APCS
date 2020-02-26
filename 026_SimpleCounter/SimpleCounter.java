import java.util.Scanner;
// import the scanner
public class SimpleCounter
{
    public static void main(String[] args)
    {
     int number=1;
     //varaible will be 1
     Scanner scan=new Scanner(System.in);
     //ask user to type a number
     System.out.println("Type a number.");
     int user=scan.nextInt();
     //if the variable is less or equal than the number user typed in, the number will keep adding one and printing
     while(number<=user)
     {
         System.out.println(number);
         number++;
     }
     scan.close();
     //close the scanner
    
    }
}