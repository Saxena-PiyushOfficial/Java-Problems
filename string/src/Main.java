
public class Main {
    public static void main(String[] args)
    {
       String str="Java Program";
        String str10="J";

       int l=str.length();
       System.out.println(l);
       String str1=str.toLowerCase();
        System.out.println(str1);
        String str2=str.toUpperCase();
        System.out.println(str2);
        String str3=str.trim();
        System.out.println(str3);
        String str4=str.substring(5,8);
        System.out.println(str4);
        String str5=str.replace('J','N');
        System.out.println(str5);

        System.out.println(str.startsWith("v"));
        System.out.println(str.endsWith("Program"));
        System.out.println(str.charAt(6));
        System.out.println(str.lastIndexOf("a",5));
        System.out.println(str.equals(str2));
        System.out.println(str.equalsIgnoreCase(str2));
        System.out.println(str2.compareTo(str1));
        System.out.println(str10.valueOf(5));
        System.out.println(str10+99);
    }
}