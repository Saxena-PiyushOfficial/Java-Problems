import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        int n;
        int a;
        int b;
        System.out.println("enter the last number");
        n=s.nextInt();
        for(a=0,b=1;a<=n;)
        {
            System.out.print(a+" ");
            int t = a+b;
            a=b;
            b=t;

    }
}}