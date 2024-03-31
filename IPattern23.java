package Patterns;

public class IPattern23 {
    public static void main(String[] args) {
    int rows=5;
    for(int i=1;i<=rows;i++)
    {
    	for(int j=1;j<=rows-(i-1);j++)
    	{
    		System.out.print("*");
    	}
    	for(int k=2;k<=i;k++)
    	{
    		System.out.print(" ");
    	}
    	for(int k=1;k<=i-1;k++)
    	{
    		System.out.print(" ");
    	}
    	for(int j=1;j<=rows-(i-1);j++)
    	{
    		System.out.print("*");
    	}
    	System.out.println();
    }
    for(int i=1;i<=rows;i++)
    {
    	for(int j=1;j<=i;j++)
    	{
    		System.out.print("*");
    	}
    	for(int j=1;j<=2*rows-2*i;j++)
    	{
    		System.out.print(" ");
    	}
    	for(int k=i;k>=1;k--)
    	{
    		System.out.print("*");
    	}
    	System.out.println();
    }
    
    
    
    
    }
}
