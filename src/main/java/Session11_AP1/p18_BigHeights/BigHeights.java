package Session11_AP1.p18_BigHeights;

public class BigHeights {
    public int bigHeights(int[] heights, int start, int end) {
        int count=0;
        for (int i = start+1; i <= end; i++) {
            if(Math.abs(heights[i]-heights[i-1])>=5){
                count++;
            }
        }
        return count;
    }
}
