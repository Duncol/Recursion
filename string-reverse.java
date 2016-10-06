import java.util.*;

public class MainClass {
    static String ns = "";
    static int i = 1;
    public static void main (String[] args) {
        String word = new Scanner (System.in).nextLine();
        System.out.println(reverse(word));
    }
    public static String reverse(String s){
        if (ns.length() == s.length()) {return ns;}
        else{
            ns += s.charAt(s.length()-i);
            i++;
            reverse(s);
            return ns;
        }
    }
}
