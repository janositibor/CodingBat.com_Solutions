package Session02_Warmup2.a03_CountXX;

public class CountXX {
    public int countXX(String str) {
        String stringToSearch="xx";
        int numberOfOccurrence=0;

        for(int i=0;i<str.length()-1;i++){
            if (stringToSearch.equals(str.substring(i,i+stringToSearch.length()))){
                numberOfOccurrence++;
            }
        }
        return numberOfOccurrence;
    }
}
