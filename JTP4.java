package Arrays;

import java.util.HashMap;
import java.util.Map;

public class JTP4 {

	public static void main(String[] args) {
		int arr[]= {1,2,3,5,3,7,1,3,1,1,1,2,5};
	    Map<Integer,Integer> hm=new HashMap<>();
	    for(int c:arr)
	    {
	    	hm.put(c,hm.getOrDefault(c,0)+1);
	    }
	    for(Map.Entry<Integer,Integer> entry :hm.entrySet())
	    {
	    	if(entry.getValue()>1)
	    	{
	    		System.out.println(entry.getKey()+"="+entry.getValue());
	    	}
	}
	
	}

}
