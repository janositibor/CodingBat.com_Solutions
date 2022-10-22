package Session10_Array3.p02_Fix34;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Fix34 fix34=new Fix34();

        System.out.println(Arrays.toString(fix34.fix34(new int[]{1, 3, 1, 4})));
        System.out.println(Arrays.toString(fix34.fix34(new int[]{1, 3, 1, 4, 4, 3, 1})));
        System.out.println(Arrays.toString(fix34.fix34(new int[]{3, 2, 2, 4})));
        System.out.println(Arrays.toString(fix34.fix34(new int[]{5, 3, 5, 4, 5, 4, 5, 4, 3, 5, 3, 5})));
        System.out.println(Arrays.toString(fix34.fix34(new int[]{3, 4, 1})));
    }
}
