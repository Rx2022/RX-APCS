import java.util.Scanner;
public class IsItLegalForYou
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Type your age");
        int age=scan.nextInt();
        String drive="You can get a driver's license.";
        String cigarettes="You can buy cigarettes.";
        String casino="You can go to the casino.";
        String alcohol="You can buy alcohol.";
        String rent="You can rent a car";
        if(age>14&&age<18)
        {
            System.out.println(drive);
        }
        else if(17<age&&age<21)
        {
             System.out.println(drive);
             System.out.println(cigarettes);
             System.out.println(casino);
        }
        else if(age>=21)
        {
            System.out.println(drive);
            System.out.println(cigarettes);
            System.out.println(casino);
            System.out.println(alcohol);
            System.out.println(rent);

        }
        else
        {
             System.out.println("Sorry, you can't do anything really.");
        }
            
       scan.close();
            
        
    }
}