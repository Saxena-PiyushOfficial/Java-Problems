package Patterns;

public class IPattern11 {

	public static void main(String[] args) {	
		int rows=5;
	for(int i=1;i<=rows;i++)
	{
		for(int j=i;j<rows;j++)
		{
			System.out.print(" ");
		}
		for(int m=1;m<=i;m++)
		{
			System.out.print(m);
		}
		System.out.println();
	}
	}

}
