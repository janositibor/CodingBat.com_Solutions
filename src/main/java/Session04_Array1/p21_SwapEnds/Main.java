package Session04_Array1.p21_SwapEnds;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SwapEnds swapEnds=new SwapEnds();

        System.out.println(Arrays.toString(swapEnds.swapEnds(new int[]{1, 2, 3, 4})));
        System.out.println(Arrays.toString(swapEnds.swapEnds(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(swapEnds.swapEnds(new int[]{8, 6, 7, 9, 5})));
    }
}
