package Session04_Array1.p23_MaxTriple;

public class MaxTriple {
    public int maxTriple(int[] nums) {
        return Math.max(Math.max(nums[0], nums[(nums.length-1)/2]),nums[nums.length-1]);
    }
}
