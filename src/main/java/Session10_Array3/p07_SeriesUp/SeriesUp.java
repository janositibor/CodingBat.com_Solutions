package Session10_Array3.p07_SeriesUp;

public class SeriesUp {
    public int[] seriesUp(int n) {
        int[] output=new int[n*(n+1)/2];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                output[((i-1)*(i)/2)+j-1]=j;
            }
        }
        return output;
    }
}
