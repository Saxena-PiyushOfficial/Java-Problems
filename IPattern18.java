package Patterns;

public class IPattern18 {
    public static void main(String[] args) {
        int rows = 5;
      for(int i=1;i<=rows;i++)
      {
    	  int start=1;
    	  if(i%2!=0)start=1;
    	  else start=0;
    	  for(int k=1;k<=i;k++)
    	  {
    		 System.out.print(start+" ");
    		 start=1-start;
    	  }
    	  System.out.println();
      }
    }
}
