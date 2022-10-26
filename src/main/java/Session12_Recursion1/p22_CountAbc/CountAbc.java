package Session12_Recursion1.p22_CountAbc;

public class CountAbc {
    public int countAbc(String str) {
        String stringToFind1="abc";
        String stringToFind2="aba";
        int length=str.length();
        int count=0;
        if(length<3){
            return 0;
        }
        if(stringToFind1.equals(str.substring(0,3)) || stringToFind2.equals(str.substring(0,3))){
            count++;
        }
        return count+countAbc(str.substring(1));
    }
}
