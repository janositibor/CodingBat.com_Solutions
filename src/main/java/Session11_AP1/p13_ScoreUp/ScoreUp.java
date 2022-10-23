package Session11_AP1.p13_ScoreUp;

public class ScoreUp {
    public int scoreUp(String[] key, String[] answers) {
        int points=0;
        String answer;
        String solution;
        for (int i = 0; i < key.length; i++) {
            answer=answers[i];
            solution=key[i];
            points+=evaluate(solution, answer);
        }
        return points;
    }
    private int evaluate( String solution, String answer){
        if("?".equals(answer)){
            return 0;
        }
        if(answer.equals(solution)){
            return 4;
        }
        return -1;
    }
}
