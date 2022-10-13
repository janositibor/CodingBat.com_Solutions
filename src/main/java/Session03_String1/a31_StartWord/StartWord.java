package Session03_String1.a31_StartWord;

public class StartWord {
    public String startWord(String str, String word) {
        int length=word.length();
        if(word.length()>str.length()){
            return "";
        }
        String output=String.valueOf(str.charAt(0));
        if(length==1){
            return output;
        }
        for(int i=1;i<word.length();i++){
            if(str.charAt(i)!=word.charAt(i)){
                return "";
            }
            output+=String.valueOf(str.charAt(i));
        }
        return output;
    }
}
