package Session16_Functional1.p06_Math1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Math1 math1=new Math1();

        System.out.println(math1.math1(Arrays.asList(1, 2, 3)));
        System.out.println(math1.math1(Arrays.asList(6, 8, 6, 8, 1)));
        System.out.println(math1.math1(Arrays.asList(10)));
    }
}
