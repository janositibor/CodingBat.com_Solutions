package Session03_String1.a04_MakeOutWord;

public class Main {
    public static void main(String[] args) {
        MakeOutWord makeOutWord=new MakeOutWord();

        System.out.println(makeOutWord.makeOutWord("<<>>", "Yay"));
        System.out.println(makeOutWord.makeOutWord("<<>>", "WooHoo"));
        System.out.println(makeOutWord.makeOutWord("[[]]", "word"));
    }
}
