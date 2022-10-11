package Session01_Warmup1.a08_PosNeg;

public class PosNeg {
    public boolean posNeg(int a, int b, boolean negative) {
        return (negative?a<0&&b<0:a*b<0);
    }
}
