package Session11_AP1.p15_ScoresSpecial;

public class Main {
    public static void main(String[] args) {
        ScoresSpecial scoresSpecial=new ScoresSpecial();

        System.out.println(scoresSpecial.scoresSpecial(new int[]{12, 10, 4},new int[]{2, 20, 30}));
        System.out.println(scoresSpecial.scoresSpecial(new int[]{20, 10, 4},new int[]{2, 20, 10}));
        System.out.println(scoresSpecial.scoresSpecial(new int[]{12, 11, 4},new int[]{2, 20, 31}));
    }
}
