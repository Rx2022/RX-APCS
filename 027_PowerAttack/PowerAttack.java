public class PowerAttack
{
    public static void main(String[] args)
    {
      int strength=3;
      int random=(int)(Math.random()*10)+1;
      //the strength we have is three
      //the other strength is a random number between 1 to 10
      while(random<=10)
     {
         System.out.println("You swing now is "+random);
         random+=strength;
     }
     //the total strength is random strength plus original strength
     //if the total strength is less or equal to 10, it will keel adding random strength
     System.out.println("You swing now is "+random);
     System.out.println("Yuo defeat the monster!");
     //after the total strength is more than 10, the monster is defeated
    }
}