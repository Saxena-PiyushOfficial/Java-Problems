package javaapplication20;
public class JavaApplication20 {

     static boolean isprime(int n)
     {
         for(int i=2;i<n/2;i++)
         {
            if(n%i==0)
            return false;
         }
             return true;
     }
       

    public static void main(String[] args) 
     {
          int x=19;
          System.out.println(isprime(x));
    }
    
}
