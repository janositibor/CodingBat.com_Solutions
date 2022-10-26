package Session12_Recursion1.p09_PowerN;

public class PowerN {
    public int powerN(int base, int n) {
        if(n==1){
            return base;
        }
        return base*powerN(base, n-1);
    }
}
