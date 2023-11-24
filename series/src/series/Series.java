
package series;
import java.util.*;
public class Series {

    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int i=0,d,n,a;
     System.out.println("Enter the number,1st & difference number");
     n=sc.nextInt();  
     a=sc.nextInt();
     d=sc.nextInt();
     int term;
     term=a;
     while(i<n)
     {
         System.out.println(term);
         term=term+d;
         i++;
      
     }
    }
    
}
