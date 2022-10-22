package Session11_AP1.p04_ScoresAverage;

public class ScoresAverage {
    public int scoresAverage(int[] scores) {
        int half=scores.length/2;
        return Math.max(averageSection(scores,0,half), averageSection(scores,half,scores.length));
    }
    private int averageSection(int[] nums, int from, int to) {
        int count=0;
        int sum=0;
        for (int i = from; i < to; i++) {
            sum+=nums[i];
            count++;
        }
        return sum/count;
    }
}
