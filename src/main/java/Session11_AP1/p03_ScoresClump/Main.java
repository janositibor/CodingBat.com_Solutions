package Session11_AP1.p03_ScoresClump;

public class Main {
    public static void main(String[] args) {
        ScoresClump scoresClump=new ScoresClump();

        System.out.println(scoresClump.scoresClump(new int[]{3, 4, 5}));
        System.out.println(scoresClump.scoresClump(new int[]{3, 4, 6}));
        System.out.println(scoresClump.scoresClump(new int[]{1, 3, 5, 5}));
        System.out.println(scoresClump.scoresClump(new int[]{1, 3, 5}));
        System.out.println(scoresClump.scoresClump(new int[]{1, 3}));
        System.out.println(scoresClump.scoresClump(new int[]{1}));
        System.out.println(scoresClump.scoresClump(new int[]{}));
    }
}
