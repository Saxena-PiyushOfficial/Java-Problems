
package interfaces;
interface Test
{
    void meth1();
    void meth2();
}
class My implements Test
{
    public void meth1()
    {
        System.out.println("meth 1 good");
    }
    public void meth2()
    {
        System.out.println("meth 2 bad");
    }
    public void meth3()
    {
        System.out.println("meth3");
    }
}
public class Interfaces {

    

    public static void main(String[] args) {
        Test t=new My();
        t.meth1();
        t.meth2();
    }
    
}
