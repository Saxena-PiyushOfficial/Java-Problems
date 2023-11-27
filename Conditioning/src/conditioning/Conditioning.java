package conditioning;
import java.util.Scanner;
public class Conditioning {
    public static void main(String[] args) {
     Scanner s=new Scanner(System.in);
     int m1,m2,m3;
     System.out.println("Enter the value of m1,m2,m3");
     m1=s.nextInt();
     m2=s.nextInt();
     m3=s.nextInt();
     float avg=(m1+m2+m3)/3;
    if(avg>=70)
    {
        System.out.println("A");
    }
    else if(avg>=60 && avg<=70)
    {
        System.out.println("B");
    }
    else if(avg>=50 && avg<=60)
    {
        System.out.println("C");
    }else
    {
    System.out.println("D");
    }
    }          
        }
