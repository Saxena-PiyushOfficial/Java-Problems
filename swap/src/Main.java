import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int a,b;
        System.out.print("Enter the value of a and b to swap");
        a=s.nextInt();
        b=s.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a="+a+"b="+b);
    }
}