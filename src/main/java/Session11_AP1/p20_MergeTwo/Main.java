package Session11_AP1.p20_MergeTwo;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MergeTwo mergeTwo=new MergeTwo();

        System.out.println(Arrays.toString(mergeTwo.mergeTwo(new String[]{"a", "c", "z"},new String[]{"b", "f", "z"}, 3)));
        System.out.println(Arrays.toString(mergeTwo.mergeTwo(new String[]{"a", "c", "z"},new String[]{"c", "f", "z"}, 3)));
        System.out.println(Arrays.toString(mergeTwo.mergeTwo(new String[]{"f", "g", "z"},new String[]{"c", "f", "g"}, 3)));
    }
}
