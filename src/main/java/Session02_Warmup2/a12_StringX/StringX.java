package Session02_Warmup2.a12_StringX;

public class StringX {
    public String stringX(String str) {
        Character charToDelete='x';
        int length=str.length();
        StringBuilder output=new StringBuilder();
        for(int i=0;i<length;i++){
            if(!charToDelete.equals(str.charAt(i)) || i==0 || i==length-1){
                output.append(str.charAt(i));
            }
        }
        return output.toString();
    }
}
