package Session11_AP1.p02_Scores100;

public class Scores100 {
    public boolean scores100(int[] scores) {
        for (int i = 1; i < scores.length; i++) {
            if(scores[i]==100 && scores[i-1]==100){
                return true;
            }
        }
        return false;
    }
}
