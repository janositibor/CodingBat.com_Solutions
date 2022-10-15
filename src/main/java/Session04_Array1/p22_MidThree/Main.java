package Session04_Array1.p22_MidThree;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MidThree midThree=new MidThree();

        System.out.println(Arrays.toString(midThree.midThree(new int[]{1, 2, 3, 4, 5})));
        System.out.println(Arrays.toString(midThree.midThree(new int[]{8, 6, 7, 5, 3, 0, 9})));
        System.out.println(Arrays.toString(midThree.midThree(new int[]{1, 2, 3})));
    }
}
