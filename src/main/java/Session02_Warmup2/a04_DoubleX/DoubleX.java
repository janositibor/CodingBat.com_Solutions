package Session02_Warmup2.a04_DoubleX;

public class DoubleX {
    boolean doubleX(String str) {
        Character characterToCheck='x';
        int firstOccurrence=str.indexOf(characterToCheck);
        if(firstOccurrence<0 || firstOccurrence==str.length()-1){
            return false;
        }
        return characterToCheck.equals(str.charAt(firstOccurrence+1));
    }
}
