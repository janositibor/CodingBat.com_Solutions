package Session07_String2.p04_CountCode;

public class CountCode {
    public int countCode(String str) {
        String stringToSearch="code";
        int count=0;
        for(int i=0; i<str.length()-stringToSearch.length()+1;i++){
            if(str.charAt(i)==stringToSearch.charAt(0) && str.charAt(i+1)==stringToSearch.charAt(1) && str.charAt(i+3)==stringToSearch.charAt(3)){
               count++;
               i+=3;
            }
        }
        return count;
    }
}
