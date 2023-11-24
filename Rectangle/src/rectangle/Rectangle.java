package rectangle;


public class Rectangle {
        private int length;
        private int breadth;
        public Rectangle()
        {
            length =1;
            breadth=1;
        }
         public Rectangle(int l,int b)
    {
        setlength(l);
        setbreadth(b);
        
    }
        
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
    public int getbreadth()
    {
        return breadth;
    }
    public void setbreadth(int b)
    {
        if(b>0)
        {
            breadth=b;
        }
        else
        {
            breadth=0;
        }
    }
        public int area()
    {
        return length*breadth;
    }
    public int parameter()
    {
        return 2*(length+breadth);
    }
    public Rectangle(int s)
    {
        length=breadth=s;
        
    }
    
    public static void main(String[] args) {
        
        Rectangle r=new Rectangle();
      
        System.out.println("Area: "+r.area());
              System.out.println("parameter: "+r.parameter());
          
    }

    
}
