package circle.pkgclass;

      
    class Circle
    {
        public double radius;
        public double area()
        {
            return 3.14*radius*radius;
        }
        public double parameter()
        {
            return 2*3.14*radius;
        }
        public double circumference()
        {
            return 2*3.14*radius;
        }
    }
public class Circle1
    {
    
         public static void main(String[] args) 
          {
              Circle r1=new Circle();
              Circle r2=new Circle();
              r1.radius=7;
              r2.radius=3;
              System.out.println("Area: "+r1.area());
              System.out.println("parameter: "+r1.parameter());
              System.out.println("circumference: "+r1.circumference());
              System.out.println("Area: "+r2.area());
              System.out.println("parameter: "+r2.parameter());
              System.out.println("circumference: "+r2.circumference());
          }
    }


    

