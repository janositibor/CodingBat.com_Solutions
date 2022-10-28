package Session12_Recursion1.p27_NestParen;

public class NestParen {
    public boolean nestParen(String str) {
        int length=str.length();
        if(length==0){
            return true;
        }
        if(str.charAt(0)=='(' && str.charAt(length-1)==')'){
            return nestParen(str.substring(1,length-1));
        }
        return false;
    }
}
