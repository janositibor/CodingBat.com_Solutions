package Session12_Recursion1.p21_CountPairs;

public class CountPairs {
    public int countPairs(String str) {
        int length=str.length();
        int count=0;
        if(length<3){
            return 0;
        }
        if(str.charAt(0)==str.charAt(2)){
            count++;
        }
        return count+countPairs(str.substring(1));
    }
}
