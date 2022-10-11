package Session01_Warmup1.a13_BackAround;

public class BackAround {
    public String backAround(String str) {
        return str.charAt(str.length()-1)+str+str.charAt(str.length()-1);
    }
}
