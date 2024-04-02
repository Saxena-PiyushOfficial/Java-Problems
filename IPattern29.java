package Patterns;

public class IPattern29 {

	public static void main(String[] args) {
	int num=4;
	int k=9;
	for(int i=1;i<=num;i++)
	{
		for(int j=1;j<=9;j++)
		{
			if(j==5)
				System.out.print("*");
			else if(j==i)
			{
			System.out.print("*");
			}
			else if(j==k) {
				System.out.print("*");
				k--;
			}
			else
				System.out.print(0);
					
			
		}
		System.out.println();
	}

	}

}
