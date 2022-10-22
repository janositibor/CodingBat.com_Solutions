package Session11_AP1.p01_ScoresIncreasing;

public class Main {
    public static void main(String[] args) {
        ScoresIncreasing scoresIncreasing=new ScoresIncreasing();

        System.out.println(scoresIncreasing.scoresIncreasing(new int[]{1, 3, 4}));
        System.out.println(scoresIncreasing.scoresIncreasing(new int[]{1, 3, 2}));
        System.out.println(scoresIncreasing.scoresIncreasing(new int[]{1, 1, 4}));
        System.out.println(scoresIncreasing.scoresIncreasing(new int[]{1, 1}));
        System.out.println(scoresIncreasing.scoresIncreasing(new int[]{1, 0}));
    }
}
