package Session03_String1.a24_LastTwo;

public class Main {
    public static void main(String[] args) {
        LastTwo lastTwo=new LastTwo();

        System.out.println(lastTwo.lastTwo("coding"));
        System.out.println(lastTwo.lastTwo("cat"));
        System.out.println(lastTwo.lastTwo(""));
        System.out.println(lastTwo.lastTwo("a"));
        System.out.println(lastTwo.lastTwo("ab"));
    }
}
