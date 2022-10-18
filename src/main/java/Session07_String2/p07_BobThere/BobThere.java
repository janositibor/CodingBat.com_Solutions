package Session07_String2.p07_BobThere;

public class BobThere {
    public boolean bobThere(String str) {
        String stringToSearch="bob";
        for(int i=0; i<str.length()-stringToSearch.length()+1;i++){
            if(str.charAt(i)==stringToSearch.charAt(0) && str.charAt(i+2)==stringToSearch.charAt(2)){
                return true;
            }
        }
        return false;
    }
}
