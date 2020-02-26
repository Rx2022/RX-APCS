import java.util.Scanner;
public class UsingThePhone
{
    public static void main(String[] args)
    {
      //ask user about information of the phone
      Scanner scan=new Scanner(System.in);
      System.out.println("When does your phone produce");
      int year=scan.nextInt();
      scan.nextLine();
      System.out.println("What's the color of your phone");
      String color=scan.nextLine();
      System.out.println("What's the type of your phone");
      String type=scan.nextLine();
      System.out.println("What's the manufacturer of your phone");
      String manufacturer=scan.nextLine();
      //create the obejct using
      Phone i=new Phone(year,color,type,manufacturer);
      //print out the values
      System.out.println("Your phone produces in "+i.y);
      System.out.println("Your phone is "+i.c);
      System.out.println("Your phone is "+i.t);
      System.out.println("The manufacturer of your phone is "+i.m);
      //test if phone will vibrate
      i.vibration();
      // test if phone will receive message
      i.message();
      scan.close();
  
    }
}