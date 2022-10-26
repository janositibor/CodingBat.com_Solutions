package Session12_Recursion1.p20_EndX;

public class EndX {
    public String endX(String str) {
        int length=str.length();
        char charToMove='x';
        int temp=0;
        if(length<2){
            return str;
        }

        while(str.charAt(0)==charToMove && temp<length){
            str=reorder(str);
            temp++;
        }

        return str.substring(0,1)+endX(str.substring(1));
    }
    private String reorder(String str){
        return str.substring(1)+str.substring(0,1);
    }
}
