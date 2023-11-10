import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        int n,fact=1;
        System.out.println("enter the number");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        for(int i=n;i>=1;i--)
        {
            fact=fact*i;
        }
        System.out.println(fact);
    }
}