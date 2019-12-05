public class PopulationProjection
{
    public static void main(String[] args)
    {
        int birth=7;
        int death=13;
        int immigrant=45;
        int days1=365;
        int populationNow=312032486;
        int secondsday=3600;
        int seconds1=days1*secondsday;
        int birth1=seconds1/7;
        int death1=seconds1/death;
        int immigrant1=seconds1/immigrant;
        int increase=death1+birth1+immigrant1;
        int y1=populationNow+increase;
        int y2=y1+increase;
        int y3=y2+increase;
        int y4=y3+increase;
        int y5=y4+increase;
        System.out.println("The first year popuation will be"+" "+y1+".");
        System.out.println("The second year population will be"+" "+y2+".");
        System.out.println("The third year population will be"+" "+y3+".");
        System.out.println("The fourth year population will be"+" "+y4+".");
        System.out.println("The fifth year population will be"+" "+y5+".");
    }
}
