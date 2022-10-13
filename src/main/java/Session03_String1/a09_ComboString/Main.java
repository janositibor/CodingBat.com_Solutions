package Session03_String1.a09_ComboString;

public class Main {
    public static void main(String[] args) {
        ComboString comboString=new ComboString();

        System.out.println(comboString.comboString("Hello", "hi"));
        System.out.println(comboString.comboString("hi", "Hello"));
        System.out.println(comboString.comboString("aaa", "b"));
        System.out.println(comboString.comboString("", "b"));
    }
}
