public class FoodItems
{
private String food;
 private int amount;
 private int eat;
 


public FoodItems(String food, int amount)
{
    this.food=food;
    this.amount=amount;
}

public FoodItems(String food, int amount, int eat)
{
     this.food=food;
     this.amount=amount;
     this.eat=eat;
}


    public static void main(String[] args)
    {

    }
    public String getFood()
    {
        return food;
    }
    

    public int getNumber()
    {
        return amount;
    }


    public int getEat()
    {
        return eat;
    }

   

    public void setNumber(int x)
    {
        amount-=x;
    }
    
    
}