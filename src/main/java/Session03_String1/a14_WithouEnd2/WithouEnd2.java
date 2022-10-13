package Session03_String1.a14_WithouEnd2;

public class WithouEnd2 {
    public String withouEnd2(String str) {
        return str.length()<3?"":str.substring(1,str.length()-1);
    }
}
