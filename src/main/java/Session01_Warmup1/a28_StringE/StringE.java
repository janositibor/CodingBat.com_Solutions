package Session01_Warmup1.a28_StringE;

public class StringE {
    public boolean stringE(String str) {
        Character referenceCharacter='e';
        int numberOfReferenceCharacter=0;
        for(int i=0;i<str.length();i++){
            if(str.toLowerCase().charAt(i)==referenceCharacter){
                numberOfReferenceCharacter++;
            }
            if (numberOfReferenceCharacter>3){
                return false;
            }
        }
        if (numberOfReferenceCharacter<1){
            return false;
        }
        return true;
    }
}
