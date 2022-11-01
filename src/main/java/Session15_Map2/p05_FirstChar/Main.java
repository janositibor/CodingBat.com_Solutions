package Session15_Map2.p05_FirstChar;

public class Main {
    public static void main(String[] args) {
        FirstChar firstChar=new FirstChar();

        System.out.println(firstChar.firstChar(new String[]{"salt", "tea", "soda", "toast"}));
        System.out.println(firstChar.firstChar(new String[]{"aa", "bb", "cc", "aAA", "cCC", "d"}));
        System.out.println(firstChar.firstChar(new String[]{}));
    }
}
