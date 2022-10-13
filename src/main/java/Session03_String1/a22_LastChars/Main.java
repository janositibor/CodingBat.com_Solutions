package Session03_String1.a22_LastChars;

public class Main {
    public static void main(String[] args) {
        LastChars lastChars=new LastChars();

        System.out.println(lastChars.lastChars("last", "chars"));
        System.out.println(lastChars.lastChars("yo", "java"));
        System.out.println(lastChars.lastChars("hi", ""));
        System.out.println(lastChars.lastChars("", ""));
    }
}
