package Session09_Array2.p16_MatchUp;

public class Main {
    public static void main(String[] args) {
        MatchUp matchUp=new MatchUp();

        System.out.println(matchUp.matchUp(new int[]{1, 2, 3},new int[]{2, 3, 10}));
        System.out.println(matchUp.matchUp(new int[]{1, 2, 3},new int[]{2, 3, 5}));
        System.out.println(matchUp.matchUp(new int[]{1, 2, 3},new int[]{2, 3, 3}));
        System.out.println(matchUp.matchUp(new int[]{},new int[]{}));
    }
}
