package Session07_String2.p02_CountHi;

public class CountHi {
    public int countHi(String str) {
        String stringToSearch="hi";
        int count=0;
        int fromIndex=str.indexOf(stringToSearch,0)+1;
        while(fromIndex>0){
            count++;
            fromIndex=str.indexOf(stringToSearch,fromIndex)+1;
        }
        return count;
    }
}
