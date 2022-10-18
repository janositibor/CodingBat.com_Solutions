package Session07_String2.p01_DoubleChar;

public class DoubleChar {
    public String doubleChar(String str) {
        String output="";
        for(int i=0;i<str.length();i++){
            output+=String.valueOf(str.charAt(i));
            output+=String.valueOf(str.charAt(i));
        }
        return output;
    }
}
