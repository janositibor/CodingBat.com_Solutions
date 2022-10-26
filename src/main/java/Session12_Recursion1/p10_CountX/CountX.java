package Session12_Recursion1.p10_CountX;

public class CountX {
    public int countX(String str) {
        int length=str.length();
        char charToFind='x';
        int doesMatchTheFirstChar=0;
        if(length>0) {
            doesMatchTheFirstChar = str.charAt(0) == charToFind ? 1 : 0;
        }
        if(length<2){
            return doesMatchTheFirstChar;
        }
        return doesMatchTheFirstChar+countX(str.substring(1));
    }
}
