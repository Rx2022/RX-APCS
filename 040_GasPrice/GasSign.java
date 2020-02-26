public class GasSign
{

 public static void main(String[] args)
    {
    GasPriceTracker a=new GasPriceTracker(2.49,"Unleaded");
    GasPriceTracker b=new GasPriceTracker(2.79,"Plus");
    GasPriceTracker c=new GasPriceTracker(2.99,"Premium");
    GasSign d=new GasSign();
    d.gasPrint(a);
    d.gasPrint(b);
    d.gasPrint(c);
}
    public void gasPrint(GasPriceTracker x)
    {
        System.out.println("The type of the gas is "+x.getName()+", aNd the price is "+x.getPrice());
    }
}