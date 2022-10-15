package Session04_Array1.p22_MidThree;

public class MidThree {
    public int[] midThree(int[] nums) {
        int halfLength=(nums.length-1)/2;
        return new int[]{nums[halfLength-1],nums[halfLength],nums[halfLength+1]};
    }
}
