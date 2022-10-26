package Session12_Recursion1.p18_AllStar;

public class AllStar {
    public String allStar(String str) {
        if(str.length()<2){
        return str;
        }
        return String.valueOf(str.charAt(0))+"*"+allStar(str.substring(1));
    }
}
