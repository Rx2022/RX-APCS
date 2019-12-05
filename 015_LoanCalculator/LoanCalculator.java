import java.util.Scanner;
public class LoanCalculator
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the principal balance");
        double ba=scan.nextDouble();
        System.out.println("Enter your annual interest rate");
        double interest=scan.nextDouble();
        System.out.println("Enter your remaining months");
        double month=scan.nextDouble();
        double monthlyInterest=ba*(interest/month);
        double monthlyPayment=ba/month+interest;
        System.out.println("Your monthlyinterest is "+monthlyInterest+".");
        System.out.println("Your monthlypayment is "+monthlyPayment+".");
        scan.close();
    }
}