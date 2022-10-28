package Session13_Recursion2.p04_GroupSum5;

public class Main {
    public static void main(String[] args) {
        GroupSum5 groupSum5=new GroupSum5();

        System.out.println(groupSum5.groupSum5(0, new int[]{2, 5, 10, 4},19));
        System.out.println(groupSum5.groupSum5(0, new int[]{2, 5, 10, 4},17));
        System.out.println(groupSum5.groupSum5(0, new int[]{2, 5, 10, 4},12));
        System.out.println(groupSum5.groupSum5(0, new int[]{2, 5, 4, 10},12));
        System.out.println(groupSum5.groupSum5(0, new int[]{1, 3, 5},5));
    }
}
