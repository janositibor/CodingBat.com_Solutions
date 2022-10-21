package Session09_Array2.p25_ShiftLeft;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ShiftLeft shiftLeft=new ShiftLeft();

        System.out.println(Arrays.toString(shiftLeft.shiftLeft(new int[]{6, 2, 5, 3})));
        System.out.println(Arrays.toString(shiftLeft.shiftLeft(new int[]{1, 2})));
        System.out.println(Arrays.toString(shiftLeft.shiftLeft(new int[]{1})));
        System.out.println(Arrays.toString(shiftLeft.shiftLeft(new int[]{})));
    }
}
