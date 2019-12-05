public class ComputeAnExpressionTwo
{
    public static void main(String[] args)
    {
    ReturningCalculator calc=new ReturningCalculator();
    //double equation1=9.5*4.5;
    double equation1=calc.doubleMultiplier(9.5,4.5);
    double equation2=calc.doubleMultiplier(2.5,3);
    double equation3=calc.doubleSubtractor(45.5,3.5);
    double equation4=calc.doubleSubtractor(equation1,equation2);
    double equation5=calc.divider(equation4,equation3);
    
    //double equation2=2.5*3;
    //double equation3=45.5-3.5;
    //double equation4=equation1-equation2;
    //double equation5=equation4/equation3;
    System.out.println(equation5);
    }
}