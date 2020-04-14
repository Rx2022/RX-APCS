import java.util.*;
public class CleanTempSensorData
{

 public static void main(String[] args)
    {
        //create an object 
    CleanTempSensorData foo=new CleanTempSensorData();
    //create an object of SensorData
    SensorData data=new SensorData();
    //put values in an  array
    int[] boo=data.getTempSensorData();
    //create an array list
    ArrayList <Integer> yoo = new ArrayList<Integer>();
    //put the values that are less than 20 in the array list 
    for(int i=0;i<boo.length;i++)
    {
        if(boo[i]<20)
        {
            yoo.add(boo[i]);
        }
        

    }
    //print  out the values in the array list
    for(int x:yoo)
    {
        System.out.println(x); 
    }
    }
    
    
    
}