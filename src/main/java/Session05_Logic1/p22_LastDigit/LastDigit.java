package Session05_Logic1.p22_LastDigit;

public class LastDigit {
    public boolean lastDigit(int a, int b, int c) {
        return (a%10==b%10 || b%10==c%10 || a%10==c%10);
    }
}
