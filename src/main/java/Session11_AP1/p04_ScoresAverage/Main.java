package Session11_AP1.p04_ScoresAverage;

public class Main {
    public static void main(String[] args) {
        ScoresAverage scoresAverage=new ScoresAverage();

        System.out.println(scoresAverage.scoresAverage(new int[]{2, 2, 4, 4}));
        System.out.println(scoresAverage.scoresAverage(new int[]{4, 4, 4, 2, 2, 2}));
        System.out.println(scoresAverage.scoresAverage(new int[]{3, 4, 5, 1, 2, 3}));
    }
}
