import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Principle,rate and time");
        int p=s.nextInt();
        int r=s.nextInt();
        int t=s.nextInt();
        int SI=p*r*t/100;
        System.out.println(" SI is="+SI);
    }
}