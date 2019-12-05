import java.util.Scanner;
public class CarBuildOne
{
    public static void main(String[] args)
    {
      Scanner scan=new Scanner(System.in);
      System.out.println("Enter the manufacturer you want");
      String maker=scan.nextLine();
      System.out.println("Enter the model you want");
      String model=scan.nextLine();
      System.out.println("Enter the year you want");
      int yearMade=scan.nextInt();
      System.out.println("Enter the mileage you want");
      int mileage=scan.nextInt();
      Car loki=new Car(yearMade,mileage,maker,model);
      System.out.println("We find you a car");
      System.out.println("This car is made in "+loki.year+", it has driven "+loki.milesDriven+" miles,the manufacturer is "+loki.manufacturerName+", and the model is "+loki.modelName+".");
      scan.close();
    }
}