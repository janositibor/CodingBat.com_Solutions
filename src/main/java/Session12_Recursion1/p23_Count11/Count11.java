package Session12_Recursion1.p23_Count11;

public class Count11 {
    public int count11(String str) {
        String stringToFind="11";
        int length=str.length();
        if(length<2){
            return 0;
        }
        if(stringToFind.equals(str.substring(0,2))){
            return 1+count11(str.substring(2));
        }
        return count11(str.substring(1));
    }
}
