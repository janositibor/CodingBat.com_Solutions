package Session02_Warmup2.a05_StringBits;

public class StringBits {
    public String stringBits(String str) {
        StringBuilder output=new StringBuilder();

        for(int i=0; i<str.length();i+=2){
            output.append(str.charAt(i));
        }
        return output.toString();
    }
}
