package Session02_Warmup2.a01_StringTimes;

public class StringTimes {
    public String stringTimes(String str, int n) {
        StringBuilder output=new StringBuilder();

        for(int i=1; i<=n; i++){
            output.append(str);
        }

        return output.toString();
    }
}
