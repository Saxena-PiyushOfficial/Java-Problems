
package cartest;
class car
{
    public void start()
    {
        System.out.println("Car is started");
    }
     public void accelerate()
    {
        System.out.println("Car is accelerates");
    }
      public void changegear()
    {
        System.out.println("Car gear is changed");
    }
}
class luxarycar extends car
{
     public int channgegear()
    {
        System.out.println("automatic gear");
        return 0;
    }
      public void roof()
    {
        System.out.println("Car roof is open");
    }
  
    
}
public class Cartest {

 
    public static void main(String[] args) {
        luxarycar c=new luxarycar();
        c.start();
        c.accelerate();
       System.out.println(c.changegear()); 
        
    }
    
}
