import java.util.Scanner;
// import the scanner
public class SpellingBeeSimulator
{
    public static void main(String[] args)
    {

    Scanner scan=new Scanner(System.in);
// ask the user to type a word
    System.out.println("Type a word");
    String user=scan.nextLine();

    int length=user.length();
//print out every letter of the word user typed in except the last letter
    for(int num=0;num<length-1;num++)
    {
         System.out.print(user.substring(num,num+1)+"-");
    }
    //print out the last letter
    System.out.print(user.substring(length-1));
    scan.close();
    // close the scanner
    }
}