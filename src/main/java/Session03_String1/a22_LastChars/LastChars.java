package Session03_String1.a22_LastChars;

public class LastChars {
    public String lastChars(String a, String b) {
        return (a.length()>0?String.valueOf(a.charAt(0)):"@")+(b.length()>0?String.valueOf(b.charAt(b.length()-1)):"@");
    }
}
