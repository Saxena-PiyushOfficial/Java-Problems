
package rect;
class rectangle
{
    int length,breadth;
    int x=20;
            rectangle(int length,int breadth)
            {
                this.length=length;
                this.breadth=breadth;
            }
            
    
}
class cuboid extends rectangle
{
    int height;
    int x=40;

    cuboid(int l, int b,int h) 
    {
        super(l,b);
        height=h;
    }
    void display()
            {
                System.out.println(super.x);
                System.out.println(x);
            }
}
public class Rect {

    public static void main(String[] args) {
       cuboid r1=new cuboid(5,10,40);
       r1.display();
    }
    
}
