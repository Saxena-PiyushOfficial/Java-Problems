
package reversemethod;

public class Reversemethod {

    static int reverse(int n)
    {
        int d,rev=0;
        for(int i=0;i<n;i++)
        {
            d=n%10;
            rev=rev*10+d;
            n=n/10;
        }
        System.out.println("");
        System.out.print(rev);
        return rev;
    }
    static void reverse(int x[],int n)
    {
          for(int i=n;i>=0;i--)
          {
              System.out.print(" "+x[i]);
          }
         
    }
 
    public static void main(String[] args) {
     
        int a[]={3,6,7,4,5,10};
        int b;
        b = 678;
        reverse(a,5);
        reverse(b);
        
        
    }
    
}
