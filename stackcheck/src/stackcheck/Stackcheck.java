
package stackcheck;
class Overflow extends Exception
{
         @Override
         public String toString()
         {
                 return "Stack Overflow";
         }
     }
class Underflow extends Exception
{
         @Override
         public String toString()
         {
                 return "Stack Underflow";
         }
     }
class stack
{
     private int size;
        private int top=-1;
        private int S[];
        public stack(int sz)
        {
            size=sz;
            S=new int[sz];
        }
        public void push(int val)throws Overflow
        {
            if(top==size-1)
                throw new Overflow();
            top++;
            S[top]=val;
        }
        public int pop()throws Underflow
        {
            int x=-1;
            if(top==-1)
                throw new Underflow();
            x=S[top];
            top--;
            return x;
        }
}
public class Stackcheck {
  
    public static void main(String[] args) 
    {
       stack st=new stack(5);
       try
       {
           st.pop();
       }
       catch(Underflow u)
       {
           System.out.println(u);
       }
     /*  try
       {
       st.push(10);
       st.push(20);
       st.push(30);
     st.push(40);
     st.push(50);
     st.push(10);
    }
       catch (Overflow s)
       {
           System.out.println(s);
       }*/
    }
}
