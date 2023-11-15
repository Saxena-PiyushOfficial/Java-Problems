import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
            System.out.println("Enter the number range");
            int n = s.nextInt();
            int num;
        System.out.println("Enter the number element");
        num = s.nextInt();
            int max=num;
            int min=num;
            for (int i = 2; i <= n; i++)
            {
                System.out.println("Enter the number element");
                num = s.nextInt();
                if(num>max)
                {
                   max=num;
                }
                else if(num<min)
                {
                    min=num;
                }
            }
        System.out.println("maximum is "+max+" minimum is  "+min);

    }
}