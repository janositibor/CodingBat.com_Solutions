package Session05_Logic1.p20_InOrder;

public class InOrder {
    public boolean inOrder(int a, int b, int c, boolean bOk) {
        return (c>b && (bOk || b>a));
    }
}
