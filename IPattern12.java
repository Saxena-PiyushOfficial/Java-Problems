package Patterns;

public class IPattern12 {

	public static void main(String[] args) {
		int rows=5;
  
	for(int i=0;i<rows;i++)
	{
		for(int j=rows-1;j>i;j--)
		{
			System.out.print(" ");
		}
		if(i==0 || i==rows-1)
		{
			for(int k=0;k<=i;k++)
              System.out.print("* ");			
		}else
		{
			System.out.print("*");
			for(int k=1;k<i;k++)
			{
				System.out.print("  ");
			}
			System.out.println(" *");
			
		}
		System.out.println();
	}

}
}