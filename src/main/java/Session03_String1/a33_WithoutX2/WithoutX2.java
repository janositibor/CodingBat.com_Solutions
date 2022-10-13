package Session03_String1.a33_WithoutX2;

public class WithoutX2 {
    public String withoutX2(String str) {
        String output="";
        for (int i=0;i<str.length();i++){
            if((i==0 || i==1) && str.charAt(i)=='x'){
                continue;
            }
            output+=String.valueOf(str.charAt(i));
        }
        return output;
    }
}
