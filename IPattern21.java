package Patterns;

public class IPattern21 {
    public static void main(String[] args) {
       int rows=4;
       
       for(int i=1;i<=rows;i++)
       {
    	   for(int j=1;j<=rows-i;j++)
    	   {
    		   System.out.print(" ");
    	   }
    	   char ch='A';
    	   for(int k=1;k<=2*i-1;k++)
    	   {
    		   System.out.print(ch);
    		   if(k<i)
    		   ch++;
    		   else
    			   ch--;
    	   }
    	   for(int j=1;j<=rows-i;j++)
    	   {
    		   System.out.print(" ");
    	   }
    	   System.out.println();
       }
    }
}
