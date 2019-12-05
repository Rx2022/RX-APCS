public class RefactorATableOfVariables
{
    public static void main(String[] args)
    {
    int n1=1;
    int n2=2;
    int n3=3;
    int n4=4;
    int row2Coloum2=n1*n1;
    int row2Coloum3=n1*n1*n1;
    int row3Coloum2=n2*n2;
    int row3Coloum3=n2*n2*n2;
    int row4Coloum2=n3*n3;
    int row4Coloum3=n3*n3*n3;
    int row5Coloum2=n4*n4;
    int row5Coloum3=n4*n4*n4;
    System.out.println("a  a^2  a^3");
    System.out.println("1"+"  "+row2Coloum2+"    "+row2Coloum3);
    System.out.println("2"+"  "+row3Coloum2+"    "+row3Coloum3);
    System.out.println("3"+"  "+row4Coloum2+"    "+row4Coloum3);
    System.out.println("4"+"  "+row5Coloum2+"   "+row5Coloum3);
    }
}
