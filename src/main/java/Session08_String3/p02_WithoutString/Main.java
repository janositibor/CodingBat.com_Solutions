package Session08_String3.p02_WithoutString;

public class Main {
    public static void main(String[] args) {
        WithoutString withoutString=new WithoutString();

        System.out.println(withoutString.withoutString("Hello there", "llo"));
        System.out.println(withoutString.withoutString("Hello there", "e"));
        System.out.println(withoutString.withoutString("Hello there", "x"));
    }
}
