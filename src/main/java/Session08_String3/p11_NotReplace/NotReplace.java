package Session08_String3.p11_NotReplace;

public class NotReplace {
    public String notReplace(String str) {
        String stringToWorkWith=" "+str+" ";
        String stringToReplace="is";
        String stringToReplaceWith="is not";
        StringBuilder output=new StringBuilder();
        for(int i=1;i<stringToWorkWith.length()-1;i++){
            if(i<=stringToWorkWith.length()-stringToReplace.length() && !Character.isAlphabetic(stringToWorkWith.charAt(i-1)) && !Character.isAlphabetic(stringToWorkWith.charAt(i+stringToReplace.length())) && stringToReplace.equals(stringToWorkWith.substring(i,i+stringToReplace.length()))){
                output.append(stringToReplaceWith);
                i+=stringToReplace.length()-1;
            }
            else{
                output.append(stringToWorkWith.charAt(i));
            }
        }
        return output.toString();
    }
}
