package Patterns;

public class IPattern25 {
    public static void main(String[] args) {
    int rows=4;
    for(int i=1;i<=rows;i++)
    {
    	if(i==1 || i%4==0)
    	{
    		for(int j=1;j<=4;j++)
    		{
    			System.out.print("* ");
    		}
    	}
    	else
    	{
    		System.out.print("* ");
    		for(int k=2;k<=3;k++)
    		{
    	    System.out.print("  ");		
    		}
    		System.out.print("* ");
    	}
    	System.out.println();
    	
    }
    
    }
}
