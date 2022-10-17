package Session05_Logic1.p14_TeenSum;

public class TeenSum {
    public int teenSum(int a, int b) {
        if(isTeen(a) || isTeen(b)){
            return 19;
        }
        return a+b;
    }
    private boolean isTeen(int num){
        return (13<=num && num<=19);
    }
}
