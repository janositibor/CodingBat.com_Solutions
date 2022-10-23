package Session11_AP1.p13_ScoreUp;

public class Main {
    public static void main(String[] args) {
        ScoreUp scoreUp=new ScoreUp();

        System.out.println(scoreUp.scoreUp(new String[]{"a", "a", "b", "b"}, new String[]{"a", "c", "b", "c"}));
        System.out.println(scoreUp.scoreUp(new String[]{"a", "a", "b", "b"}, new String[]{"a", "a", "b", "c"}));
        System.out.println(scoreUp.scoreUp(new String[]{"a", "a", "b", "b"}, new String[]{"a", "a", "b", "b"}));
    }
}
