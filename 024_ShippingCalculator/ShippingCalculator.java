import java.util.Scanner;
public class ShippingCalculator
{
    public static void main(String[] args)
    {
      Scanner scan=new Scanner(System.in);
      System.out.println("Please enter the weight of your package.");
      int w=scan.nextInt();
      double one=3.5;
      double two=5.5;
      double three=8.5;
      double four=10.5;
      if(0<w&&w<=1)
      {
        System.out.println(w*one);
      }
      else if(1<w&&w<=3)
      {
          System.out.println(w*two);
      }
      else if(3<w&&w<=10)
      {
          System.out.println(w*three);
      }
      else if(10<w&&w<=20)
      {
          System.out.println(w*four);
      }
      else if(w<0)
      {
          System.out.println("Invalid input");
      }
      else
      {
          System.out.println("This package cannot be shipped");
      }
      scan.close();
    }
}