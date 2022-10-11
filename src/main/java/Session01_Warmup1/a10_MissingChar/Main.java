package Session01_Warmup1.a10_MissingChar;

public class Main {
    public static void main(String[] args) {
        MissingChar missingChar=new MissingChar();
        System.out.println(missingChar.missingChar("kitten", 1));
        System.out.println(missingChar.missingChar("kitten", 0));
        System.out.println(missingChar.missingChar("kitten", 4));
        System.out.println(missingChar.missingChar("kitten", 5));
        System.out.println(missingChar.missingChar("Hi", 0));
        System.out.println(missingChar.missingChar("Hi", 1));
    }
}
