package Session07_String2.p03_CatDog;

public class CatDog {
    public boolean catDog(String str) {
        return countStringInString(str,"cat")==countStringInString(str,"dog");
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
