import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        System.out.println("enter the number");
        int n=s.nextInt();
        int max=0;
        int min=9;
        for(;n>0;)
        {
            int d=n%10;
            if(d>max)
            {
                max=d;
            }
            else if(d<min)
            {
                min=d;
            }
            n=n/10;
        }
        System.out.println(max+" "+min);
    }

}