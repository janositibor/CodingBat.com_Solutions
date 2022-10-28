package Session12_Recursion1.p24_StringClean;

public class StringClean {
    public String stringClean(String str) {
        if(str.length()<2){
            return str;
        }
        while(2<=str.length() && str.charAt(0)==str.charAt(1)){
            str=str.substring(1);
        }
        return str.substring(0,1)+stringClean(str.substring(1));
    }
}
