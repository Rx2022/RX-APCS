public class FoodItems
{
//insert variables
private String food;
 private int amount;
 private int eat;
 

//constructor  for food
public FoodItems(String food, int amount)
{
    this.food=food;
    this.amount=amount;
}
//constructor for food that will be eaten
public FoodItems(String food, int amount, int eat)
{
     this.food=food;
     this.amount=amount;
     this.eat=eat;
}


    public static void main(String[] args)
    {

    }
    //method to return name of the food
    public String getFood()
    {
        return food;
    }
    
//method to return number of the food
    public int getNumber()
    {
        return amount;
    }

//method that return number of the food will be eaten
    public int getEat()
    {
        return eat;
    }

   
//method that return number of the food after eating
    public void setNumber(int x)
    {
        amount-=x;
    }
    
    
}