package Session16_Functional1.p04_Copies3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Copies3 copies3=new Copies3();

        System.out.println(copies3.copies3(Arrays.asList("a", "bb", "ccc")));
        System.out.println(copies3.copies3(Arrays.asList("24", "a", "")));
        System.out.println(copies3.copies3(Arrays.asList("hello", "there")));
    }
}
