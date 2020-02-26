public class UsingThePhoneTwo
{

 public static void main(String[] args)
    {
        //create three phones
Phone p1=new Phone();
Phone p2=new Phone("yellow");
Phone p3=new Phone("green","Apple");
//call toString and test if phones work
p1.toString();
p1.message();
p2.toString();
p2.message1();
p3.toString();
p3.vibration();
//print out the basic informations
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);




    }
}