package Session09_Array2.p12_FizzArray2;

public class FizzArray2 {
    public String[] fizzArray2(int n) {
        String[] output= new String[n];
        for(int i=0;i<n;i++){
            output[i]=String.valueOf(i);
        }
        return output;
    }
}
