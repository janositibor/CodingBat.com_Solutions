package Session07_String2.p10_RepeatEnd;

public class RepeatEnd {
    public String repeatEnd(String str, int n) {
        StringBuilder output=new StringBuilder();
        String stringToRepeat=str.substring(str.length()-n);
        for(int i=0;i<n;i++){
            output.append(stringToRepeat);
        }
        return output.toString();
    }
}
