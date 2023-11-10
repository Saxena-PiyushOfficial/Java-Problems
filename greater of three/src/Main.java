import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        System.out.println("enter the three numbers\n");
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        int max;
        max=a;
        if(b>max)
        {
            max=b;
        }
        if(c>max)
        {
            max=c;
        }
        System.out.println(max);
    }
}