import java.util.Scanner;
public class AbecedarianWords
{
    public static void main(String[] args)
    {
     Scanner scan=new Scanner(System.in);
     System.out.println("Type a word");
     String cat=scan.nextLine();
     int length=cat.length();
     for(int i=0;i<=length;i++)
     {
      if(cat.substring(i,i+1).compareTo(cat.substring(i+1,i+2))>0)
      {
       System.out.println("Your word is not a abecedarian word");
       i+=length;
      }
      else
      {
          System.out.println(cat.substring(i,i+1));
          System.out.println("Your word is a abecedarian word.");
      }

     }
     scan.close();
    }
}