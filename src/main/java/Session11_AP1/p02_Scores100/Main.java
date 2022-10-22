package Session11_AP1.p02_Scores100;

public class Main {
    public static void main(String[] args) {
        Scores100 scores100=new Scores100();

        System.out.println(scores100.scores100(new int[]{1, 100, 100}));
        System.out.println(scores100.scores100(new int[]{1, 100, 99, 100}));
        System.out.println(scores100.scores100(new int[]{100, 1, 100, 100}));
    }
}
