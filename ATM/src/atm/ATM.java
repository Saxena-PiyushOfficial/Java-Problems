package atm;
class AtmMachine
{
  synchronized void checkbalance(String str)
   {
       System.out.print(str+" checking");
       try{Thread.sleep(1000);}catch(Exception e){}
         System.out.println(" balance");
       
   }
   synchronized void withdrwal(String str,int x)
   {
      System.out.print(str+" withdrawl ");
       try{Thread.sleep(1000);}catch(Exception e){}
         System.out.println(x+" amount");
   }
}
class customer extends Thread
{
    AtmMachine atm;
    String name;
    int amt;
    customer(String name,AtmMachine a,int amt)
    {
        this.name=name;
        this.atm=a;
        this.amt=amt;
    }
   public void useATM()
    {
        atm.checkbalance(name);
        atm.withdrwal(name, amt);
    }
    public void run()
    {
        useATM();
    }
}
public class ATM {


    public static void main(String[] args)
    {
       AtmMachine atm=new AtmMachine();
       customer c1=new customer("Piyush",atm,1000);
       c1.start();
        customer c2=new customer("Pappu Halvai",atm,7000);
       c2.start();
       customer c3=new customer("Ram",atm,117000);
       c3.start();
       customer c4=new customer("Peter",atm,9000);
       c4.start();
    }
    
}
