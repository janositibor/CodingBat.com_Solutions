package Session01_Warmup1.a09_NotString;

public class NotString {
    public String notString(String str) {
        return(str.length()>=3&&str.substring(0,3).equals("not")?str:"not "+str);
    }
}
