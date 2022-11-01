package Session17_Functional2.p02_No9;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        No9 no9=new No9();

        System.out.println(no9.no9(new ArrayList<>(Arrays.asList(1, 2, 19))));
        System.out.println(no9.no9(new ArrayList<>(Arrays.asList(9, 19, 29, 3))));
        System.out.println(no9.no9(new ArrayList<>(Arrays.asList(1, 2, 3))));
    }
}
