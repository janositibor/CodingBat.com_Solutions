package Session09_Array2.p26_TenRun;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        TenRun tenRun=new TenRun();

        System.out.println(Arrays.toString(tenRun.tenRun(new int[]{2, 10, 3, 4, 20, 5})));
        System.out.println(Arrays.toString(tenRun.tenRun(new int[]{10, 1, 20, 2})));
        System.out.println(Arrays.toString(tenRun.tenRun(new int[]{10, 1, 9, 20})));
    }
}
