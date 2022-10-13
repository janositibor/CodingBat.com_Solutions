package Session03_String1.a20_HasBad;

public class Main {
    public static void main(String[] args) {
        HasBad hasBad=new HasBad();

        System.out.println(hasBad.hasBad("badxx"));
        System.out.println(hasBad.hasBad("xbadxx"));
        System.out.println(hasBad.hasBad("xxbadxx"));
        System.out.println(hasBad.hasBad(" "));
        System.out.println(hasBad.hasBad("ba"));
    }
}
