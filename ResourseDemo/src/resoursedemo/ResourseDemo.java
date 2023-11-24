
package resoursedemo;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
public class ResourseDemo {
 static void divide()throws Exception
       {
           try(FileInputStream  f1 =new FileInputStream("C:\\MyJava\\Test.txt");Scanner sc=new Scanner(f1))
         {
         
          int a=sc.nextInt();
          int b=sc.nextInt();
          int c=sc.nextInt();
          System.out.println(a/c);
           }
       }
    public static void main(String[] args)throws Exception
    {
        try
        {
           divide(); 
        }
       catch(Exception e)
       {
           System.out.println(e);
       }
        //int x=sc.nextInt();
        //
        System.out.println(x);
    }
    
}
