package Session12_Recursion1.p28_StrCount;

public class StrCount {
    public int strCount(String str, String sub) {
        int stringLength=str.length();
        int subLength=sub.length();
        int count=0;
        int step=1;
        if(stringLength<subLength){
            return 0;
        }
        if(sub.equals(str.substring(0,subLength))){
            count++;
            step=subLength;
        }
        return stringLength>subLength?count+strCount(str.substring(step),sub):count;
    }
}
