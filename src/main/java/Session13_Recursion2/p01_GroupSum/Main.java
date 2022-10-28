package Session13_Recursion2.p01_GroupSum;

public class Main {
    public static void main(String[] args) {
        GroupSum groupSum=new GroupSum();

        System.out.println(groupSum.groupSum(0, new int[]{2, 4, 8},10));
        System.out.println(groupSum.groupSum(0, new int[]{2, 4, 8},14));
        System.out.println(groupSum.groupSum(0, new int[]{2, 4, 8},9));
        System.out.println(groupSum.groupSum(0, new int[]{2},9));
        System.out.println(groupSum.groupSum(0, new int[]{},9));
        System.out.println(groupSum.groupSum(1, new int[]{9},0));
        System.out.println(groupSum.groupSum(0, new int[]{},0));
    }
}
