import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number range");
        int n=s.nextInt();
        int Esum=0;
        int Osum=0;
        for(int i=0;i<=n;i++)
        {
            System.out.println("Enter the number element");
            int num=s.nextInt();
            if(num%2==0)
            {
                Esum=Esum+num;
            }
            else
            {
              Osum=Osum+num;
            }
        }
        System.out.println(Esum+" "+Osum);
    }
}