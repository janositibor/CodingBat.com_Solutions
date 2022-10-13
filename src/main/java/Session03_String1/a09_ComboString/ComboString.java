package Session03_String1.a09_ComboString;

public class ComboString {
    public String comboString(String a, String b) {
        if(b.length()<a.length()){
            String temp=a;
            a=b;
            b=temp;
        }
        return a+b+a;
    }
}
