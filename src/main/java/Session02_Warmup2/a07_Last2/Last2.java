package Session02_Warmup2.a07_Last2;

public class Last2 {
    public int last2(String str) {
        int numberOfLastCharacters=2;
        if(str.length()<2*numberOfLastCharacters){
            return 0;
        }

        return countOccurrence(str.substring(0, str.length()+1-numberOfLastCharacters),str.substring(str.length()-numberOfLastCharacters));
    }

    public int countOccurrence(String str, String stringToCount) {
        int numberOfOccurrence=0;

        for(int i=0;i<str.length()-1;i++){
            if (stringToCount.equals(str.substring(i,i+stringToCount.length()))){
                numberOfOccurrence++;
            }
        }
        return numberOfOccurrence;
    }
}
