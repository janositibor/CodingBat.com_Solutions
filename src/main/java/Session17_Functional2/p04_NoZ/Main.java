package Session17_Functional2.p04_NoZ;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        NoZ noZ=new NoZ();

        System.out.println(noZ.noZ(new ArrayList<>(Arrays.asList("aaa", "bbb", "aza"))));
        System.out.println(noZ.noZ(new ArrayList<>(Arrays.asList("hziz", "hzello", "hi"))));
        System.out.println(noZ.noZ(new ArrayList<>(Arrays.asList("hello", "howz", "are", "youz"))));
    }
}
