package Session13_Recursion2.p06_SplitArray;

public class Main {
    public static void main(String[] args) {
        SplitArray splitArray=new SplitArray();

        System.out.println(splitArray.splitArray(new int[]{2,2}));
        System.out.println(splitArray.splitArray(new int[]{3,2}));
        System.out.println(splitArray.splitArray(new int[]{5, 2, 3}));
        System.out.println(splitArray.splitArray(new int[]{}));
    }
}
