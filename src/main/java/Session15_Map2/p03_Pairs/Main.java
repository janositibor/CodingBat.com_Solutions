package Session15_Map2.p03_Pairs;

public class Main {
    public static void main(String[] args) {
        Pairs pairs=new Pairs();

        System.out.println(pairs.pairs(new String[]{"code", "bug"}));
        System.out.println(pairs.pairs(new String[]{"man", "moon", "main"}));
        System.out.println(pairs.pairs(new String[]{"man", "moon", "good", "night"}));
    }
}
