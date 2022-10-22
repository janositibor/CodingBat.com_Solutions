package Session11_AP1.p01_ScoresIncreasing;

public class ScoresIncreasing {
    public boolean scoresIncreasing(int[] scores) {
        for (int i = 1; i < scores.length; i++) {
            if(scores[i]<scores[i-1]){
                return false;
            }
        }
        return true;
    }
}
