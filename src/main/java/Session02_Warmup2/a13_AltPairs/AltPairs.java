package Session02_Warmup2.a13_AltPairs;

public class AltPairs {
    public String altPairs(String str) {
        StringBuilder output=new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(i%4==0||i%4==1){
                output.append(str.charAt(i));
            }
        }
        return output.toString();
    }
}
