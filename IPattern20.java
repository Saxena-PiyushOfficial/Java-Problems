package Patterns;

public class IPattern20 {
    public static void main(String[] args) {
        int rows = 5;
        char ch='A';
        for(int i=1;i<=rows;i++)
        {
        	//char ch='A';
             for(int j=1;j<=rows-i+1;j++)
             {
            	 System.out.print(ch+" ");
            	 //ch++;
             }
             ch++;
             System.out.println();
        }
     
      
    }
}
