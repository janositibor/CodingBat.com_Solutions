package Session01_Warmup1.a16_StartHi;

public class Main {
    public static void main(String[] args) {
        StartHi startHi=new StartHi();

        System.out.println(startHi.startHi(null));
        System.out.println(startHi.startHi(""));
        System.out.println(startHi.startHi("h"));
        System.out.println(startHi.startHi("hi there"));
        System.out.println(startHi.startHi("hi"));
        System.out.println(startHi.startHi("hello hi"));
    }
}
