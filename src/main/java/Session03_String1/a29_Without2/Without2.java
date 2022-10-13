package Session03_String1.a29_Without2;

public class Without2 {
    public String without2(String str) {
        if(str.length()<2 || !str.substring(0,2).equals(str.substring(str.length()-2))){
            return str;
        }
        return str.substring(2);
    }
}
