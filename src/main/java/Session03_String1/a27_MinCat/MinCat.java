package Session03_String1.a27_MinCat;

public class MinCat {
    public String minCat(String a, String b) {
        int length=Math.min(a.length(),b.length());

        return a.substring(a.length()-length)+b.substring(b.length()-length);
    }
}
