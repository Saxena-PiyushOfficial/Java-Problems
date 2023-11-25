package looops;
import java.util.*;
public class Looops {

    public static void main(String[] args) {
        int n,sum=0;
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number for table");
        n=s.nextInt();
      for(int i=1;i<=n;i++)
      {
          sum=sum+i;
      }
      System.out.println(sum);
    }
    
}
