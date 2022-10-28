package Session12_Recursion1.p29_StrCopies;

public class StrCopies {
    public boolean strCopies(String str, String sub, int n) {
        int stringLength=str.length();
        int subLength=sub.length();
        int step=1;
        if(n<1){
            return true;
        }
        if(stringLength<subLength){
            return false;
        }
        if(sub.equals(str.substring(0,subLength))){
            n--;
        }
        return stringLength>subLength?strCopies(str.substring(1),sub,n):n<1;
    }
}
