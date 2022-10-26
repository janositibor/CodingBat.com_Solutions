package Session12_Recursion1.p12_ChangeXY;

public class ChangeXY {
    public String changeXY(String str) {
        String stringToFind="x";
        String stringToReplaceTo="y";
        String temp;
        if(str.length()==0){
            return "";
        }

        if(str.length()==1){
            return stringToFind.equals(str)?stringToReplaceTo:str;
        }
        temp=str.substring(0,1);
        return (stringToFind.equals(temp)?stringToReplaceTo:temp)+changeXY(str.substring(1));
    }
}
