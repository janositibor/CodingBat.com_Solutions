package Session04_Array1.p07_Reverse3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Reverse3 reverse3=new Reverse3();

        System.out.println(Arrays.toString(reverse3.reverse3(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(reverse3.reverse3(new int[]{5, 11, 9})));
        System.out.println(Arrays.toString(reverse3.reverse3(new int[]{7, 0, 0})));
        System.out.println(Arrays.toString(reverse3.reverse3(new int[]{})));
        System.out.println(Arrays.toString(reverse3.reverse3(new int[]{7})));
    }
}
