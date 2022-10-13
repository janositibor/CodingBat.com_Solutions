package Session03_String1.a24_LastTwo;

public class LastTwo {
    public String lastTwo(String str) {
        int length=str.length();

        if(length<2){
            return str;
        }

        String output=str.substring(0,length-2);
        output+=str.substring(length-1);
        output+=str.substring(length-2,length-1);

        return output;
    }
}
