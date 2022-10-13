package Session03_String1.a17_NTwice;

public class NTwice {
    public String nTwice(String str, int n) {
        return str.substring(0,n)+str.substring(str.length()-n);
    }
}
