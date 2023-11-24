
package random;

import java.util.Scanner;

public class Random {

     public static void max(int x,int y)
     {
         x++;
         if(x>y)
             System.out.println("the max is"+x);
         else
            System.out.println("the max is"+y);
     }
    public static void main(String[] args) {
               Scanner s=new Scanner(System.in);
               System.out.println("Enter the numbers");
               int a=s.nextInt();
               int b=s.nextInt();
              max(a,b);
              
               
    }
    
}
