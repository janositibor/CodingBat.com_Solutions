package Session03_String1.a21_AtFirst;

public class AtFirst {
    public String atFirst(String str) {
        StringBuilder output=new StringBuilder("@@");
        for(int i=0;i<Math.min(2,str.length());i++){
            output.setCharAt(i, str.charAt(i));
        }
        return output.toString();
    }
}
