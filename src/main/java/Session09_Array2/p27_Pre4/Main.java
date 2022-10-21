package Session09_Array2.p27_Pre4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Pre4 pre4=new Pre4();

        System.out.println(Arrays.toString(pre4.pre4(new int[]{1, 2, 4, 1})));
        System.out.println(Arrays.toString(pre4.pre4(new int[]{3, 1, 4})));
        System.out.println(Arrays.toString(pre4.pre4(new int[]{1, 4, 4, 1})));
        System.out.println(Arrays.toString(pre4.pre4(new int[]{1})));
        System.out.println(Arrays.toString(pre4.pre4(new int[]{})));
    }
}
