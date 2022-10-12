package Session02_Warmup2.a11_StringMatch;

public class StringMatch {
    public int stringMatch(String a, String b) {
        int numberOfMatch=0;
        int lengthOfShorter=a.length()<=b.length()?a.length():b.length();
        if(lengthOfShorter<2){
            return 0;
        }
        for(int i=0;i<lengthOfShorter-1;i++){
            if(a.charAt(i)==b.charAt(i) && a.charAt(i+1)==b.charAt(i+1)){
                numberOfMatch++;
            }
        }
        return numberOfMatch;
    }
}
