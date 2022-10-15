package Session04_Array1.p19_MakeMiddle;

public class MakeMiddle {
    public int[] makeMiddle(int[] nums) {
        int halfLength=nums.length/2;
        return new int[]{nums[halfLength-1],nums[halfLength]};
    }
}
