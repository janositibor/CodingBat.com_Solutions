package Session12_Recursion1.p25_CountHi2;

public class CountHi2 {
    public int countHi2(String str) {
        int length=str.length();
        if(length<2){
            return 0;
        }
        if(length>=3 && "xhi".equals(str.substring(0,3))){
            return length>3?countHi2(str.substring(3)):0;
        }
        if("hi".equals(str.substring(0,2))){
            return length>2?1+countHi2(str.substring(2)):1;
        }
        return countHi2(str.substring(1));
    }
}
