package Session07_String2.p15_GetSandwich;

public class GetSandwich {
    public String getSandwich(String str) {
        String stringToSeparate="bread";
        int firstIndex=str.indexOf(stringToSeparate);
        int lastIndex=str.lastIndexOf(stringToSeparate);
        if(firstIndex==lastIndex){
            return "";
        }
        return str.substring(firstIndex+stringToSeparate.length(),lastIndex);
    }
}
