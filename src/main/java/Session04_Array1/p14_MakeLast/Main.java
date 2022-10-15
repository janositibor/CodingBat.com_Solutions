package Session04_Array1.p14_MakeLast;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MakeLast makeLast=new MakeLast();

        System.out.println(Arrays.toString(makeLast.makeLast(new int[]{4, 5, 6})));
        System.out.println(Arrays.toString(makeLast.makeLast(new int[]{1, 2})));
        System.out.println(Arrays.toString(makeLast.makeLast(new int[]{3})));
    }
}
