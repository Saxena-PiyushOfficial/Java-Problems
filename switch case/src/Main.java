import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        System.out.println("enter the day number");
        int  n=s.nextInt();
        if (n == 1) {
            System.out.println("Sunday");
        } else if (n == 2) {
            System.out.println("mon");
        } else if (n== 3) {
            System.out.println("tues");
        } else if (n == 4) {
            System.out.println("wed");
        } else if (n == 5) {
            System.out.println("thursday");
        } else if (n == 6) {
            System.out.println("friday");
        } else if (n == 7) {
            System.out.println("saturday");
        } else {
            System.out.println("not");
        }
    }
}