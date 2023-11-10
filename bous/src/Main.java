import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the amount");
        int n = s.nextInt();
        double amt;
        if (n >= 10000) {
            amt = (float) (0.05 * n);
            amt = amt + n;
        } else {
            amt = n;
        }
        System.out.println(amt);
    }
}