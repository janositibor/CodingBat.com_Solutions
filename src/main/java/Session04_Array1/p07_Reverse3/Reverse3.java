package Session04_Array1.p07_Reverse3;

public class Reverse3 {
    public int[] reverse3(int[] nums) {
        int length=nums.length;
        int[] output = new int[length];

        for(int i=length-1;i>=0;i--){
            output[length-1-i]=nums[i];
        }
        return output;
    }
}
