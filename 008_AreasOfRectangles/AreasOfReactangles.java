public class AreasOfReactangles
{
    public static void main(String[] args)
    {
    double rec1Width=5.5;
    double rec1Heighth=7.8;
    double rec1AreaInInches=rec1Width*rec1Heighth;
    double rec2Width=99.4;
    double rec2Heighth=500.352;
    double rec2AreaInCentimeters=rec2Width*rec2Heighth;
    double rec3Width=75*2.54;
    double rec3Heighth=800;
    double rec3AreaInCentimeters=rec3Width*rec3Heighth;
    double rec4Width=500029.75;
    double rec4Heighth=90029384/2.54;
    double rec4AreaInInches=rec4Heighth*rec4Width;
    double rec5Width=600000*0.0109361;
    double rec5Heighth=834349103.4*0.0109361;
    double rec5AreaInYards=rec5Heighth*rec5Width;
    System.out.println("The area of rectangle 1 is"+" "+rec1AreaInInches+" "+"inches square.");
    System.out.println("The area of rectangle 2 is"+" "+rec2AreaInCentimeters+" "+"centimeters square.");
    System.out.println("The area of rectangle 3 is"+" "+rec3AreaInCentimeters+" "+"centimeters square.");
    System.out.println("The area of rectangle 4 is"+" "+rec4AreaInInches+" "+"inches square.");
    System.out.println("The area of rectangle 5 is"+" "+rec5AreaInYards+" "+"yards square.");
    }
}