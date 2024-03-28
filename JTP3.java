package Arrays;

public class JTP3 {

	public static void main(String[] args) {
		int arr[]= {1,2,3,5,6,7,8,9};
		int temp=0,j;
	     for(int i=0;i<3;i++)
	     {
	    	 temp=arr[0];
	    	 for(j=0;j<arr.length-1;j++)
	    	 {
	    	
		    	 arr[j]=arr[j+1];
		    
	    	 }
	         arr[j]=temp;	 
	    	 
	     }
	     for(int c: arr)
	     {
	    	 System.out.print(c+" ");
	     }
	}

}
