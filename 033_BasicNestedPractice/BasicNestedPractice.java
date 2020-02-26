//import the scanner
import java.util.Scanner;
public class BasicNestedPractice
{
    public static void main(String[] args)
    {
     Scanner scan=new Scanner(System.in);
     //ask the user to type a word
     System.out.println("Type a word");
     String word=scan.nextLine();
     int command=word.length();
    //if the length of the word is more than 1, then it does not work
    if(command>1)
    {
 System.out.println("this does not work.");
//print out the result
    }
    else
    {
        //if the length of the word is more than 1 but less or equal to 20, it keeps adding one and printing
        while(command<=20)
        {
            command++;
            System.out.println(word);
        }
        //blah is 1, it keeps adding one and printing next to each other until it's more than 20
        for(int blah=1;blah<=20;blah++)
        {
            System.out.print(word);
        }
    }
    scan.close();
    //close the scanner
    }
}  