package Patterns;

public class IPattern13 {

	public static void main(String[] args) {
		int rows=7;
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=rows;j++)
			{
				if(i%4==0)
				{
					System.out.print("*");
				}
				else
				{
					if(j%4==0)
					{
						System.out.print("*");
					}
					else
				       System.out.print(" ");	
				}
			}
			System.out.println();
		}

}
}