package Session02_Warmup2.a11_StringMatch;

public class Main {
    public static void main(String[] args) {
        StringMatch stringMatch=new StringMatch();

        System.out.println(stringMatch.stringMatch("xxcaazz", "xxbaaz"));
        System.out.println(stringMatch.stringMatch("abc", "abc"));
        System.out.println(stringMatch.stringMatch("abc", "axc"));
        System.out.println(stringMatch.stringMatch("ab", "axc"));
    }
}
