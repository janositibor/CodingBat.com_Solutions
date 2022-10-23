package Session11_AP1.p20_MergeTwo;

public class MergeTwo {
    public String[] mergeTwo(String[] a, String[] b, int n) {
        String[] output=new String[n];
        int indexA=0;
        int indexB=0;
        int index=0;
        String stringToInsert;
        while (index<n){
            if(a[indexA].compareTo(b[indexB])<=0){
                stringToInsert=a[indexA];
                indexA++;
            }
            else{
                stringToInsert=b[indexB];
                indexB++;

            }
            if(index==0 || output[index-1].compareTo(stringToInsert)<0){
                output[index]=stringToInsert;
                index++;
            }
        }
        return output;
    }
}
