public class AverageDiceRoll
{

 public static void main(String[] args)
    {
        int average=0;
        OneThousandDiceRolls dice=new OneThousandDiceRolls();
     int[] array=dice.getDiceRolls();
        for(int x:array)
        {
            average+=x;
        }
        average=average/array.length();
        System.out.println(average);

    }
}