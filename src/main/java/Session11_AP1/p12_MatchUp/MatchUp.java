package Session11_AP1.p12_MatchUp;

public class MatchUp {
    public int matchUp(String[] a, String[] b) {
        int count=0;
        for (int i = 0; i < a.length; i++) {
            if(startWithTheSameChar(a[i],b[i])){
                count++;
            }
        }
        return count;
    }
    private boolean startWithTheSameChar(String a, String b){
        if(a.length()==0 || b.length()==0){
            return false;
        }
        return a.charAt(0)==b.charAt(0);
    }
}
