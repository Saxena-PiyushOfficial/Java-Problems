package leapyear;
import java.util.Scanner;
public class Leapyear {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        long y;
        System.out.println("Enter the year");
        y=s.nextInt();
        if(y%4==0)
        {
        if(y%400==0){
        System.out.println("Leap year");
        }
        else
        {
         System.out.println("Not a Leap year");
        }}
    }
}
    
