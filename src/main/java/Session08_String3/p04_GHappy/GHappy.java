package Session08_String3.p04_GHappy;

public class GHappy {
    public boolean gHappy(String str) {
        String stringToCheck=" "+str+" ";
        int fromIndex=stringToCheck.indexOf('g',0)+1;
        while(fromIndex>0){
            if(stringToCheck.charAt(fromIndex-2)!='g' && stringToCheck.charAt(fromIndex)!='g'){
                return false;
            }
            fromIndex=stringToCheck.indexOf('g',fromIndex)+1;
        }
        return true;
    }
}
