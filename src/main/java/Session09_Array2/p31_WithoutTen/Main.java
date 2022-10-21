package Session09_Array2.p31_WithoutTen;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        WithoutTen withoutTen=new WithoutTen();

        System.out.println(Arrays.toString(withoutTen.withoutTen(new int[]{1, 10, 10, 2})));
        System.out.println(Arrays.toString(withoutTen.withoutTen(new int[]{10, 2, 10})));
        System.out.println(Arrays.toString(withoutTen.withoutTen(new int[]{1, 99, 10})));
    }
}
