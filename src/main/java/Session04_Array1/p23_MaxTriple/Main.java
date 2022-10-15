package Session04_Array1.p23_MaxTriple;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MaxTriple maxTriple=new MaxTriple();

        System.out.println(maxTriple.maxTriple(new int[]{1, 2, 3}));
        System.out.println(maxTriple.maxTriple(new int[]{1, 5, 3}));
        System.out.println(maxTriple.maxTriple(new int[]{5, 2, 3}));
        System.out.println(maxTriple.maxTriple(new int[]{5, 6, 2, 3, 9}));
    }
}
