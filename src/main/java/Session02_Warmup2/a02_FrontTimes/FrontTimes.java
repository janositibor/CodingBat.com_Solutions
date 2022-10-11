package Session02_Warmup2.a02_FrontTimes;

public class FrontTimes {
    public String frontTimes(String str, int n) {
        int lengthOfRepeatedPart=3;
        String stringToRepeat=str.length()>lengthOfRepeatedPart-1?str.substring(0,lengthOfRepeatedPart):str;
        return stringTimes(stringToRepeat,n);
    }

    public String stringTimes(String str, int n) {
        StringBuilder output=new StringBuilder();

        for(int i=1; i<=n; i++){
            output.append(str);
        }

        return output.toString();
    }
}
