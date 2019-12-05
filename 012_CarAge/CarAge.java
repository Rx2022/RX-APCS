import javax.smartcardio.Card;

public class CarAge
{
    public static void main(String[] args)
    {
    ReturningCalculator calc=new ReturningCalculator();
    int currentYear=2019;
    Car car1=new Car(2006,15_000,"Paula","Fierce");
    System.out.println(calc.integerSubtractor(currentYear,car1.year));
    Car car2=new Car(2017,4_000,"Wechat","Crusade");
    System.out.println(calc.integerSubtractor(currentYear,car2.year));
    Car car3=new Car(2005,26_000,"Banquo","Fleance");
    System.out.println(calc.integerSubtractor(currentYear,car3.year));
    Car car4=new Car(1996,30_000,"Navy","Submarine");
    System.out.println(calc.integerSubtractor(currentYear,car4.year));
    Car car5=new Car(2018,2_000,"Rocket","Mars");
    System.out.println(calc.integerSubtractor(currentYear,car5.year));
    }
}
