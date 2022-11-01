package Session16_Functional1.p01_Doubling;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Doubling doubling=new Doubling();

        System.out.println(doubling.doubling(Arrays.asList(1,2,3)));
        System.out.println(doubling.doubling(Arrays.asList(6, 8, 6, 8, -1)));
        System.out.println(doubling.doubling(Arrays.asList()));
    }
}
