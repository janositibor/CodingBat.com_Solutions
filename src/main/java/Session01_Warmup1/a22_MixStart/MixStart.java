package Session01_Warmup1.a22_MixStart;

public class MixStart {
    public boolean mixStart(String str) {
        return str!=null && str.length()>=3 && "ix".equals(str.substring(1,3));
    }
}
