package Session11_AP1.p14_WordsWithout;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        WordsWithout wordsWithout=new WordsWithout();

        System.out.println(Arrays.toString(wordsWithout.wordsWithout(new String[]{"a", "b", "c", "a"},"a")));
        System.out.println(Arrays.toString(wordsWithout.wordsWithout(new String[]{"a", "b", "c", "a"},"b")));
        System.out.println(Arrays.toString(wordsWithout.wordsWithout(new String[]{"a", "b", "c", "a"},"c")));
        System.out.println(Arrays.toString(wordsWithout.wordsWithout(new String[]{"a", "b", "c", "a"},"d")));
    }
}
