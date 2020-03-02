public class AHerdOfCats
{

 public static void main(String[] args)
    {
     Cat[] cats={Cat foo=new Cat(150,"Lenord"),Cat boo=new Cat(50,"Penny"), Cat poo=new Cat(30,"Sheldon")};
     AHerdOfCats i=new AHerdOfCats();
     i.fatty(cats);
    }
    public void fatty(Cat[] x)
    {
        for(Cat y:x)
        {
        System.out.println("The name is "+y.name+" and the weight is "+y.weight);
        System.out.println("I am feeding the cat");
        y.weight++;
        System.out.println("The cat now weights "+y.weight);
        }
    }

}