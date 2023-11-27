
package constructorin;
class parents
{
    public parents()
    {
        System.out.println("Contructor parent");
    }
    public parents(int z)
    {
        System.out.println("param constructor"+z);
    }
 }
class child extends parents
{
   public child()
   {
    System.out.println("Constructor child");
   }
   public child(int y)
   {
    System.out.println("Constructor param");
   }
   public child(int x,int y)
   {
       super(x);
    System.out.println("Constructor "+y);
   }
}

public class Constructorin {
    public static void main(String[] args) {
       child g1=new child(20);
    }
    
}
