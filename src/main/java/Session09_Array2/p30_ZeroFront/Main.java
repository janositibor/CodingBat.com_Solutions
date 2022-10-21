package Session09_Array2.p30_ZeroFront;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ZeroFront zeroFront=new ZeroFront();

        System.out.println(Arrays.toString(zeroFront.zeroFront(new int[]{1, 0, 0, 1})));
        System.out.println(Arrays.toString(zeroFront.zeroFront(new int[]{0, 1, 1, 0, 1})));
        System.out.println(Arrays.toString(zeroFront.zeroFront(new int[]{1, 0})));
    }
}
