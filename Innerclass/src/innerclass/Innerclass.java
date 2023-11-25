
package innerclass;
class outer
{
    int x=10;
    class inner
    {
        int y=20;
        public void display()
        {
             System.out.println(x);
        System.out.println(y);
        }  
    }
    void outerdisplay()
    {
        inner i=new inner();
        i.display();
        System.out.println(i.y);
    }
}
public class Innerclass {
    public static void main(String[] args) {
      outer o=new outer();
      o.outerdisplay();
      outer.inner i=new outer().new inner();
      i.display();
    }
    
}
