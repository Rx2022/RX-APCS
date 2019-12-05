public class FlipACoin
{
    public static void main(String[] args)
    {
      int d1=(int)((Math.random()*10)+1);
      if(d1>=5){
                 System.out.println("head");
              }
             
      else{
          System.out.println("tail");
          }
               
    }
}