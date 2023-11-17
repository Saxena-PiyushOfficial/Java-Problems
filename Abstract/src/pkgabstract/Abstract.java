
package pkgabstract;
abstract class Shape
   {
       abstract public float perimeter();
       abstract public float area();
   }
   class Circle extends Shape
   {

           float radius;
      
       @Override
       public float area()
       {
           return (float) (3.14*radius*radius);
       }
       @Override
       public float perimeter()
       {
           return (float) (2*3.14*radius);
       }
       
   }
   class Rectangle extends Shape
   {
       
      float length;
      float breadth;
     
       @Override
             public float area()
              {
                  return length*breadth;
              }
       @Override
             public float perimeter()
              {
                  return 2*(length+breadth);
              }
   }
public class Abstract {

   
    public static void main(String[] args) {
       
        Circle c=new Circle();
        c.radius=7;
        System.out.println(c.area());
        System.out.println(c.perimeter());
        
        Rectangle r=new Rectangle();
        r.length=3;
        r.breadth=6;
        System.out.println(r.area());
        System.out.println(r.perimeter());
        
        Shape s=c;
        
        
        System.out.println(s.area());
    }
    
}
