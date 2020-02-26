import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;
public class Table
{
    //insert variables
    int totalPlayer=0;
    int totalDealer=0;
    String result;
    String choice;
    CardDispenser machine;
    Scanner scan=new Scanner(System.in);
    //create constructor
    public Table(int Player, int Dealer, String r, String c )
    {
        totalPlayer=Player;
        totalDealer=Dealer;
        result=r;
        choice=c;
    }
    public static void main(String[] args)
    {
        int Player=0;
        int Dealer=0;
        String r="";
        String c="";
        Table t=new Table(Player,Dealer,r,c);
        t.machine = new CardDispenser();
        //give user two card nd tell the total value
        System.out.println("You have two cards");
        t.totalPlayer=t.machine.getGiver()+t.machine.getGiver();
        System.out.println("Your total value is "+t.totalPlayer);
        t.totalDealer=t.machine.getGiver();
        System.out.println("The dealer has a card that value is "+t.totalDealer);
        //aks the user to hit or stay
        System.out.println("Will you hit or stay? ");
        t.choice=t.scan.nextLine();

        while(t.totalPlayer<=21)
        {
        if(t.choice.equals("hit"))
        {
        t.hit();
        if(t.result.equals("bust"))
        {
            break;
        }
    }
        else
       {
        t.stay();
        break;
    
        }
    }
//if the result does not equal to bust, compare dealer with player
        if(t.result.equals(""))
        {

        
        if(t.totalDealer<t.totalPlayer)
        {
            
            System.out.println("Congratulations, you win!");
        }
        else
        {
           
            System.out.println("Sorry, you lose");
       }
    }
        t.scan.close();
    }

   //create the method when user chooses to hit
    public void hit()
    {
    totalPlayer+=machine.getGiver();
    System.out.println("Your total value now is "+totalPlayer+".");

    if(totalPlayer>21)
    {
        System.out.println("You bust");
        result="bust";
        
       
    }
    else{

    System.out.println("Will you hit or stay");
    choice=scan.nextLine();
    }
}
//create the method when user chooses to stay
   public void stay() 
   {
    System.out.println("Ok, the dealer gets another card");
    while(totalDealer<=16)
    {
    totalDealer+=machine.getGiver();
    }
    System.out.println("The dealer gets "+totalDealer);
    if(totalDealer>21)
    {
        System.out.println("The dealer bust, you win");
        result="bust";
    }
    choice="stay";
   }

 }
