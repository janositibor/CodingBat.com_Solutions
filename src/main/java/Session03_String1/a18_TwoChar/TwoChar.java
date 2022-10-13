package Session03_String1.a18_TwoChar;

public class TwoChar {
    public String twoChar(String str, int index) {
        return (index<0 || index>str.length()-2)?str.substring(0,2):str.substring(index,index+2);
    }
}
