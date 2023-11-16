import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        int x,y,i,p=1;
        System.out.println("Enter the numbers");
        x=s.nextInt();
        y=s.nextInt();
        for(i=1;i<=y;i++)
        {
            p=p*x;
        }
        System.out.println(p);

    }
}