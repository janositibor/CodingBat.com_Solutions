package Session07_String2.p14_XyzMiddle;

public class XyzMiddle {
    public boolean xyzMiddle(String str) {
        String stringToFind="xyz";
        String stringToScan;
        int length=str.length();
        if(length<stringToFind.length()){
            return false;
        }
        for (int i = 0; i < length; i++) {
            if((1.0*length-4)/2<=i && i<=(1.0*length-2)/2){
                stringToScan=str.substring(i,i+stringToFind.length());
                if(stringToFind.equals(stringToScan)){
                    return true;
                }
            }
        }
        return false;
    }
}
