package Session07_String2.p21_WordEnds;

public class Main {
    public static void main(String[] args) {
        WordEnds wordEnds=new WordEnds();

        System.out.println(wordEnds.wordEnds("abcXY123XYijk", "XY"));
        System.out.println(wordEnds.wordEnds("XY123XY", "XY"));
        System.out.println(wordEnds.wordEnds("XY1XY", "XY"));
    }
}
