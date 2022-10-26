package Session12_Recursion1.p13_ChangePi;

public class ChangePi {
    public String changePi(String str) {
        String stringToFind="pi";
        String stringToReplaceTo="3.14";
        String temp;

        if(str.length()<2){
            return str;
        }

        if(str.length()==2){
            return stringToFind.equals(str)?stringToReplaceTo:str;
        }
        temp=str.substring(0,2);
        if(stringToFind.equals(temp)){
            return stringToReplaceTo+changePi(str.substring(2));
        }
        else{
            return str.substring(0,1)+changePi(str.substring(1));
        }
    }
}
