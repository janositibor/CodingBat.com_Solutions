package Session07_String2.p13_PrefixAgain;

public class PrefixAgain {
    public boolean prefixAgain(String str, int n) {
        String prefix=str.substring(0,n);
        return str.lastIndexOf(prefix)>=n;
    }
}
