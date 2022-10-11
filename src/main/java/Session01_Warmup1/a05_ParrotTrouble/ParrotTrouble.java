package Session01_Warmup1.a05_ParrotTrouble;

public class ParrotTrouble {
    public boolean parrotTrouble(boolean talking, int hour) {
        return(talking&&(hour<7||hour>20));
    }
}
