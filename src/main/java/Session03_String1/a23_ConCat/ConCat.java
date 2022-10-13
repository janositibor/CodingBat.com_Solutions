package Session03_String1.a23_ConCat;

public class ConCat {
    public String conCat(String a, String b) {
        if( a.length()==0 || b.length()==0){
            return a+b;
        }

        String output=a;
        if(a.charAt(a.length()-1)!=b.charAt(0)){
            output+=b;
        }
        else{
            output+=b.substring(1,b.length());
        }
        return output;
    }
}
