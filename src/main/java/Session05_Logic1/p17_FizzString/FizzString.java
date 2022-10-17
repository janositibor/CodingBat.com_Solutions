package Session05_Logic1.p17_FizzString;

public class FizzString {
    public String fizzString(String str) {
        String output=str;
        if(str.charAt(0)=='f'){
            output="Fizz";
        }
        if(str.charAt(str.length()-1)=='b'){
            output=(output==str)?"":output;
            output+="Buzz";
        }
        return output;
    }
}
