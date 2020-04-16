//import scanner and arraylist
import java.util.Scanner;
import java.util.ArrayList;
public class AverageOfDice
{
    //create an array list
ArrayList <Integer> bingo = new ArrayList<Integer>();
int num=0;
int average=0;


 public static void main(String[] args)
    {
        //create object of this class
      AverageOfDice foo=new AverageOfDice();
      //create a scanner
      Scanner scan=new Scanner(System.in);
      String choice;
      System.out.println("Do you want to roll the dice");
      scan.nextLine();
      choice=scan.nextLine();
      //create a string to compares with choice
      String yes="yes";
      

      
    

    //if choice equlas to yes
       while(choice.equalsIgnoreCase(yes));
      {
        //call the mathod
        foo.addNumber();
          foo.boo();
        //ask the user if they want to roll again
          System.out.println("Do you want to roll again?");
          //reset choice
          scan.nextLine();
          choice=scan.nextLine();
      }
      //close the scan
      scan.close();


    }
    

//method to return a random number from 1-100
public int dice()
{
return (int)(Math.random()*100)+1;
}


//method to put values in an array list
   public void addNumber()
  {
    bingo.add(dice());
  }
  //calculate the average
      public void boo()
     {
       
          for(int x:bingo)
          {
            num+=x;
          }
           average=num/bingo.size();
           System.out.println("The average is "+ average);



      }

}