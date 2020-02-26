//insert the scanner
import java.util.Scanner;
public class DateTranslator
{
    //insert variables
    int year;
    int month;
    int day;
    String format;
    //make a constructor
    public DateTranslator(int intYear, int intMonth, int intDay, String stringFormat)
    {
      year=intYear;
      month=intMonth;
      day=intDay;
      format=stringFormat;

    }
    public static void main(String[] args)
    {
        //ask the user to type in the date
        Scanner scan=new Scanner(System.in);
        System.out.println("Type your year");
        int intYear=scan.nextInt();
        System.out.println("Type your month");
        int intMonth=scan.nextInt();
        System.out.println("Type your day");
        int intDay=scan.nextInt();
        scan.nextLine();
        System.out.println("American or European date format?");
        String stringFormat=scan.nextLine();

        DateTranslator pony=new DateTranslator(intYear,intMonth,intDay,stringFormat);
        
        //call the method
        if((pony.format).equals("American"))
        {
            pony.printAmerican();
        }
        else if((pony.format).equals("European"))
        {
            System.out.println(intDay+"/"+intMonth+"/"+intYear);
        }
        else
        {
            pony.printEuropean();
        }
        
    }
    //build the method
        public void printAmerican()
        {
            System.out.println(month+"/"+day+"/"+year);
       }
        public void printEuropean()
        {
            System.out.println(day+"/"+month+"/"+year);
        }
}