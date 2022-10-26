package Session12_Recursion1.p15_Array6;

public class Main {
    public static void main(String[] args) {
        Array6 array6=new Array6();

        System.out.println(array6.array6(new int[]{1, 6, 4},0));
        System.out.println(array6.array6(new int[]{1, 4},0));
        System.out.println(array6.array6(new int[]{6},0));
        System.out.println(array6.array6(new int[]{},0));
        System.out.println(array6.array6(new int[]{1},0));
    }
}
