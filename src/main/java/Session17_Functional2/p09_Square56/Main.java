package Session17_Functional2.p09_Square56;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Square56 square56=new Square56();

        System.out.println(square56.square56(new ArrayList<>(Arrays.asList(3, 1, 4))));
        System.out.println(square56.square56(new ArrayList<>(Arrays.asList(1))));
        System.out.println(square56.square56(new ArrayList<>(Arrays.asList(2))));
    }
}
