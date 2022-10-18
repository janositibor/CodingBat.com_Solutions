package Session07_String2.p11_RepeatFront;

public class RepeatFront {
    public String repeatFront(String str, int n) {
        StringBuilder output=new StringBuilder();
        int length;
        for (int i=0;i<n;i++){
            length=n-i;
            output.append(str.substring(0,length));
        }
        return output.toString();
    }
}
