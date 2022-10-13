package Session03_String1.a25_SeeColor;

public class SeeColor {
    public String seeColor(String str) {
        if(str.length()<3){
            return "";
        }
        if("red".equals(str.substring(0,3))){
            return "red";
        }
        if(str.length()<4){
            return "";
        }
        if("blue".equals(str.substring(0,4))){
            return "blue";
        }
        return "";
    }
}
