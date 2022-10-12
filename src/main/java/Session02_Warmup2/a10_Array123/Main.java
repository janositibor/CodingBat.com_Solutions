package Session02_Warmup2.a10_Array123;

public class Main {
    public static void main(String[] args) {
        Array123 array123=new Array123();

        System.out.println(array123.array123(new int[]{1, 1, 2, 3, 1}));
        System.out.println(array123.array123(new int[]{1, 1, 2, 4, 1}));
        System.out.println(array123.array123(new int[]{1, 1, 2, 1, 2, 3}));
        System.out.println(array123.array123(new int[]{1, 2, 3}));
        System.out.println(array123.array123(new int[]{1}));
        System.out.println(array123.array123(new int[]{}));
    }
}
