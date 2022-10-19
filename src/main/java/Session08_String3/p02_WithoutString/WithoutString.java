package Session08_String3.p02_WithoutString;

import java.util.Locale;

public class WithoutString {
    public String withoutString(String base, String remove) {
        StringBuilder output=new StringBuilder();
        String baseToCheck=base.toLowerCase();
        String removeToCheck=remove.toLowerCase();
        int baseLength=base.length();
        int removeLength=remove.length();

        for(int i=0;i<baseLength;i++){
            if(i+removeLength<=baseLength && removeToCheck.equals(baseToCheck.substring(i,i+removeLength))){
                i+=(removeLength-1);
            }
            else{
                output.append(base.charAt(i));
            }
        }
        return output.toString();
    }
}
