package Session04_Array1.p16_Fix23;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Fix23 fix23=new Fix23();

        System.out.println(Arrays.toString(fix23.fix23(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(fix23.fix23(new int[]{2, 3, 5})));
        System.out.println(Arrays.toString(fix23.fix23(new int[]{1, 2, 1})));
    }
}
