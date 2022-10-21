package Session09_Array2.p33_EvenOdd;

public class EvenOdd {
    public int[] evenOdd(int[] nums) {
        int length=nums.length;
        int indexEven=0;
        int indexOdd=length-1;
        int actual;
        int[] output=new int[length];

        for (int i = 0; i < length; i++) {
            actual=nums[i];
            if(actual%2==0){
                output[indexEven]=actual;
                indexEven++;
            }
            else{
                output[indexOdd]=actual;
                indexOdd--;
            }
        }
        return output;
    }
}
