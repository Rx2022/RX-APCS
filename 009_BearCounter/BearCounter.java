public class BearCounter
{
    public static void main(String[] args)
    {
    int bears=1;
    //Those bears are coming around the beehives again, Seems like there are 3 on their way.
    System.out.println("Oh, I see"+" "+bears+" "+"bear.");
    bears++;
    System.out.println("Ok, there are"+" "+bears+" "+"bears standing under the tree.");
    bears++;
    System.out.println("No wait, there are"+" "+bears+" "+"of them.");
    bears--;
    System.out.println("1 bear leaves. There are still "+" "+bears+" "+"bears.");
    bears--;
    System.out.println("Few minutes later, another bear leaves, there is only"+" "+bears+" "+"bear now.");
    bears--;
    System.out.println("At last, there is"+" "+bears+" "+"bear.");
    }
}