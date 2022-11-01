package Session15_Map2.p07_WordMultiple;

public class Main {
    public static void main(String[] args) {
        WordMultiple wordMultiple=new WordMultiple();

        System.out.println(wordMultiple.wordMultiple(new String[]{"a", "b", "a", "c", "b"}));
        System.out.println(wordMultiple.wordMultiple(new String[]{"c", "b", "a"}));
        System.out.println(wordMultiple.wordMultiple(new String[]{"c", "c", "c", "c"}));
    }
}
