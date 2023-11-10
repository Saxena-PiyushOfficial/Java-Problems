import java.lang.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner s=new Scanner (System.in);
        System.out.println("ENTER THE TWO NUMBER a AND b\n");
       int  a=s.nextInt();
       int  b=s.nextInt();
       int add=a+b;
       int sub=a-b;
       int mul=a*b;
       int div=a/b;
       float rem=a%b;
       System.out.println(add+" "+sub+" "+mul+" "+div+" "+rem);
    }
}