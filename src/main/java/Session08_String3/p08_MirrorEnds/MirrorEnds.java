package Session08_String3.p08_MirrorEnds;

public class MirrorEnds {
    public String mirrorEnds(String string) {
        int length=string.length();
        int index=0;
        while(index<length){
            if(string.charAt(index)!=string.charAt(length-index-1)){
                break;
            }
            index++;
        }
        return string.substring(0,index);
    }
}
