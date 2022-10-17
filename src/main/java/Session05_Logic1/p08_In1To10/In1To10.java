package Session05_Logic1.p08_In1To10;

public class In1To10 {
    public boolean in1To10(int n, boolean outsideMode) {
        return outsideMode?(n<=1 || 10<=n):(1<=n && n<=10);
    }
}
