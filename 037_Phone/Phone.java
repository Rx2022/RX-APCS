
public class Phone
{
    //insert variables
    int y;
    String c;
    String t;
    String m;
    int random=(int)((Math.random()*2)+1);
    //create constructor
    public Phone(int year, String color, String type, String manufacturer)
    {
    y=year;
    c=color;
    t=type;
    m=manufacturer;
    }
    public static void main(String[] args)
    {
        


    }
    //method to test if phone will vibrate
    public void vibration()
    {
    if(random==1)
    {
        System.out.println("Your phone vibrates");
    }
    else
    {
        System.out.println("Your phone does not vibrate");
    }
    }
    //method to test if phone will receive message
    public void message()
    {
     if(random==1)
     {
         System.out.println("There is a message");
     }
     else
     {
        System.out.println("There is no message");
     }
    }
}