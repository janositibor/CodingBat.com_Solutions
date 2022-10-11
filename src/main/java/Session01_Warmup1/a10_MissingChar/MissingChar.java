package Session01_Warmup1.a10_MissingChar;

public class MissingChar {
    public String missingChar(String str, int n) {
        return(str.substring(0,n)+(str.substring(n+1)));
    }
}
