package Session04_Array1.p26_Make2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Make2 make2=new Make2();

        System.out.println(Arrays.toString(make2.make2(new int[]{4, 5},new int[]{1,2,3})));
        System.out.println(Arrays.toString(make2.make2(new int[]{4},new int[]{1,2,3})));
        System.out.println(Arrays.toString(make2.make2(new int[]{},new int[]{1,2,3})));
    }
}
