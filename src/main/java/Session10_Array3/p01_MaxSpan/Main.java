package Session10_Array3.p01_MaxSpan;

public class Main {
    public static void main(String[] args) {
        MaxSpan maxSpan=new MaxSpan();

        System.out.println(maxSpan.maxSpan(new int[]{1, 2, 1, 1, 3}));
        System.out.println(maxSpan.maxSpan(new int[]{1, 4, 2, 1, 4, 1, 4}));
        System.out.println(maxSpan.maxSpan(new int[]{1, 4, 2, 1, 4, 4, 4}));
        System.out.println(maxSpan.maxSpan(new int[]{1}));
        System.out.println(maxSpan.maxSpan(new int[]{}));
    }
}
