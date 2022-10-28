package Session12_Recursion1.p26_ParenBit;

public class ParenBit {
    public String parenBit(String str) {
        int length=str.length();
        int start=0;
        int end=length;
        if(str.charAt(0)=='(' && str.charAt(length-1)==')'){
            return str;
        }
        if(str.charAt(0)!='('){
            start++;
        }
        if(str.charAt(length-1)!=')'){
            end--;
        }
        return parenBit(str.substring(start,end));
    }
}
