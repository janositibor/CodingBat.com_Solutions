package Session03_String1.a28_ExtraFront;

public class ExtraFront {
    public String extraFront(String str) {
        int length=Math.min(2,str.length());
        String stringToRepeat=str.substring(0,length);
        return stringToRepeat+stringToRepeat+stringToRepeat;
    }
}
