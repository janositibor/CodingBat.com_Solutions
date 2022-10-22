package Session11_AP1.p03_ScoresClump;

public class ScoresClump {
    public boolean scoresClump(int[] scores) {
        if(scores.length<3){
            return false;
        }
        for (int i = 2; i < scores.length; i++) {
            if((scores[i]-scores[i-2])<=2){
                return true;
            }
        }
        return false;
    }
}
