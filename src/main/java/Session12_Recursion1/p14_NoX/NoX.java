package Session12_Recursion1.p14_NoX;

public class NoX {
    public String noX(String str) {
        String stringToFind="x";
        String stringToReplaceTo="";
        String temp;
        if(str.length()==0){
            return "";
        }

        if(str.length()==1){
            return stringToFind.equals(str)?stringToReplaceTo:str;
        }
        temp=str.substring(0,1);
        return (stringToFind.equals(temp)?stringToReplaceTo:temp)+noX(str.substring(1));
    }
}
