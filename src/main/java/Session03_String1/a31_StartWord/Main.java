package Session03_String1.a31_StartWord;

public class Main {
    public static void main(String[] args) {
        StartWord startWord=new StartWord();

        System.out.println(startWord.startWord("hippo", "hi"));
        System.out.println(startWord.startWord("hippo", "xip"));
        System.out.println(startWord.startWord("h", "ix"));
        System.out.println(startWord.startWord("", "i"));
        System.out.println(startWord.startWord("hippo", "i"));
    }
}
