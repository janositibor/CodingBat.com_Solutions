package Session04_Array1.p14_MakeLast;

public class MakeLast {
    public int[] makeLast(int[] nums) {
        int length=nums.length;
        int[] output=new int[2*length];
        output[2*length-1]=nums[length-1];
        return output;
    }
}
