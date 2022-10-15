package Session04_Array1.p09_Sum2;

public class Main {
    public static void main(String[] args) {
        Sum2 sum2=new Sum2();

        System.out.println(sum2.sum2(new int[]{1, 2, 3}));
        System.out.println(sum2.sum2(new int[]{1, 2}));
        System.out.println(sum2.sum2(new int[]{1, -2}));
        System.out.println(sum2.sum2(new int[]{1, 1,1,1}));
        System.out.println(sum2.sum2(new int[]{10}));
        System.out.println(sum2.sum2(new int[]{}));
    }
}
