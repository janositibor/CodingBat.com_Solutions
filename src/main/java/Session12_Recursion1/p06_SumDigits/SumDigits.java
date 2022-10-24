package Session12_Recursion1.p06_SumDigits;

public class SumDigits {
    public int sumDigits(int n) {
        if(n<10){
            return n;
        }
        int digit=n%10;
        return digit+sumDigits((n-digit)/10);
    }
}
