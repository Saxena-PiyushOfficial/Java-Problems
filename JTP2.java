package Arrays;

import java.util.HashMap;
import java.util.Map;

public class JTP2 {

	public static void main(String[] args) {
		int arr[]= {1 ,   2,   8,  3,   2,   2,   2,   5,   1  };
	    Map<Integer,Integer> hm=new HashMap<>();
	    
	    for(int i:arr)
	    {
	    	hm.put(i, hm.getOrDefault(i,0)+1);
	    }
      for(Map.Entry<Integer,Integer> entry : hm.entrySet())
      {
    	  System.out.println(entry.getKey()+"="+entry.getValue());
      }
	}

}
