package Session11_AP1.p06_WordsFront;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        WordsFront wordsFront=new WordsFront();

        System.out.println(Arrays.toString(wordsFront.wordsFront(new String[]{"a", "b", "c", "d"},1)));
        System.out.println(Arrays.toString(wordsFront.wordsFront(new String[]{"a", "b", "c", "d"},2)));
        System.out.println(Arrays.toString(wordsFront.wordsFront(new String[]{"a", "b", "c", "d"},3)));
    }
}
