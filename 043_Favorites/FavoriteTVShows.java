public class FavoriteTVShows
{

 public static void main(String[] args)
    {
        //create an array and set its size
        String[] shows=new String[3];
        //put in TV shows one by one
shows[0]="Friends";
shows[1]="Little Sheldon";
shows[2]="Black mirror";
//create an enhanced for loop
for(String x:shows)
{
    //print out the shows
    System.out.println(x);
}
       
    }
}