package Session07_String2.p19_StarOut;

public class StarOut {
    public String starOut(String str) {
        StringBuilder output=new StringBuilder();
        String charTemp="";
        boolean ignoreNext=false;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!='*'){
                output.append(charTemp);
                if(!ignoreNext) {
                    charTemp = String.valueOf(str.charAt(i));
                }
                ignoreNext=false;
            }
            else{
                charTemp="";
                ignoreNext=true;
            }
        }
        output.append(charTemp);

        return output.toString();
    }
}
