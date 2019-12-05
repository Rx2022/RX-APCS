public class PowerAttack
{
    public static void main(String[] args)
    {
      int strength=3;
      int random=(int)(Math.random()*10)+1;
      while(random<=10)
     {
         System.out.println("You swing now is "+random);
         random+=strength;
     }
     System.out.println("You swing now is "+random);
     System.out.println("Yuo defeat the monster!");
    }
}