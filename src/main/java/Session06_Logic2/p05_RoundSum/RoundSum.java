package Session06_Logic2.p05_RoundSum;

public class RoundSum {
    public int roundSum(int a, int b, int c) {
        return round10(a)+round10(b)+round10(c);
    }
    private int round10(int num) {
        return ((num+5)/10)*10;
    }
}
