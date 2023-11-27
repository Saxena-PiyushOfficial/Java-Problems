
package checkedunchecked;
class lowbalance extends Exception
{
    public String toString()
    {
        return "km daal bhai 5000 hi h account m";
    }
    
}

public class Checkedunchecked {

   static void  fun3()
   {
       /*try
       {
       System.out.println(10/0);
       }
       catch(Exception e)
       {        
           System.out.println(e.getMessage());
       }*/
       try
       {
       throw new lowbalance();
       }
       catch(lowbalance e)
       {        
           System.out.println(e);
       }
   }
  static void  fun2()
   {
       fun3();
   }
 static void   fun1()
   {
       fun2();
   }
    public static void main(String[] args) {
        fun1();
    }
    
}
