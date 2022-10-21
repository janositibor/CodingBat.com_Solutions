package Session09_Array2.p33_EvenOdd;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        EvenOdd evenOdd=new EvenOdd();

        System.out.println(Arrays.toString(evenOdd.evenOdd(new int[]{1, 0, 1, 0, 0, 1, 1})));
        System.out.println(Arrays.toString(evenOdd.evenOdd(new int[]{3, 3, 2})));
        System.out.println(Arrays.toString(evenOdd.evenOdd(new int[]{2, 2, 2})));
    }
}
