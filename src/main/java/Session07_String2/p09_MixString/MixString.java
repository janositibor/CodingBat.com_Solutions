package Session07_String2.p09_MixString;

public class MixString {
    public String mixString(String a, String b) {
        StringBuilder output=new StringBuilder();
        int lengthA=a.length();
        int lengthB=b.length();

        for (int i=0;i<Math.max(lengthA,lengthB);i++){
            if(i<lengthA){
                output.append(a.charAt(i));
            }
            if(i<lengthB){
                output.append(b.charAt(i));
            }
        }
        return output.toString();
    }
}
