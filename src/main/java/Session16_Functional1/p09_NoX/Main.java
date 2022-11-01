package Session16_Functional1.p09_NoX;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        NoX nox=new NoX();

        System.out.println(nox.noX(Arrays.asList("ax", "bb", "cx")));
        System.out.println(nox.noX(Arrays.asList("xxax", "xbxbx", "xxcx")));
        System.out.println(nox.noX(Arrays.asList("x")));
    }
}
