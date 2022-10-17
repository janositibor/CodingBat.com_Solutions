package Session05_Logic1.p23_LessBy10;

public class LessBy10 {
    public boolean lessBy10(int a, int b, int c) {
        return differrenceMoreThan10(a,b) || differrenceMoreThan10(a,c) || differrenceMoreThan10(b,c);
    }
    private boolean differrenceMoreThan10(int a, int b){
        return Math.abs(a-b)>=10;
    }
}
