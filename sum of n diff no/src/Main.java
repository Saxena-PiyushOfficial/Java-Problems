import java.lang.*;
import java.util.Scanner;

public class Main
   {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int sum=0,num;
        System.out.println("enter the numbers");
        int n = s.nextInt();
        for(int i=0;i<=n;i++)
        {
            System.out.println("enter the number");
            num=s.nextInt();
            sum = sum + num;

        }System.out.println(sum);

    }
}