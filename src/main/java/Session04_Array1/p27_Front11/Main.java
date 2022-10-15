package Session04_Array1.p27_Front11;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Front11 front11=new Front11();

        System.out.println(Arrays.toString(front11.front11(new int[]{1, 2, 3}, new int[]{7, 9, 8})));
        System.out.println(Arrays.toString(front11.front11(new int[]{1}, new int[]{2})));
        System.out.println(Arrays.toString(front11.front11(new int[]{1, 7}, new int[]{})));
        System.out.println(Arrays.toString(front11.front11(new int[]{}, new int[]{})));
        System.out.println(Arrays.toString(front11.front11(new int[]{}, new int[]{11})));
    }
}
