package Session01_Warmup1.a20_LoneTeen;

public class LoneTeen {
    public boolean loneTeen(int a, int b) {
        return isTeen(a) ^ isTeen(b);
    }
    private boolean isTeen(int a) {
        return 13<=a && a<=19;
    }
}
