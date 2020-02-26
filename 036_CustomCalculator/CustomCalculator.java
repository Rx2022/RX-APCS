import java.util.Scanner;
public class CustomCalculator
 {  
     //insert variables
     double sad;
     double happy;
     //make constructor
     public CustomCalculator(double num, double ber)
     {
      sad=num;
      happy=ber;
     }
    public static void main(String[] args)
    {
        //ask the user to type two numbers
Scanner scan=new Scanner(System.in);
System.out.println("Type your first number");
double num=scan.nextDouble();
System.out.println("Type your second number");
double ber=scan.nextDouble();
CustomCalculator wow=new CustomCalculator(num,ber);
//call the method
wow.add();
wow.subtract();
wow.mutiply();
wow.divide();
wow.piFang();
wow.module();
wow.volumeOfCuboid();
wow.volumeOfCone();
}
//build the methods
    public void add()
    {
    System.out.println(sad+happy);
    }
    public void subtract()
    {
        System.out.println(sad-happy);
    }
    public void mutiply()
    {
        System.out.println(sad*happy);
    }
    public void divide()
    {
        System.out.println(sad/happy);
    }
    public void module()
    {
        System.out.println(sad%happy);
    }
    public void piFang()
    {
        System.out.println(Math.pow(sad,happy));
    }
    public void volumeOfCuboid()
    {
        System.out.println(sad*sad*happy);
    }
    public void volumeOfCone()
    {
        System.out.println((3.14*sad*sad*happy)/3);
    }
}