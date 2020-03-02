public class PantryShelf
{
    
    public static void main(String[] args)
    {
    //create food obejcts
      FoodItems d=new FoodItems("dumplings",8,3);
      FoodItems a=new FoodItems("apples",5);
      FoodItems l=new FoodItems("lollipops",5);
      FoodItems b=new FoodItems("biscuits",6,2);
      //return name and amount
      System.out.println("In my pantry, there are "+d.getNumber()+" "+d.getFood());
      System.out.println("there are "+a.getNumber()+" "+a.getFood());
      System.out.println("there are "+l.getNumber()+" "+l.getFood());
      System.out.println("there are "+b.getNumber()+" "+b.getFood());
//show the food I want to eat
      System.out.println("I want to eat "+d.getEat()+" "+d.getFood());
      System.out.println("And I want to eat "+b.getEat()+" "+b.getFood());
//print out the amount of dumplings I eat and return the left
      for(int i=0;i<d.getEat();i++)
      {
        System.out.println("I am eating a dumpling.");
      }
      d.setNumber(d.getEat());
      System.out.println("There are "+d.getNumber()+" "+d.getFood()+" left.");
//print out the amount of biscuits I eat and return the left
      for(int i=0;i<b.getEat();i++)
      {
        System.out.println("I am eating a biscuit.");
      }
      b.setNumber(b.getEat());
      System.out.println("There are "+b.getNumber()+" "+b.getFood()+" left.");
    }
}