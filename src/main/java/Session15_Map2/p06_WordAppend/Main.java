package Session15_Map2.p06_WordAppend;

public class Main {
    public static void main(String[] args) {
        WordAppend wordAppend=new WordAppend();

        System.out.println(wordAppend.wordAppend(new String[]{"a", "b", "a"}));
        System.out.println(wordAppend.wordAppend(new String[]{"a", "b", "a", "c", "a", "d", "a"}));
        System.out.println(wordAppend.wordAppend(new String[]{"a", "", "a"}));
    }
}
