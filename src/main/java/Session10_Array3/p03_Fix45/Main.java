package Session10_Array3.p03_Fix45;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Fix45 fix45=new Fix45();

        System.out.println(Arrays.toString(fix45.fix45(new int[]{5, 4, 9, 4, 9, 5})));
        System.out.println(Arrays.toString(fix45.fix45(new int[]{1, 4, 1, 5})));
        System.out.println(Arrays.toString(fix45.fix45(new int[]{1, 4, 1, 5, 5, 4, 1})));
        System.out.println(Arrays.toString(fix45.fix45(new int[]{1, 4, 5, 5, 4, 1})));
        System.out.println(Arrays.toString(fix45.fix45(new int[]{4, 5})));
        System.out.println(Arrays.toString(fix45.fix45(new int[]{5, 4, 1})));
    }
}
