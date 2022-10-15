package Session04_Array1.p11_MakeEnds;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MakeEnds makeEnds=new MakeEnds();

        System.out.println(Arrays.toString(makeEnds.makeEnds(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(makeEnds.makeEnds(new int[]{1, 2, 3, 4})));
        System.out.println(Arrays.toString(makeEnds.makeEnds(new int[]{7, 4, 6, 2})));
        System.out.println(Arrays.toString(makeEnds.makeEnds(new int[]{9})));
    }
}
