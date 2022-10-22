package Session11_AP1.p07_WordsWithoutList;

public class Main {
    public static void main(String[] args) {
        WordsWithoutList wordsWithoutList=new WordsWithoutList();

        System.out.println(wordsWithoutList.wordsWithoutList(new String[]{"a", "bb", "b", "ccc"},1));
        System.out.println(wordsWithoutList.wordsWithoutList(new String[]{"a", "bb", "b", "ccc"},3));
        System.out.println(wordsWithoutList.wordsWithoutList(new String[]{"a", "bb", "b", "ccc"},4));
    }
}
