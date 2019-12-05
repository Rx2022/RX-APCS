public class TabletopDice
{
    public static void main(String[] args)
    {

    int d4=(int)((Math.random()*4)+1);
    System.out.println(d4);
    int d6=(int)((Math.random()*6)+1);
    System.out.println(d6);
    int d8=(int)((Math.random()*8)+1);
    System.out.println(d8);
    int d10=(int)((Math.random()*10)+1);
    System.out.println(d10);
    int percentile=d10*10;
    System.out.println(percentile);
    int d12=(int)((Math.random()*12)+1);
    System.out.println(d12);
    int d20=(int)((Math.random()*20)+1);
    System.out.println(d20);


    }
}