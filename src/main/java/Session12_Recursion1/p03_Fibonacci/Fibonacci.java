package Session12_Recursion1.p03_Fibonacci;

public class Fibonacci {
    public int fibonacci(int n) {
        if(n==0 || n==1){
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
}
