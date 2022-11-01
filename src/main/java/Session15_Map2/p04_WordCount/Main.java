package Session15_Map2.p04_WordCount;

public class Main {
    public static void main(String[] args) {
        WordCount wordCount=new WordCount();

        System.out.println(wordCount.wordCount(new String[]{"a", "b", "a", "c", "b"}));
        System.out.println(wordCount.wordCount(new String[]{"c", "b", "a"}));
        System.out.println(wordCount.wordCount(new String[]{"c", "c", "c", "c"}));
        System.out.println(wordCount.wordCount(new String[]{}));
    }
}
