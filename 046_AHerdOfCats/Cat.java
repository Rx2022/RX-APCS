public class Cat
{
    int w;
    String n;
    public Cat(int weight, String name)
    {
    w= weight;
    n=name;   
    }

 public static void main(String[] args)
    {

    }
    public String getName()
    {
     return n;
    }
    public int getWeight()
    {
        return w;
    }
    public void setWeight()
    {
    w++;
    }
}