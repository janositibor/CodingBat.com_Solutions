package Session07_String2.p20_PlusOut;

public class PlusOut {
    public String plusOut(String str, String word) {
        StringBuilder output=new StringBuilder();
        int index=0;
        while(index<str.length()){
            if(index<str.length()-word.length()+1 && word.equals(str.substring(index,index+word.length()))){
                output.append(word);
                index+=word.length();
            }
            else {
                output.append('+');
                index++;
            }
        }
        return output.toString();
    }
}
