
package varargs;


public class Varargs {
             
    static void showlist(int start,String... S)
    {
        for(int i=0;i<S.length;i++)
        {
            System.out.println(start+". "+S[i]);
            start++;
        }
    }
    public static void main(String[] args)
    { 
        showlist(5, "john","rahul","gupta","sachin");
    }
    
}
