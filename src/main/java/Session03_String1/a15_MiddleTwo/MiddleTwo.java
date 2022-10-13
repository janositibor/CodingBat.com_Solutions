package Session03_String1.a15_MiddleTwo;

public class MiddleTwo {
    public String middleTwo(String str) {
        int halfLength=str.length()/2;
        return str.substring(halfLength-1,halfLength+1);
    }
}
