package Patterns;

public class IPattern31 {

	public static void main(String[] args) {
	int num=5;
	for(int i=1;i<=num;i++)
	 {
	    for(int j=1;j<=num-i+1;j++)
	    {
	    	System.out.print(j+" ");
	    }
	    for(int j=1;j<=2*(i-1);j++)
	    {
	    	System.out.print("* ");
	    }
	    for(int j=num-i+1;j>=1;j--)
	    {
	    	System.out.print(j+" ");
	    }
	    System.out.println();
	 }

	}

}
