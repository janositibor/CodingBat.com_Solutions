package Session12_Recursion1.p11_CountHi;

public class CountHi {
    public int countHi(String str) {
        int length=str.length();
        String stringToFind="hi";
        int doMatchTheFirstChars=0;
        if(length>1) {
            doMatchTheFirstChars = stringToFind.equals(str.substring(0,2))? 1 : 0;
        }
        if(length<3){
            return doMatchTheFirstChars;
        }
        return doMatchTheFirstChars+countHi(str.substring(1));
    }
}
