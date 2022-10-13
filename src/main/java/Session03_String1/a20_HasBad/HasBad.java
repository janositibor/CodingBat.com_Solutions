package Session03_String1.a20_HasBad;

public class HasBad {
    public boolean hasBad(String str) {
        String stringToCheck="bad";
        int foundPosition=str.indexOf(stringToCheck);
        return (0<=foundPosition && foundPosition<=1);
    }
}
