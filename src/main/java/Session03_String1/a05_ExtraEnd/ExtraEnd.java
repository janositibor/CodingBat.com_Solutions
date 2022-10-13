package Session03_String1.a05_ExtraEnd;

public class ExtraEnd {
    public String extraEnd(String str) {
        String stringToRepeat=str.substring(str.length()-2);
        return stringToRepeat+stringToRepeat+stringToRepeat;
    }
}
