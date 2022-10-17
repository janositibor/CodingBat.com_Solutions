package Session05_Logic1.p03_SquirrelPlay;

public class SquirrelPlay {
    public boolean squirrelPlay(int temp, boolean isSummer) {
        return temp>=60 && (temp<=90 || isSummer && temp<=100);
    }
}
