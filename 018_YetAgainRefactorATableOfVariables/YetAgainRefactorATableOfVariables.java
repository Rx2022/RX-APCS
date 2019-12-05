import java.util.Scanner;
public class YetAgainRefactorATableOfVariables
{
    public static void main(String[] args)
    {
    double n1=1;
    double n2=2;
    double n3=3;
    double n4=4;
    double row2Coloum2=Math.pow(n1,n2);
    double row2Coloum3=Math.pow(n1,n3);
    double row3Coloum2=Math.pow(n2,n2);
    double row3Coloum3=Math.pow(n2,n3);
    double row4Coloum2=Math.pow(n3,n2);
    double row4Coloum3=Math.pow(n3,n3);
    double row5Coloum2=Math.pow(n4,n2);
    double row5Coloum3=Math.pow(n4,n3);
    System.out.println("a  a^2  a^3");
    System.out.println(n1+"  "+row2Coloum2+"    "+row2Coloum3);
    System.out.println(n2+"  "+row3Coloum2+"    "+row3Coloum3);
    System.out.println(n3+"  "+row4Coloum2+"    "+row4Coloum3);
    System.out.println(n4+"  "+row5Coloum2+"   "+row5Coloum3);
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the number you want.");
    double number=scan.nextDouble();
    System.out.println(Math.pow(number,n2));
    System.out.println(Math.pow(number,n3));
    scan.close();
    }
}
