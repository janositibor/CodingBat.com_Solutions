package Session12_Recursion1.p30_StrDist;

public class StrDist {
    public int strDist(String str, String sub) {
        int stringLength=str.length();
        int subLength=sub.length();
        int start=0;
        int end=stringLength;

        if(stringLength<subLength){
            return 0;
        }
        if(sub.equals(str.substring(0,subLength)) && sub.equals(str.substring(stringLength-subLength))){
            return stringLength;
        }
        if(!sub.equals(str.substring(0,subLength))){
            start++;
        }
        if(!sub.equals(str.substring(stringLength-subLength))){
            end--;
        }
        if(start>end){
            return 0;
        }
        return strDist(str.substring(start,end),sub);
    }
}
