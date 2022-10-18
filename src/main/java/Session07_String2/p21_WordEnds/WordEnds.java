package Session07_String2.p21_WordEnds;

public class WordEnds {
    public String wordEnds(String str, String word) {
        StringBuilder output=new StringBuilder();
        int index=0;
        int found=str.indexOf(word, index);
        while(found>-1){
            if(found>0){
                output.append(str.charAt(found-1));
            }
            if(found+word.length()<str.length()){
                output.append(str.charAt(found+word.length()));
            }
            index=found+word.length();
            found=str.indexOf(word, index);
        }
        return output.toString();
    }
}
