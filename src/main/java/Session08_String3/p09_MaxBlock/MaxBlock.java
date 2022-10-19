package Session08_String3.p09_MaxBlock;

public class MaxBlock {
    public int maxBlock(String str) {
        int length=str.length();
        int maxLength=0;
        int actualLength=0;
        char charToCheck;
        char charActual;

        if(length<1){
            return 0;
        }
        charToCheck=str.charAt(0);
        actualLength=1;
        for(int i=1;i<length;i++){
            charActual=str.charAt(i);
            if(charToCheck==charActual){
                actualLength++;
            }
            else{
                maxLength=Math.max(actualLength,maxLength);
                charToCheck=charActual;
                actualLength=1;
            }
        }
        maxLength=Math.max(actualLength,maxLength);
        return maxLength;
    }
}
