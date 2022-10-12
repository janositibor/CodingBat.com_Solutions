package Session02_Warmup2.a14_StringYak;

public class StringYak {
    public String stringYak(String str) {
        StringBuilder output=new StringBuilder();
        int i=0;
        while(i<str.length()){
            if(i+2<str.length() && str.charAt(i)=='y' && str.charAt(i+2)=='k'){
                i+=3;
                continue;
            }
            output.append(str.charAt(i));
            i++;
        }
        return output.toString();
    }
}
