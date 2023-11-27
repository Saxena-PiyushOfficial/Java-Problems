
package pkgclass.rectangle;
class Rect
{
    private int length;
    private int breath;
    
    public int getlength()
    {
        return length;
    }
    public void setlength(int l)
    {
        if(l>0)
        {
            length=l;
        }
        else
        {
            length=0;
        }
    }
    public int getbreath()
    {
        return breath;
    }
    public void setbreath(int b)
    {
        if(b>0)
        {
            breath=b;
        }
        else
        {
            breath=0;
        }
    }
    public int area()
    {
        return length*breath;
    }
    public int parameter()
    {
        return 2*(length+breath);
    }
    public boolean Issqr()
    {
        if(length==breath)
            return true;
        
        else
            return false;
    }
}
public class ClassRectangle {

    
    public static void main(String[] args) {
        Rect r1=new Rect();
        
        r1.setlength((int) 30.8);
        r1.setbreath((int) 30.6);
       
        
        System.out.println("Area: "+r1.area());
              System.out.println("parameter: "+r1.parameter());
              System.out.println("is it square: "+r1.Issqr());
              System.out.println("length: "+r1.getlength());
              System.out.println("breath: "+r1.getbreath());
    }
    
}
