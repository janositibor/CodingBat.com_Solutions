package Session08_String3.p05_CountTriple;

public class Main {
    public static void main(String[] args) {
        CountTriple countTriple=new CountTriple();

        System.out.println(countTriple.countTriple("abcXXXabc"));
        System.out.println(countTriple.countTriple("xxxabyyyycd"));
        System.out.println(countTriple.countTriple("a"));
    }
}
