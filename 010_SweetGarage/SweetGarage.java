import javax.smartcardio.Card;

public class SweetGarage
{
    public static void main(String[] args)
    {
    Car car1=new Car(2006,15_000,"Paula","Fierce");
    System.out.println("Car1 is produced in "+car1.year+", it has ran for "+car1.milesDriven+", the manufacturer who made it is "+car1.manufacturerName+", and the model name of it is "+car1.modelName+".");
    Car car2=new Car(2017,4_000,"Wechat","Crusade", true);
    System.out.println("Car1 is produced in "+car2.year+", it has ran for "+car2.milesDriven+", the manufacturer who made it is "+car2.manufacturerName+", and the model name of it is "+car2.modelName+".");
    Car car3=new Car(2005,26_000,"Banquo","Fleance");
    System.out.println("Car1 is produced in "+car3.year+", it has ran for "+car3.milesDriven+", the manufacturer who made it is "+car3.manufacturerName+", and the model name of it is "+car3.modelName+".");
    Car car4=new Car(1996,30_000,"Navy","Submarine");
    System.out.println("Car1 is produced in "+car4.year+", it has ran for "+car4.milesDriven+", the manufacturer who made it is "+car4.manufacturerName+", and the model name of it is "+car4.modelName+".");
    Car car5=new Car(2018,2_000,"Rocket","Mars");
    System.out.println("Car1 is produced in "+car5.year+", it has ran for "+car5.milesDriven+", the manufacturer who made it is "+car5.manufacturerName+", and the model name of it is "+car5.modelName+".");
   car1.revEngine();
   car1.engageTurbo();
   car2.revEngine();
   car2.engageTurbo();
   car3.revEngine();
   car3.engageTurbo();
   car4.revEngine();
   car4.engageTurbo();
   car5.revEngine();
   car5.engageTurbo();

    }
}