package Session01_Warmup1.a16_StartHi;

public class StartHi {
    public boolean startHi(String str) {
        return (str!=null)&&(str.length()>1)&&("hi".equals(str.substring(0,2)));
    }
}
