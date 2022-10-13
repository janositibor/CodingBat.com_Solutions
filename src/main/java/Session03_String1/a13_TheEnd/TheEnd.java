package Session03_String1.a13_TheEnd;

public class TheEnd {
    public String theEnd(String str, boolean front) {
        return front?str.substring(0,1):str.substring(str.length()-1);
    }
}
