package Session03_String1.a04_MakeOutWord;

public class MakeOutWord {
    public String makeOutWord(String out, String word) {
        return out.substring(0,2)+word+out.substring(out.length()-2);
    }
}
