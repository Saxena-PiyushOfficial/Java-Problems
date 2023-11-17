package add;
import java.util.*;


public class Add {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the marks: ");
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        int per=(a+b+c)/3;
        System.out.println("The percentage obtained is: "+per);
        
    }
}
