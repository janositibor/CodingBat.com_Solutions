package Session09_Array2.p05_Sum67;

public class Main {
    public static void main(String[] args) {
        Sum67 sum67=new Sum67();

        System.out.println(sum67.sum67(new int[]{1, 2, 2}));
        System.out.println(sum67.sum67(new int[]{1, 2, 2, 6, 99, 99, 7}));
        System.out.println(sum67.sum67(new int[]{1, 1, 6, 7, 2}));
        System.out.println(sum67.sum67(new int[]{}));
        System.out.println(sum67.sum67(new int[]{6,7}));
    }
}
