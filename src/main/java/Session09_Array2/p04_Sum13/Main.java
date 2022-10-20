package Session09_Array2.p04_Sum13;

public class Main {
    public static void main(String[] args) {
        Sum13 sum13=new Sum13();

        System.out.println(sum13.sum13(new int[]{1, 2, 2, 1}));
        System.out.println(sum13.sum13(new int[]{1, 1}));
        System.out.println(sum13.sum13(new int[]{1, 2, 2, 1, 13}));
        System.out.println(sum13.sum13(new int[]{1, 2, 2, 1, 13, 100}));
        System.out.println(sum13.sum13(new int[]{1, 2, 13, 2, 1, 13}));
    }
}
