package Session12_Recursion1.p19_PairStar;

public class PairStar {
    public String pairStar(String str) {
        String separator="";
        if(str.length()<2){
            return str;
        }
        if(str.charAt(0)==str.charAt(1)){
            separator="*";
        }
        return String.valueOf(str.charAt(0))+"*"+pairStar(str.substring(1));

    }
}
