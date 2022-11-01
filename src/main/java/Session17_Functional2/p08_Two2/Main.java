package Session17_Functional2.p08_Two2;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Two2 two2=new Two2();

        System.out.println(two2.two2(new ArrayList<>(Arrays.asList(1, 2, 3))));
        System.out.println(two2.two2(new ArrayList<>(Arrays.asList(2, 6, 11))));
        System.out.println(two2.two2(new ArrayList<>(Arrays.asList(0))));
    }
}
