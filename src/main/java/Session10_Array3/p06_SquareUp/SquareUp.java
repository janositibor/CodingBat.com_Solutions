package Session10_Array3.p06_SquareUp;

public class SquareUp {
    public int[] squareUp(int n) {
        int[] output=new int[n*n];
        for(int i=1;i<=n;i++){
            for (int j = i; j <= n; j++) {
                output[j*n-i]=i;
            }
        }
        return output;
    }
}
