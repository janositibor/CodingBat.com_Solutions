package Session17_Functional2.p07_NoYY;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        NoYY noYY=new NoYY();

        System.out.println(noYY.noYY(new ArrayList<>(Arrays.asList("a", "b", "c"))));
        System.out.println(noYY.noYY(new ArrayList<>(Arrays.asList("a", "b", "cy"))));
        System.out.println(noYY.noYY(new ArrayList<>(Arrays.asList("xx", "ya", "zz"))));
    }
}
