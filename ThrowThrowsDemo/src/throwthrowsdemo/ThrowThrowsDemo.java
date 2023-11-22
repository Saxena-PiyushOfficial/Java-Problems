package throwthrowsdemo;
class negativedimension extends Exception
{
    public String toString()
    {
        return "Dimension cannot be negative";
    }
}
public class ThrowThrowsDemo {
    static int area(int l,int b)throws negativedimension
    {
        if(l<0 || b<0)
            throw new negativedimension();
        return l*b;
    }
    static void meth1()throws negativedimension
    {
      System.out.println(area(-3,-2));  
    }

public static void main(String[] args) {
        try {
            meth1();
        } catch (negativedimension e) 
        {
            System.out.println(e);
        }
}
}
    /*static int meth1()
{
    return 10/0;
}
static void meth2()
{
    meth1();
}
static void meth3()
{
    meth2();
}
public static void main(String[] args) {
        try
        {
        meth3();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
}*/
