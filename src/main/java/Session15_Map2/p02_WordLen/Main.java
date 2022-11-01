package Session15_Map2.p02_WordLen;

public class Main {
    public static void main(String[] args) {
        WordLen wordLen=new WordLen();

        System.out.println(wordLen.wordLen(new String[]{"a", "bb", "a", "bb"}));
        System.out.println(wordLen.wordLen(new String[]{"this", "and", "that", "and"}));
        System.out.println(wordLen.wordLen(new String[]{"code", "code", "code", "bug"}));
    }
}
