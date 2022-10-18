package Session07_String2.p06_XyzThere;

public class XyzThere {
    public boolean xyzThere(String str) {
        String stringToSearch="xyz";
        for(int i=0; i<str.length()-stringToSearch.length()+1;i++){
            if(str.substring(i,i+stringToSearch.length()).equals(stringToSearch) && (i==0 || str.charAt(i-1)!='.')){
                return true;
            }
        }
        return false;
    }
}