package Session08_String3.p03_EqualIsNot;

public class EqualIsNot {
    public boolean equalIsNot(String str) {
        return countStringInString(str,"is")==countStringInString(str,"not");
    }
    private int countStringInString(String str, String stringToSearch) {
        int count=0;
        int fromIndex=str.indexOf(stringToSearch,0)+1;
        while(fromIndex>0){
            count++;
            fromIndex=str.indexOf(stringToSearch,fromIndex)+1;
        }
        return count;
    }
}
