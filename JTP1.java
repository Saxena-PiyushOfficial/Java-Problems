package Arrays;

public class JTP1 {

	public static void main(String[] args) {
		int arr[]= {1,2,3,5,6,7,8,9};
		int arr1[]=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			arr1[i]=arr[i];
		}
		for(int i: arr1)
		{
			System.out.print(i+" ");
		}

	}

}
