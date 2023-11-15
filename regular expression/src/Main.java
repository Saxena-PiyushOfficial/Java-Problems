import static java.lang.String.valueOf;

public class Main {
    public static void main(String[] args)
    {
        String str="*";
        System.out.println(str.matches("."));
        String str1="c";
        System.out.println(str1.matches("[abc]"));
        String str2="k";
        System.out.println(str2.matches("[^abc]"));
        String str3="A";
        System.out.println(str3.matches("[a-zA-Z0-9]"));
        String str4="b8";
        System.out.println(str4.matches("[a-z][0-9]"));
        String str5="b";
        System.out.println(str5.matches("a|b"));
        String str6="abc";
        System.out.println(str6.matches("bac"));
        String str7="a";
        System.out.println(str7.matches("\\w"));
        String str8="7";
        System.out.println(str8.matches("\\d"));
        String str9="@";
        System.out.println(str9.matches(".*"));
        String str10="aabbcc";
        System.out.println(str10.matches("[abc]*"));
        String str11="aaabbbc";
        System.out.println(str11.matches("[a-z]{3,6}"));
        String stri="saxena345678@gmail.com";
        System.out.println(stri.matches(".*gmail.*"));

        int i=stri.indexOf("@");
        String user=stri.substring(0,i);
        String domain= stri.substring(i+1,stri.length());
        System.out.println("username "+user);
        System.out.println("domain "+domain);


        int x=1011;
        String str14=valueOf(x);
        System.out.println(str14.matches("[01]+"));

        String str12="Ab23*#@456ABH";
        System.out.println(str12.replaceAll("[^a-zA-Z0-9]",""));

        String str13="Ab  A  B  HJHK KL";
        System.out.println(str13.replaceAll("\\s",""));
    }
}