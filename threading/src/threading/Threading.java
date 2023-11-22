
package threading;
class mythread extends Thread
{
    /*public mythread(String name)
    {
      super(name);
     // setPriority(Thread.NORM_PRIORITY+1);
    }*/
    public void run()
    {
        int count =1;
        while(true)
        {
        System.out.println(count++ +" my thread");
       /* try
        {
        Thread.sleep(1000);
        }
        catch(InterruptedException e)
        {
              System.out.println(e);
        }*/
        }
    }
}
public class Threading {

    public static void main(String[] args) throws Exception
    {
  //   mythread  t=new mythread("Meri thread hain");
    /* System.out.println("ID "+t.getId());
     System.out.println("Name "+t.getName());
     System.out.println("Prio "+t.getPriority());
     t.start();
     System.out.println("State "+t.getState());
     System.out.println("Alive "+t.isAlive());*/
        mythread th=new mythread();
       th.setDaemon(true);
      th.start();
      int count=1;
       while(true)
        {
        System.out.println(count++ +"main");
        //Thread.yield();
        }
    //  try{Thread.sleep(100);}catch(Exception e){}
      //t.interrupt();
    //  Thread mainthread=Thread.currentThread();
    //  mainthread.join();
      
      
    }
    
}
