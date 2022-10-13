package Session03_String1.a32_WithoutX;

public class WithoutX {
    public String withoutX(String str) {
        String output="";
        for (int i=0;i<str.length();i++){
            if((i==0 || i==str.length()-1) && str.charAt(i)=='x'){
                continue;
            }
            output+=String.valueOf(str.charAt(i));
        }
        return output;
    }
}
