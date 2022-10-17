package Session05_Logic1.p06_AlarmClock;

public class AlarmClock {
    public String alarmClock(int day, boolean vacation) {
        if(day%6==0 && vacation){
            return "off";
        }
        if(day%6==0 || vacation){
            return "10:00";
        }
        return "7:00";
    }
}
