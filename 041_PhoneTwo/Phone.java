public class Phone
{
    //insert variables
    int y;
    String c;
    String t;
    String m;
    String n;
    int random=(int)((Math.random()*2)+1);
    int random1=(int)((Math.random()*2)+1);
    int random2=(int)((Math.random()*2)+1);
    //create basic constructor
    public Phone()
    {
        c="pink";
        m="HuaWei";
        n="Flower";
     y=2020;
     t="smartphone";
    }
    //create consturctor that needs color
    public Phone( String color)
    {
        m="HuaWei";
        n="Leaf";
    y=2020;
    c=color;
    t="smartphone";
    }
    //create constructor that needs color and manufacturer
    public Phone(String color, String manufacturer)
    {
        n="Tree";
        y=2020;
        c=color;
        t="smartphone";
        m=manufacturer;
    }
    public static void main(String[] args)
    {
        


    }
    //method to return the basic information of the Phone
    
    public String toString()
    {
       return(n+" is produced in "+y+", and the type is "+t+", and the color is "+c+", and the manufactuer is "+m);
    }
    //method to test if phone will vibrate
    public void vibration()
    {
    if(random==1)
    {
        System.out.println("This phone vibrates");
    }
    else
    {
        System.out.println("This phone does not vibrate");
    }
    }
    //method to test if phone will receive message
    public void message()
    {
     if(random1==1)
     {
         System.out.println("There is a message");
     }
     else
     {
        System.out.println("There is no message");
     }
     
     
    }
    public void message1()
    {
     if(random2==1)
     {
         System.out.println("There is a message");
     }
     else
     {
        System.out.println("There is no message");
     }
    }
}