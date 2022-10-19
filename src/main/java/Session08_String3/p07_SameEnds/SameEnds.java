package Session08_String3.p07_SameEnds;

public class SameEnds {
    public String sameEnds(String string) {
        int length=string.length();
        int resultLength=length/2;
        while(resultLength>0){
            if(string.substring(0,resultLength).equals(string.substring(length-resultLength))){
                return string.substring(0,resultLength);
            }
            resultLength--;
        }
        return "";
    }
}
