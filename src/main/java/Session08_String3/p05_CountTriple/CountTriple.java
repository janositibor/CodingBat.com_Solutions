package Session08_String3.p05_CountTriple;

public class CountTriple {
    public int countTriple(String str) {
        int repetitionNumber=3;
        int count=0;
        boolean repeated;
        int index;
        if(str.length()<repetitionNumber){
            return count;
        }
        for(int i=0;i<=(str.length()-repetitionNumber);i++){
            if(isRepeated(str.substring(i,i+repetitionNumber))){
                count++;
            }
        }
        return count;
    }
    private boolean isRepeated(String str){
        for(int i=1; i<str.length();i++){
            if(str.charAt(0)!=str.charAt(i)){
                return false;
            }
        }
        return true;
    }
}
