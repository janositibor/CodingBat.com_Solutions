package Session17_Functional2.p03_NoTeen;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        NoTeen noTeen=new NoTeen();

        System.out.println(noTeen.noTeen(new ArrayList<>(Arrays.asList(12, 13, 19, 20))));
        System.out.println(noTeen.noTeen(new ArrayList<>(Arrays.asList(1, 14, 1))));
        System.out.println(noTeen.noTeen(new ArrayList<>(Arrays.asList(15))));

    }
}
