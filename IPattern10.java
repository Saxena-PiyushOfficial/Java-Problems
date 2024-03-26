package Patterns;
public class IPattern10 {
	public static void main(String[] args) {
		int rows=5;
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=rows;j++)
			{
				if(i==2 && j==2 && j==3 && j==4)
				{
					System.out.println(" ");
				}
				else
				{
					System.out.print("* ");
				}
				
			}
			System.out.println();
		}
	}
}
