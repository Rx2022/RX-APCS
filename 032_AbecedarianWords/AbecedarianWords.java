import java.util.Scanner;
//import the scanner
public class AbecedarianWords
{
    public static void main(String[] args)
    {
     Scanner scan=new Scanner(System.in);
     //ask the user to type a word
     System.out.println("Type a word");
     String cat=scan.nextLine();
     int length=cat.length();
     //if in the word, any letter is bigger than the one behind it, the word is not a abecedarian word
     for(int i=0;i<=length;i++)
     {
      if(cat.substring(i,i+1).compareTo(cat.substring(i+1,i+2))>0)
      {
       System.out.println("Your word is not a abecedarian word");
       //print out the result
       i+=length;
      }
      //if the any letter is not bigger than the one behind it, it's a abecedarian word 
      else
      {
          System.out.println(cat.substring(i,i+1));
          System.out.println("Your word is a abecedarian word.");
     //print out the result
      }

     }
     scan.close();
     //close the scanner
    }
}