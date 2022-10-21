package Session09_Array2.p24_FizzArray3;

public class FizzArray3 {
    public int[] fizzArray3(int start, int end) {
        int length=end-start;
        int[] output=new int[length];
        for (int i = start; i < end; i++) {
            output[i-start]=i;
        }
        return output;
    }
}
