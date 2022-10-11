package Session01_Warmup1.a19_HasTeen;

public class HasTeen {
    public boolean hasTeen(int a, int b, int c) {
        return isTeen(a) || isTeen(b) || isTeen(c);
    }
    private boolean isTeen(int a) {
        return 13<=a && a<=19;
    }
}
