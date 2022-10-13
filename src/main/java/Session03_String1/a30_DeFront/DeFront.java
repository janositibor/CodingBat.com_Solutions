package Session03_String1.a30_DeFront;

public class DeFront {
    public String deFront(String str) {
        String output="";
        for (int i=0;i<str.length();i++){
            if((i==0 && str.charAt(0)!='a') || (i==1 && str.charAt(1)!='b')){
                continue;
            }
            output+=String.valueOf(str.charAt(i));
        }
        return output;
    }
}
