package Session01_Warmup1.a30_EndUp;

public class EndUp {
    public String endUp(String str) {
        int numberOfCharsToUpperCase=3;

        int limit = str.length() > numberOfCharsToUpperCase-1?str.length() - numberOfCharsToUpperCase:0;
        String lastChars = str.substring(limit);

        return str.substring(0,limit)+lastChars.toUpperCase();
    }
}
