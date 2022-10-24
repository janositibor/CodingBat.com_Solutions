package Session12_Recursion1.p07_Count7;

public class Count7 {
    public int count7(int n) {
        if(n<10){
            return n==7?1:0;
        }
        int digit=n%10;
        return (digit==7?1:0)+count7((n-digit)/10);
    }
}
