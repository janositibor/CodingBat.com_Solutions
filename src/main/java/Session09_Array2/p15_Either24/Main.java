package Session09_Array2.p15_Either24;

public class Main {
    public static void main(String[] args) {
        Either24 either24=new Either24();

        System.out.println(either24.either24(new int[]{1, 2, 2}));
        System.out.println(either24.either24(new int[]{4, 4, 1}));
        System.out.println(either24.either24(new int[]{4, 4, 1, 2, 2}));
    }
}
