import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int n=s.nextInt();
        for(int i=2;i<=n;)
        {
          if(n%i==0)
          {
              System.out.println(i);
              n=n/i;
          }
          else
          {
              i++;
          }

        }

    }
}