package Session05_Logic1.p21_InOrderEqual;

public class InOrderEqual {
    public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
        return ((a<b && b<c) || equalOk && (a<=b && b<=c));
    }
}
