public class GasSign
{

 public static void main(String[] args)
    {
        //create three gas objects
    GasPriceTracker a=new GasPriceTracker(2.49,"Unleaded");
    GasPriceTracker b=new GasPriceTracker(2.79,"Plus");
    GasPriceTracker c=new GasPriceTracker(2.99,"Premium");
    //create one object of this class to call method
    GasSign d=new GasSign();
    //print out the name and the price
    d.gasPrint(a);
    d.gasPrint(b);
    d.gasPrint(c);
}
//method to print the name and the price
    public void gasPrint(GasPriceTracker x)
    {
        System.out.println("The type of the gas is "+x.getName()+", aNd the price is "+x.getPrice());
    }
}