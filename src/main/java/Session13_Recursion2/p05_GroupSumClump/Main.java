package Session13_Recursion2.p05_GroupSumClump;

public class Main {
    public static void main(String[] args) {
        GroupSumClump groupSumClump=new GroupSumClump();

        System.out.println(groupSumClump.groupSumClump(0, new int[]{2, 4, 8},10));
        System.out.println(groupSumClump.groupSumClump(0, new int[]{1, 2, 4, 8, 1},14));
        System.out.println(groupSumClump.groupSumClump(0, new int[]{2, 4, 4, 8},14));
    }
}
