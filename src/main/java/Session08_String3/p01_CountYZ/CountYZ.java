package Session08_String3.p01_CountYZ;

import java.util.Locale;

public class CountYZ {
    public int countYZ(String str) {
        str=str.toLowerCase();
        int count=0;
        char charActual;
        for(int i=0;i<str.length();i++){
            charActual=str.charAt(i);
            if(charActual=='y' || charActual=='z'){
                if(i==str.length()-1 || !Character.isAlphabetic(str.charAt(i+1))){
                    count++;
                }
            }
        }
        return count;
    }
}
