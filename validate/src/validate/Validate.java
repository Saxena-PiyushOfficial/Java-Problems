package validate;

public class Validate {

            static Boolean validate(String n)
      {
          return n.matches("[a-zA-Z]*");
      }
       static boolean validate(int n)
       {
           return n>=13 && n<=16;
          
       }
    
    public static void main(String[] args) {
        String name="Vishapl";
        System.out.println(validate(name));
        System.out.println(validate(14));
    }
    
}
