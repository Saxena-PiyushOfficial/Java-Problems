import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int sum=0;
        int a[]={1,4,8,12,16,20,24,28,32,36};

        for(int i=0;i<a.length;i++)
        {
            sum=sum+a[i];
            System.out.print(a[i]+" ");
        }
        System.out.println("\n");
        System.out.println(a.length);
        System.out.println("\n");
        System.out.println("sum= "+sum);
    }
}