package Session12_Recursion1.p01_Factorial;

public class Factorial {
    public int factorial(int n) {
        if(n==0 || n==1){
            return 1;
        }
        return n*factorial(n-1);
    }
}
