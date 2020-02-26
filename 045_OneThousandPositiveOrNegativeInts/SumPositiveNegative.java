public class SumPositiveNegative
{

 public static void main(String[] args)
    {
        int sum=0;
        OneThousandPositiveOrNegativeInts i=new OneThousandPositiveOrNegativeInts();
        int[] array=i.getOneThousandPositiveOrNegativeInts();
        for(int x:array)
    {
        sum+=x;
    }
    System.out.println("The sum is "+sum);

    }
}