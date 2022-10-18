package Session07_String2.p12_RepeatSeparator;

public class RepeatSeparator {
    public String repeatSeparator(String word, String sep, int count) {
        StringBuilder output=new StringBuilder();
        for(int i=0;i<count;i++){
            output.append(word);
            if(i<count-1){
                output.append(sep);
            }
        }
        return output.toString();
    }
}
