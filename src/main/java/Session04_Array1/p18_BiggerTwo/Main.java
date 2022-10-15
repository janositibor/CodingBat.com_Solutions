package Session04_Array1.p18_BiggerTwo;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        BiggerTwo biggerTwo=new BiggerTwo();

        System.out.println(Arrays.toString(biggerTwo.biggerTwo(new int[]{1, 2},new int[]{3, 4})));
        System.out.println(Arrays.toString(biggerTwo.biggerTwo(new int[]{3, 4},new int[]{1, 2})));
        System.out.println(Arrays.toString(biggerTwo.biggerTwo(new int[]{1, 3},new int[]{0, 4})));
    }
}
