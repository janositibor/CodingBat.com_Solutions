package Session02_Warmup2.a06_StringSplosion;

public class StringSplosion {
    public String stringSplosion(String str) {
        StringBuilder output=new StringBuilder();
        for(int i=0;i<str.length();i++){
            output.append(str.substring(0,i+1));
        }
        return output.toString();
    }
}
