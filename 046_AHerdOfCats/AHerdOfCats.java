public class AHerdOfCats
{

 public static void main(String[] args)
    {
     Cat[] cats={new Cat(150,"Lenord"), new Cat(50,"Penny"), new Cat(30,"Sheldon")};
     AHerdOfCats i=new AHerdOfCats();
     i.fatty(cats);
    }
    public void fatty(Cat[] x)
    {
        for(Cat y:x)
        {
        System.out.println("The name is "+y.getName()+" and the weight is "+y.getWeight());
        System.out.println("I am feeding the cat");
        y.setWeight();
        System.out.println("The cat now weighs "+y.getWeight());
        }
    }

}