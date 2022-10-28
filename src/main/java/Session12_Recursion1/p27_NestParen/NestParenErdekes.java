package Session12_Recursion1.p27_NestParen;

public class NestParenErdekes {
    public boolean nestParenErdekes(String str) {
        int length=str.length();
        int start=0;
        int end=length-1;
        if(length==0){
            return true;
        }
        while(start<end && str.charAt(start)!='('){
            start++;
        }
        while(start<end && str.charAt(end)!=')'){
            end--;
        }
        if(str.charAt(start)=='(' || str.charAt(end)==')'){
            if(str.charAt(start)=='(' && str.charAt(end)==')'){
                return nestParenErdekes(str.substring(start+1,end));
            }
            return false;
        }
        return true;

    }
}
