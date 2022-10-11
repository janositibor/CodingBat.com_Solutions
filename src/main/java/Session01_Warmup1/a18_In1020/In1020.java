package Session01_Warmup1.a18_In1020;

public class In1020 {
    public boolean in1020(int a, int b) {
        return singleNumberIn1020(a) || singleNumberIn1020(b);
    }
    private boolean singleNumberIn1020(int a) {
        return 10<=a && a<=20;
    }
}
