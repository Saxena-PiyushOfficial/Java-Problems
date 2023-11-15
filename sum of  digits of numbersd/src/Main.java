import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int n=s.nextInt();
        int sum=0;

        for(int i=0;i<=n;i++)
        {
            int d=n%10;
            sum=sum+d;
            n=n/10;
        }
        System.out.println(sum);
    }
}