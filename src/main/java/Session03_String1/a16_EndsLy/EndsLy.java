package Session03_String1.a16_EndsLy;

public class EndsLy {
    public boolean endsLy(String str) {
        String stringToCheck="ly";
        if(str.length()<2){
            return false;
        }
        if(stringToCheck.equals(str.substring(str.length()-2))){
            return true;
        }
        return false;
    }
}
