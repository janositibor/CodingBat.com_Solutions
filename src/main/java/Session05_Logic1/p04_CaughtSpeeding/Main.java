package Session05_Logic1.p04_CaughtSpeeding;

public class Main {
    public static void main(String[] args) {
        CaughtSpeeding caughtSpeeding=new CaughtSpeeding();

        System.out.println(caughtSpeeding.caughtSpeeding(60, false));
        System.out.println(caughtSpeeding.caughtSpeeding(61, false));
        System.out.println(caughtSpeeding.caughtSpeeding(65, true));
    }
}
