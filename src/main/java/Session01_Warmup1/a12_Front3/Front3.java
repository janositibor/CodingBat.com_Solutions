package Session01_Warmup1.a12_Front3;

public class Front3 {
    public String front3(String str) {
        return (str.length()>3?str.substring(0,3):str).repeat(3);
    }
}
