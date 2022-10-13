package Session03_String1.a19_MiddleThree;

public class MiddleThree {
    public String middleThree(String str) {
        int middlePosition=(str.length()-1)/2;
        return str.substring(middlePosition-1,middlePosition+2);
    }
}
