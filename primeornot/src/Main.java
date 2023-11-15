import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        System.out.println("enter the number");
        int n=s.nextInt();
        int f = 1;
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                f=0;
                break;
            }
            else
            {
             i++;
            }
        }
        if(f==1)
        {
            System.out.println("Prime");
        }
        else
        {
            System.out.println("Not Prime");
        }
    }
}