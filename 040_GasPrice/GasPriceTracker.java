public class GasPriceTracker
{
    //create variables
    private double price;
    private String name;
    //create the constructor
    public GasPriceTracker(double price, String name)
    {
        this.price=price;
        this.name=name;
    }
    public static void main(String[] args)
    {

    }
    //return the price of the gas
    public Double getPrice()
    {
        return price;
    }
    //return the name of the gas
    public String getName()
    {
        return name;
    }
    //method to change the price
    public void setPrice(int x)
    {

    }
    
}