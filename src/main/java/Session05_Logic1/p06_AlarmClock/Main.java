package Session05_Logic1.p06_AlarmClock;

public class Main {
    public static void main(String[] args) {
        AlarmClock alarmClock=new AlarmClock();

        System.out.println(alarmClock.alarmClock(1, false));
        System.out.println(alarmClock.alarmClock(5, false));
        System.out.println(alarmClock.alarmClock(0, false));
        System.out.println(alarmClock.alarmClock(0, true));
    }
}
