package Session07_String2.p05_EndOther;

import java.util.Locale;

public class EndOther {
    public boolean endOther(String a, String b) {
        if(a.length()>b.length()){
            return endWithIt(a,b);
        }
        if(a.length()<b.length()){
            return endWithIt(b,a);
        }
        return a.toLowerCase().equals(b.toLowerCase());
    }
    private boolean endWithIt(String a, String b){
        return(a.substring(a.length()-b.length()).toLowerCase().equals(b.toLowerCase()));
    }
}
