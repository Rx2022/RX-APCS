import java.util.Scanner;
public class BlackJackOne
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n1=(int)(Math.random()*10)+1;
        int n2=(int)(Math.random()*10)+1;
        int n3=(int)(Math.random()*10)+1;
        int n4=(int)(Math.random()*10)+1;
        int n5=(int)(Math.random()*10)+1;
        int n6=n1+n2+n3;
        int n7=n4+n5;
        int n8=n1+n2;
        System.out.println("You have "+n1+" and "+n2+".");
        System.out.println("Your total value is "+n8);
        System.out.println("Will you hit or stay? ");
        String choice=scan.nextLine();
        if(choice.equals("hit"))
        {
            System.out.println("You get "+n3);
            System.out.println("Your total value now is "+n6+".");
            if(n6>21)
            {
                System.out.println("You bust.");
            }
            else
            {
                System.out.println("Ok, the dealer get two cards");
                if(n7<=n6)
                {
                    System.out.println("The dealer get "+n7+".");
                    System.out.println("Congratulations, you win!");
                }
                else
                {
                    System.out.println("The dealer get  "+n7+".");
                    System.out.println("Sorry, you lose");
                }

            }
        }
       else
       {
        System.out.println("You get "+n8+".");
        System.out.println("Ok, the dealer get two cards");
        if(n7<=n8)
        {
            System.out.println("The dealer get "+n7+".");
            System.out.println("Congratulations, you win!");
        }
        else
        {
            System.out.println("The dealer get "+n7+".");
            System.out.println("Sorry, you lose");
       }
        scan.close();;
    }
 }
}