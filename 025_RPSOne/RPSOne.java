import java.util.Scanner;
public class RPSOne
{
    public static void main(String[] args)
    {
         Scanner scan=new Scanner(System.in);
            System.out.println("Rock, paper, or scissor?");
            String user=scan.nextLine();
            int num=(int)((Math.random()*3)+1);
            String computer;
            if(num==1)
            {
                computer="rock";
                System.out.println("Computer choose rock");
            }
            else if(num==2)
            {
                computer="paper";
                System.out.println("Computer choose paper");
            }
            else 
            {
                computer="scissor";
                System.out.println("Computer choose scissor");
            }
             if(user.equals("paper")&&computer.equals("rock"))
             {
                 System.out.println("You won.");
             }
             else if(user.equals("rock")&&computer.equals("scissor"))
             {
                System.out.println("You won.");
             }
             else if(user.equals("scissor")&&computer.equals("paper"))
             {
                System.out.println("You won.");
             }
             else if (user.equals(computer))
             {
                 System.out.println("It's a tie");
             }
             else
             {
                 System.out.println("You lose.");
             }
             scan.close();
    }
}