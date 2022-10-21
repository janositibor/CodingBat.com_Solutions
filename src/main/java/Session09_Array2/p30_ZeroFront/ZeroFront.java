package Session09_Array2.p30_ZeroFront;

public class ZeroFront {
    public int[] zeroFront(int[] nums) {
        int length=nums.length;
        int[] output=new int[length];
        int frontIndex=0;
        int backIndex=length-1;
        int actual;
        for (int i = 0; i < length; i++) {
            actual=nums[i];
            if(actual==0){
                output[frontIndex]=actual;
                frontIndex++;
            }
            else{
                output[backIndex]=actual;
                backIndex--;
            }
        }
        return output;
    }
}
