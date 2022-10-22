package Session11_AP1.p05_WordsCount;

public class Main {
    public static void main(String[] args) {
        WordsCount wordsCount=new WordsCount();

        System.out.println(wordsCount.wordsCount(new String[]{"a", "bb", "b", "ccc"},1));
        System.out.println(wordsCount.wordsCount(new String[]{"a", "bb", "b", "ccc"},3));
        System.out.println(wordsCount.wordsCount(new String[]{"a", "bb", "b", "ccc"},4));
    }
}
