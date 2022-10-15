package Session04_Array1.p19_MakeMiddle;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MakeMiddle makeMiddle=new MakeMiddle();

        System.out.println(Arrays.toString(makeMiddle.makeMiddle(new int[]{1, 2, 3, 4})));
        System.out.println(Arrays.toString(makeMiddle.makeMiddle(new int[]{7, 1, 2, 3, 4, 9})));
        System.out.println(Arrays.toString(makeMiddle.makeMiddle(new int[]{1, 2})));
    }
}
