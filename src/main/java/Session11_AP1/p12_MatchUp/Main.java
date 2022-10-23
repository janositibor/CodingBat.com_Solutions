package Session11_AP1.p12_MatchUp;

public class Main {
    public static void main(String[] args) {
        MatchUp matchUp=new MatchUp();

        System.out.println(matchUp.matchUp(new String[]{"aa", "bb", "cc"}, new String[]{"aaa", "xx", "bb"}));
        System.out.println(matchUp.matchUp(new String[]{"aa", "bb", "cc"}, new String[]{"aaa", "b", "bb"}));
        System.out.println(matchUp.matchUp(new String[]{"aa", "bb", "cc"}, new String[]{"", "", "ccc"}));
    }
}
