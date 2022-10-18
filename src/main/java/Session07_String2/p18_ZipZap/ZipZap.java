package Session07_String2.p18_ZipZap;

public class ZipZap {
    public String zipZap(String str) {
        StringBuilder output=new StringBuilder();
        char charActual;
        for(int i=0;i<str.length();i++){
            charActual=str.charAt(i);
            output.append(charActual);
            if(i<str.length()-2 && charActual=='z' && str.charAt(i+2)=='p'){
                i++;
            }
        }
        return output.toString();
    }
}
