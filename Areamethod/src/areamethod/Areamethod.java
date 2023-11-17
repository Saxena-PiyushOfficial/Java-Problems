package areamethod;
public class Areamethod {

      static int area(int x,int y)
      {
          return x*y;
      }
      static double area(float r)
      {
          return Math.PI*r*r;
      }
      static float area(float x,float y,float z)
      {
         return (x+y)*z/2;
      }
    public static void main(String[] args) {
        System.out.println(area(5,3));
        System.out.println((area(5.6f)));
        System.out.println(area(5,6,3));
    }
    
}
