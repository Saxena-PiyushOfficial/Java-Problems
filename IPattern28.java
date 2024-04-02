package Patterns;

public class IPattern28 {

	public static void main(String[] args) {
	int num=5;
	for(int i=1;i<=num;i++)
	{
		for(int j=num;j>=1;j--)
		{
			if(j==i)
				System.out.print("*");
			else
				System.out.print(j);
		}
		System.out.println();
	}

	}

}
