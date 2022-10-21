package Session09_Array2.p32_ZeroMax;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ZeroMax zeroMax=new ZeroMax();

        System.out.println(Arrays.toString(zeroMax.zeroMax(new int[]{0, 5, 0, 3})));
        System.out.println(Arrays.toString(zeroMax.zeroMax(new int[]{0, 4, 0, 3})));
        System.out.println(Arrays.toString(zeroMax.zeroMax(new int[]{0, 1, 0})));
    }
}
