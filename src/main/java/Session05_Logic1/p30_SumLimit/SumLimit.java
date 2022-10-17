package Session05_Logic1.p30_SumLimit;

public class SumLimit {
    public int sumLimit(int a, int b) {
        int sum=a+b;

        return lengthOfNumber(sum)>lengthOfNumber(a)?a:sum;
    }

    private int lengthOfNumber(int num){
        return String.valueOf(num).length();
    }
}
