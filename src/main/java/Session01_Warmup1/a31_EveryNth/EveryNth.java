package Session01_Warmup1.a31_EveryNth;

public class EveryNth {
    public String everyNth(String str, int n) {
        StringBuilder output=new StringBuilder("");

        for (int i=0; i<str.length(); i+=n){
            output.append(str.charAt(i));
        }
        return output.toString();
    }
}
