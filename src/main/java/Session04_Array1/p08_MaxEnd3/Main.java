package Session04_Array1.p08_MaxEnd3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MaxEnd3 maxEnd3=new MaxEnd3();

        System.out.println(Arrays.toString(maxEnd3.maxEnd3(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(maxEnd3.maxEnd3(new int[]{11, 5, 9})));
        System.out.println(Arrays.toString(maxEnd3.maxEnd3(new int[]{2, 11, 3})));
    }
}
