import java.util.Scanner;

public class SpellingBeeSimulator
{
    public static void main(String[] args)
    {

    Scanner scan=new Scanner(System.in);

    System.out.println("Type a word");
    String user=scan.nextLine();

    int length=user.length();

    for(int num=0;num<length-1;num++)
    {
         System.out.print(user.substring(num,num+1)+"-");
    }
    System.out.print(user.substring(length-1));
    scan.close();
    }
}