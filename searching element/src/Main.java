import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int key=s.nextInt();
        int a[]={2,6,4,8,9,76};
        for(int i=0;i<a.length;i++)
        {
            if(key==a[i])
            {
                System.out.println(i);
            }
            System.exit(0);
        }
        System.out.println("Not Found");
    }
}