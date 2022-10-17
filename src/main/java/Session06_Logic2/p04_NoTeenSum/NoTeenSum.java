package Session06_Logic2.p04_NoTeenSum;

public class NoTeenSum {
    public int noTeenSum(int a, int b, int c) {
        int output=0;
        output+=fixTeen(a);
        output+=fixTeen(b);
        output+=fixTeen(c);

        return output;
    }
    private int fixTeen(int n) {
        return (n<13 || n>19 || n==15 || n==16)?n:0;
    }
}
