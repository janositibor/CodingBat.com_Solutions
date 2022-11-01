package Session17_Functional2.p01_NoNeg;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        NoNeg noNeg=new NoNeg();

        System.out.println(noNeg.noNeg(new ArrayList<>(Arrays.asList(1, -2))));
        System.out.println(noNeg.noNeg(new ArrayList<>(Arrays.asList(-3, -3, 3, 3))));
        System.out.println(noNeg.noNeg(new ArrayList<>(Arrays.asList(-1, -1, -1))));
        System.out.println(noNeg.noNeg(new ArrayList<>(Arrays.asList(0))));
    }
}
