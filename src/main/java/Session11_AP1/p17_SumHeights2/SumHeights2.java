package Session11_AP1.p17_SumHeights2;

public class SumHeights2 {
    public int sumHeights2(int[] heights, int start, int end) {
        int sum=0;
        int difference;
        for (int i = start+1; i <= end; i++) {
            difference=heights[i]-heights[i-1];
            sum+=(difference>0?2*difference:-1*difference);
        }
        return sum;
    }
}
