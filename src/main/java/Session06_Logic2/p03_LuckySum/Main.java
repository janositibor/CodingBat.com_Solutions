package Session06_Logic2.p03_LuckySum;

public class Main {
    public static void main(String[] args) {
        LuckySum luckySum=new LuckySum();

        System.out.println(luckySum.luckySum(1, 2, 3));
        System.out.println(luckySum.luckySum(1, 2, 13));
        System.out.println(luckySum.luckySum(1, 13, 3));
        System.out.println(luckySum.luckySum(13, 2, 3));
    }
}
