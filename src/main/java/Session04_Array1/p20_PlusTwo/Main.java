package Session04_Array1.p20_PlusTwo;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        PlusTwo plusTwo=new PlusTwo();

        System.out.println(Arrays.toString(plusTwo.plusTwo(new int[]{1, 2}, new int[]{3, 4})));
        System.out.println(Arrays.toString(plusTwo.plusTwo(new int[]{4, 4}, new int[]{2, 2})));
        System.out.println(Arrays.toString(plusTwo.plusTwo(new int[]{9, 2}, new int[]{3, 4})));
    }
}
