package Patterns;

public class IPattern22 {
    public static void main(String[] args) {
       int rows=5;
       for(int i=0;i<rows;i++)
       {
    	 for(char ch=(char)('E'-i);ch<='E';ch++)
    	 {
    		 System.out.print(ch);
    	 }
    	  System.out.println();
       }
    }
}
