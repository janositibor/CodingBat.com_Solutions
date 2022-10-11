package Session01_Warmup1.a01_SleepIn;

public class Main {

    public static void main(String[] args) {
        SleepIn sleepIn=new SleepIn();

        System.out.println(sleepIn.sleepIn(false, false));
        System.out.println(sleepIn.sleepIn(true, false));
        System.out.println(sleepIn.sleepIn(false, true));
    }
}
