package Session01_Warmup1.a23_StartOz;

public class StartOz {
    public String startOz(String str) {
        String mask="oz";
        StringBuilder output=new StringBuilder();
        for(int i=0; i<Math.min(mask.length(),str.length());i++){
            if (str.charAt(i)==mask.charAt(i)){
                output.append(str.charAt(i));
            }
        }
        return output.toString();
    }
}
