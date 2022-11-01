package Session17_Functional2.p06_No34;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        No34 no34=new No34();

        System.out.println(no34.no34(new ArrayList<>(Arrays.asList("a", "bb", "ccc"))));
        System.out.println(no34.no34(new ArrayList<>(Arrays.asList("a", "bb", "ccc", "dddd"))));
        System.out.println(no34.no34(new ArrayList<>(Arrays.asList("ccc", "dddd", "apple"))));
    }
}
