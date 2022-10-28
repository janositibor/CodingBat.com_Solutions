package Session13_Recursion2.p07_SplitOdd10;

public class Main {
    public static void main(String[] args) {
        SplitOdd10 splitOdd10=new SplitOdd10();

        System.out.println(splitOdd10.splitOdd10(new int[]{5, 5, 5}));
        System.out.println(splitOdd10.splitOdd10(new int[]{5, 5, 6}));
        System.out.println(splitOdd10.splitOdd10(new int[]{5, 5, 6, 1}));
        System.out.println(splitOdd10.splitOdd10(new int[]{1}));
    }
}
