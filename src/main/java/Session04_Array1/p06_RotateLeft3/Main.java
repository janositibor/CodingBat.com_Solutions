package Session04_Array1.p06_RotateLeft3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        RotateLeft3 rotateLeft3=new RotateLeft3();

        System.out.println(Arrays.toString(rotateLeft3.rotateLeft3(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(rotateLeft3.rotateLeft3(new int[]{5, 11, 9})));
        System.out.println(Arrays.toString(rotateLeft3.rotateLeft3(new int[]{})));
        System.out.println(Arrays.toString(rotateLeft3.rotateLeft3(new int[]{1})));
        System.out.println(Arrays.toString(rotateLeft3.rotateLeft3(new int[]{7, 0, 0})));
    }
}
